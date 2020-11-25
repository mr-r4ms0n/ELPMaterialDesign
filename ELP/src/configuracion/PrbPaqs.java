/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import modelo.MetodosBD;

/**
 * @author saipr
 */
public class PrbPaqs
{

    public static void main(String[] args)
    {
        Paqs p1 = new Paqs("Sandro", "Hernandez", "Del Angel", "11/11/2020", "Leandro", "Gomez", "Flores", "PENDIENTE", 3, 0.4, .7, 0.9, 250, "Espartanos", "Localidad shida", 50366, "Sanose que de que");
        Paqs p2 = new Paqs("Kevin", "Benitez", "Valentin", "11/11/2020", "Leandro", "Gomez", "Flores", "PENDIENTE", 3, 0.1, 1.0, 3, 100, "Espartanos", "Localidad shida", 50366, "Sanose que de que");
        Paqs p3 = new Paqs("Kevin", "Benitez", "Valentin", "11/12/2020", "Sandro", "Hernandez", "Del AnGEL", "PENDIENTE", 3, 0.8, .35, 1.2, 100, "Las carmelitas", "Otzacatipan", 50220, "Toluca");
        MetodosBD.guardaPaqs(p1);
        MetodosBD.guardaPaqs(p2);
        MetodosBD.guardaPaqs(p3);
        //MetodosBD.consultaBD();
        
    }
}
