/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import RSMaterialComponent.RSTableMetroCustom;
import modelo.MetodosBD;

/**
 * @author saipr
 */
public class PrbPaqs
{

    public static void main(String[] args)
    {

        Paqs p1 = new Paqs("Kevin", "Benitez", "Valentin", "hoy", "Saipro", "GG", "4dat", "PENDIENTE", 3, 0.4, .7, 0.9, 250, "Espartanos", "Localidad shida", 50366, "La nose que de que");
        Paqs p2 = new Paqs("Leandro", "Gomez", "Flores", "Antier paps", "Leandro", "Gomez", "Flores", "PENDIENTE", 3, 0.1, 1.0, 3, 100, "Espartanos", "Localidad shida", 50366, "La nose que de que");
        Paqs p3 = new Paqs("David", "Vergara", "Gomez", "no se xd", "Kevin", "Benitez", "Valentin", "PENDIENTE", 3, 0.8, .35, 1.2, 100, "Las carmelitas", "Otzacatipan", 50230, "ToluYorks");
        Paqs p4 = new Paqs("Rubi Esmeralda", "Rosales", "Chavero", "Preguntale al repartidor", "Sandro", "Hernandez", "Del AnGEL", "PENDIENTE", 3, 0.8, .35, 1.2, 100, "Las carmelitas", "Otzacatipan", 50220, "Toluca");
        Paqs p5 = new Paqs("David", "Vergara", "Gomez", "Creo que ayer", "Leandro", "Gomez", "Flores`", "PENDIENTE", 3, 0.8, .35, 1.2, 100, "Las carmelitas", "Otzacatipan", 50221, "Toluca");
        MetodosBD.guardaPaqs(p1);
        MetodosBD.guardaPaqs(p2);
        MetodosBD.guardaPaqs(p3);
        MetodosBD.guardaPaqs(p4);
        MetodosBD.guardaPaqs(p5);
        /*MetodosBD.consultaBD(1, new RSTableMetroCustom()); //Con 1 llamas a los paquetes recibidos
        MetodosBD.consultaBD(2, new RSTableMetroCustom()); //Con 2 llamas a los paquetes enviados
        MetodosBD.eliminaBD(7);*/
        //System.out.println("Siguiente registro == " + (MetodosBD.ultimoRegistro() + 1));
        //Modificaciones
        /*Paqs mdf = new Paqs();
        mdf.setNum_guia(1);
        mdf.setPeso(12);
        mdf.setAltura(13);
        mdf.setAncho(14);
        mdf.setProfundidad(14);
        mdf.setPrecio(15);
        Paqs mdf2 = new Paqs();
        mdf2.setNum_guia(1);
        mdf2.setFchEnt("Modificado");
        MetodosBD.modificacion(mdf2, 2);*/
    }
}
