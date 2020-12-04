package reloj;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

/**
 * @author saipr
 */
public class Manecillas extends Rectangle
{

    Rotate rotate = new Rotate(0, 240, 240);

    public Manecillas(double body, double tail, double width, Paint fill)
    {
        super(width, body + tail, fill);
        this.setX(240 - (width / 2));
        this.setY(240 - body);
        this.setEffect(new DropShadow());
        this.setArcHeight(width);
        this.setArcWidth(width);
        this.getTransforms().add(rotate);
    }

    public void actualizarManecilla(double angle)
    {
        rotate.setAngle(angle);
    }

}
