/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pDataBasePrisasdb;

import java.util.ArrayList;

/**
 *
 * @author leand
 */
public class PrbPruebas
{
    public static void main(String[] args)
    {
       // Paquetes vPaquetes = new Paquetes("11111", "02/02/20", "*", Float.valueOf("10.5"), Float.valueOf("1.5") , Float.valueOf("5.5"), Float.valueOf("6.6"), Float.valueOf("14"));
        ManipulaDBPaquetes vManipulaPaquete = new ManipulaDBPaquetes();
        ArrayList<Paquetes> vLista = vManipulaPaquete.mConsulta_num_guia_DBPaquetes("11111");
        for (int i = 0; i < vLista.size(); i++)
        {
            System.out.println(vLista.get(i).getFecha_ent());
        }
        /*ArrayList<Paquetes> vLista = vManipulaPaquete.mConsultaGeneralDBPaquetes();
        for (int i = 0; i < vLista.size(); i++)
        {
            System.out.println(vLista.get(i).getFecha_ent());
        }*/
        
        
    }
}
