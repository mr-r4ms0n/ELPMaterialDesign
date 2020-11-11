/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import configuracion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kevin Benitez
 */
public class MetodosBD
{
    private static Connection conexionBD = null; //Obtiene la conexion
    private static String query = null; //la usaremos para manipular los querys o sentencias SQL
    private static PreparedStatement sentencia = null; //la usaremos para manejar las consultas provenientes de la BD
    private static ResultSet resultado = null;

    public static ResultSet getUsuario(String usuario, String contraseña)
    {
        try
        {
            conexionBD = ConexionBD.getConection();
            query = "SELECT * FROM admins WHERE usuario = BINARY ? AND contraseña = BINARY ?";
            sentencia = conexionBD.prepareStatement(query);
            sentencia.setString(1, usuario);
            sentencia.setString(2, contraseña);
            ResultSet rs = sentencia.executeQuery();
            return rs;
        } catch (SQLException ex)
        {
            System.out.println("Error de conexion");
        }
        return null;
    }
    
    public static ResultSet getPaquetesRec()
    {
        try
        {
            System.out.println("Entre por recibidos");
            conexionBD = ConexionBD.getConection();
            query = "SELECT * FROM paquetes ORDER BY num_guia";
            sentencia = conexionBD.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();
            return rs;
        } catch (SQLException e)
        {
            System.out.println("Error al obtener los paquetes");
        }
        return null;
    }
    
    public static ResultSet getPaquetesEnv()
    {
        try
        {
            System.out.println("Entre por envios");
            conexionBD = ConexionBD.getConection();
            query = "SELECT * FROM paquetes WHERE fecha_ent is not null ORDER BY num_guia";
            sentencia = conexionBD.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();
            return rs;
        } catch (SQLException e)
        {
            System.out.println("Error al obtener los paquetes");
        }
        return null;
    }
}
