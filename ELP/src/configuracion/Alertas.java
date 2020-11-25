/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import java.applet.AudioClip;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Benitez
 */
public class Alertas
{

    public void incorrect(int opc)
    {
        try
        {
            AudioClip sonido;
            switch (opc)
            {
                case 1:
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/recursos/error.wav"));
                    sonido.play();
                    Thread.sleep(200);
                    break;
                case 2:
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/recursos/correcto.wav"));
                    sonido.play();
                    Thread.sleep(200);
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Alertas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
