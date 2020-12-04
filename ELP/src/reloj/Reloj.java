package reloj;

import configuracion.Alertas;
import java.util.Calendar;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * @author saipr
 */
public class Reloj extends Parent
{

    StackPane stackPane = new StackPane();
    Group group = new Group();
    Manecillas segundero = new Manecillas(200, 50, 5, Color.CRIMSON);
    Manecillas minutero = new Manecillas(150, 40, 10, Color.BLACK);
    Manecillas horero = new Manecillas(100, 30, 15, Color.BLACK);
    Calendar calendario;

    public Reloj()
    {
        layoult();
    }

    private void layoult()
    {
        //Inicio Circulo del reloj
        Circle contorno = new Circle(240, Color.BLACK);
        contorno.setEffect(new Lighting());
        //Luna del reloj
        Circle luna = new Circle(220, Color.BLANCHEDALMOND);
        luna.setEffect(new InnerShadow());
        //Textos del reloj --> Creacion
        Text n3 = new Text("3");
        Text n6 = new Text("6");
        Text n9 = new Text("9");
        Text n12 = new Text("12");
        //Formato de los textos del reloj --> Posiciones en el StackPane
        n3.setTranslateX(160);
        n6.setTranslateY(160);
        n9.setTranslateX(-160);
        n12.setTranslateY(-160);
        //Formato de los textos del reloj --> Tipo y tamaño de la fuente en el StackPane
        //Font(String name, int style, int size)
        Font f = Font.font("L:\\Google Drive\\Moda_bisuteria_regalos_Fanny\\Archivos\\NerkoOne-Regular.ttf", FontWeight.BOLD, 30); //A desicion del equipo, preguntar
        n3.setFont(f);
        n6.setFont(f);
        n9.setFont(f);
        n12.setFont(f);
        //Fin Circulo del reloj
        //Inicio Manecillas del reloj
        Rectangle[] tick_horas = new Rectangle[12]; //Necesitamos porque solo son 12 horas
        Rectangle[] tick_minutos = new Rectangle[60]; //Necesitamos porque solo son 60 horas
        //Inicializacion de las manecillas del reloj
        //Indicadores de hora
        /*for (int i = 0; i < 12; i++)
        {
            tick_horas[i] = new Rectangle(20, 5, Color.BLACK);
            //Formato de las manecillas hora--> Posicion
            tick_horas[i].setTranslateX(190 * Math.cos(-(Math.PI / 6) * i));
            tick_horas[i].setTranslateY(190 * Math.sin(-(Math.PI / 6) * i));
            //Formato de las manecillas hora --> Rotacion
            tick_horas[i].setRotate(-(180 / 6) * i);
        }*/
        //Indicadores de los minutos
        int j = 0;
        for (int i = 0; i < 60; i++)
        {
            //Combine los for para optimizar codigo nada mas, el for comentado arriba sirve para poner los indicadores de la hora
            if (i < 12)
            {
                tick_horas[j] = new Rectangle(20, 5, Color.BLACK);
                //Formato de las manecillas hora--> Posicion
                tick_horas[j].setTranslateX(190 * Math.cos(-(Math.PI / 6) * j));
                tick_horas[j].setTranslateY(190 * Math.sin(-(Math.PI / 6) * j));
                //Formato de las manecillas hora --> Rotacion
                tick_horas[j].setRotate(-(180 / 6) * j);
                j++;
            }
            tick_minutos[i] = new Rectangle(10, 5, Color.BLACK);
            //Formato de los indicadores minutos--> Posicion
            tick_minutos[i].setTranslateX(190 * Math.cos(-(Math.PI / 30) * i));
            tick_minutos[i].setTranslateY(190 * Math.sin(-(Math.PI / 30) * i));
            //Formato de las indicadores minutos --> Rotacion
            tick_minutos[i].setRotate(-(180 / 30) * i);
        }

        //Fin Indicadores del reloj
        //Combinacion de los componente
        stackPane.getChildren().addAll(contorno, luna); // --> Para las figuras
        stackPane.getChildren().addAll(n3, n6, n9, n12); // --> Para los textos
        stackPane.getChildren().addAll(tick_horas); // --> Para las indicadores de la hora
        stackPane.getChildren().addAll(tick_minutos); // --> Para las indicadores de los minutos
        //Combinacion de las manecillas y la base del reloj
        group.getChildren().addAll(stackPane);
        group.getChildren().addAll(horero, minutero, segundero);
        group.getChildren().addAll(new Circle(240, 240, 10, Color.CRIMSON));
        group.getChildren().addAll(new Circle(240, 240, 5, Color.BLANCHEDALMOND));
        this.getChildren().add(group);
        this.actualizarReloj();
        this.ejecutarReloj();
    }

    private void actualizarReloj()
    {
        calendario = Calendar.getInstance();
        int h = calendario.get(Calendar.HOUR);
        int m = calendario.get(Calendar.MINUTE);
        int s = calendario.get(Calendar.SECOND);
        if (s % 2 == 0)
        {
            new Alertas().incorrect(3);
        } else
        {
            new Alertas().incorrect(4);
        }
        double angle_seg = 360 / 60 * s;
        double angle_min = 360 / 60 * m + (360.0 / 60) / 60 * s;
        double angle_hor = 360 / 12 * h + (360.0 / 12) / 60 * m + (360.0 / 12) / 3600 * s;
        horero.actualizarManecilla(angle_hor);
        minutero.actualizarManecilla(angle_min);
        segundero.actualizarManecilla(angle_seg);
    }

    public void ejecutarReloj()
    {
        Timeline lineaPrimaria = new Timeline();
        Timeline lineaSecundaria = new Timeline();

        lineaSecundaria.setCycleCount(Timeline.INDEFINITE);

        KeyFrame keyPrimario = new KeyFrame(
                new Duration(1000 - calendario.get(Calendar.MILLISECOND) % 1000), event ->
        {
            actualizarReloj();
            lineaSecundaria.play();
        }
        );

        KeyFrame keySecundario = new KeyFrame(Duration.seconds(1), event ->
        {
            actualizarReloj();
        });
        lineaPrimaria.getKeyFrames().add(keyPrimario);
        lineaSecundaria.getKeyFrames().add(keySecundario);
        lineaPrimaria.play();
    }

}
