/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import java.applet.AudioClip;
import PArchivos.CArchivo_Audio_WAV;
import java.io.File;

/**
 *
 * @author Kevin Benitez
 */
public class Alertas
{
    public static boolean vPanelPrincipal=true;

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
                case 3:
                    if (vPanelPrincipal)
                    {
                        CArchivo_Audio_WAV.reproducirSonido("Archivos\\tic.wav");
                    }
                    break;
                case 4:
                    if (vPanelPrincipal)
                    {
                        CArchivo_Audio_WAV.reproducirSonido("Archivos\\tac.wav");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (InterruptedException e)
        {
            System.out.println("Error al producir sonidos");
        }

    }
}
