/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutar;

import controlador.administrador_ctrl;

/**
 *
 * @author Kevin Benitez
 */
public class inicioPrisas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*
        Desde aqui indicamos que la primera ventana que se abrira sera la del login
        */
        new administrador_ctrl().iniciosys();
    }

}
