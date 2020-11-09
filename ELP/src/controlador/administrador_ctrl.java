/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.administrador_mdl;
import vista.LoginAdmin;

/**
 *
 * @author Kevin Benitez
 */
public class administrador_ctrl
{

    private administrador_mdl modelo_admin;

    public administrador_ctrl()
    {
        modelo_admin = new administrador_mdl();
    }
    
    public void iniciosys()
    {
        new LoginAdmin().setVisible(true);
    }
    
    public boolean checkInicio(String usr,String ctr)
    {
        try
        {
            ResultSet rs = modelo_admin.getUsuario(usr, ctr);
            if (rs.next())            
            {
                if (rs.getString(2).equals(ctr))
                {
                    return true;
                }
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(administrador_ctrl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
