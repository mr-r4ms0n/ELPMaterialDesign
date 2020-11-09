/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import configuracion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Benitez
 */
public class administrador_mdl
{

    /**
     * Variables encargadas de recibir la conexion de base de datos
     */
    private static Connection conexionBD = null; //Obtiene la conexion
    private static String query = null; //la usaremos para manipular los querys o sentencias SQL
    private static PreparedStatement sentencia = null; //la usaremos para manejar las consultas provenientes de la BD
    private static ResultSet resultado = null;

    public administrador_mdl()
    {
        conexionBD = ConexionBD.getConection();
    }

    /**
     * Método encargado de verificar administradores en la base de dstos
     *
     * @param usuario
     * @param contraseña
     * @return
     */
    public ResultSet getUsuario(String usuario, String contraseña)
    {
        try
        {
            query = "SELECT * FROM admins WHERE usuario = BINARY ? AND contraseña = BINARY ?";
            sentencia = conexionBD.prepareStatement(query);
            sentencia.setString(1, usuario);
            sentencia.setString(2, contraseña);
            ResultSet rs = sentencia.executeQuery();
            return rs;
        } catch (SQLException ex)
        {
            Logger.getLogger(administrador_mdl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
