/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Benitez
 */
public class ConexionBD
{

    public static Connection getConection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
<<<<<<< Updated upstream
            //CONEXION REMOTA = "jdbc:mysql://tecnologinc.ath.cx:3306/prisasdb", "db", "Db1"
            //CONEXION LOCAL =  "jdbc:mysql://localhost/prisasdb", "root", ""
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/prisasdb", "root", ""); 
=======
            //Connection conexion = DriverManager.getConnection("jdbc:mysql://tecnologinc.ath.cx:3306/prisasdb", "db", "Db1"); //jdbc:mysql://tecnologinc.ath.cx:3306/prisasdb", "db", "Db1"
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/elprisas", "root", ""); //jdbc:mysql://tecnologinc.ath.cx:3306/prisasdb", "db", "Db1"
>>>>>>> Stashed changes
            return conexion;
        } catch (ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error al conectar a la BD !!! " + ex);
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
