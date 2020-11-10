package pDataBasePrisasdb;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tecnologinc
 */
public class ManipulaDBAdmins implements Serializable
{

    private static final long serialVersionUID = 1L;

    private Connection vConexion = null;
    private Statement vStatement = null;
    private ResultSet vResultSet = null;
    //Variables utilizadas para cifrar informacion xd
    private String query = null;
    private PreparedStatement sentencia = null;

    /**
     * Constructor para la Clase ManipulaDBAdmins, aqui se conectara a la base
     * de datos.
     */
    public ManipulaDBAdmins()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            vConexion = DriverManager.getConnection("jdbc:mysql://tecnologinc.ath.cx:3306/prisasdb", "db", "Db1");//localhost/prisasbd
            System.out.println("Si me conecte...");
        } catch (Exception e)
        {
            System.err.println("¡ERROR! No se puede conectar a la base de datos.\n" + e);
        }
    }

    /**
     * En este metodo Se desconectara de la base de datos. Se utiliza cuando la
     * base de datos Ya no se requeira.
     */
    public void mDesconectar()
    {
        try
        {
            vConexion.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    //Insetar, eliminar, consultar, modificar

    ////////////////////////Insertar////////////////////////
    /**
     * Metodo para poder insertar dentro de la base de datos "Admins".
     *
     * @param vInsertarAdmins Información que es alamcenada en la clase Admins.
     * @return true o false, true: La petición fue realizada, false: La petición
     * no fue realizada.
     */
    public boolean mInsertarDBAdmins(Admins vInsertarAdmins)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("INSERT INTO `admins`(`usuario`, `contraseña`) VALUES (" + "\"" + vInsertarAdmins.getUsuario() + "\", \"" + "\"" + vInsertarAdmins.getContraseña() + "\"" + ")");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    ////////////////////////Consulta General////////////////////////
    /**
     * Metodo para sacar toda la información que se encuentra en la tabla
     * "Admins".
     *
     * @return Un ArrayList<Admins> donde contendra la información.
     */
    public ArrayList<Admins> mConsultaGeneralDBAdmins()
    {
        ArrayList<Admins> vAdminsList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `admins` WHERE 1");

            while (vResultSet.next())
            {
                String usuario = ((String) vResultSet.getObject(0));
                String contraseña = ((String) vResultSet.getObject(0));

                vAdminsList.add(new Admins(usuario, contraseña));
            }
            vStatement.close();
            return vAdminsList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ////////////////////////Consulta por variable////////////////////////
    /**
     * Metodo para buscar en "usuario" en la tabla "Admins". La información sera
     * de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Admins> donde contendra la información
     */
    public ArrayList<Admins> mConsulta_usuario_DBAdmins(String vBuscar)
    {
        ArrayList<Admins> vAdminsList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `admins` WHERE `usuario`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String usuario = ((String) vResultSet.getObject(1));
                String contraseña = ((String) vResultSet.getObject(2));

                vAdminsList.add(new Admins(usuario, contraseña));
            }
            vStatement.close();
            return vAdminsList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "contraseña" en la tabla "Admins". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Admins> donde contendra la información
     */
    public ArrayList<Admins> mConsulta_contraseña_DBAdmins(String vBuscar)
    {
        ArrayList<Admins> vAdminsList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `admins` WHERE `contraseña`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String usuario = ((String) vResultSet.getObject(1));
                String contraseña = ((String) vResultSet.getObject(2));

                vAdminsList.add(new Admins(usuario, contraseña));
            }
            vStatement.close();
            return vAdminsList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Método para realizar la consulta de un administrador si su usuario y
     * contraseña existen
     *
     * @param usr
     * @param pss
     * @return
     */
    public ResultSet mConsulta_contraseña_DBAdmins(String usr, String pss)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM admins WHERE usuario = '" + usr + "' AND contraseña = '" + pss + "'");
            System.out.println(vResultSet.getString(1));
            if (vResultSet.next())
            {
                System.out.println("AJA");
                return vResultSet;

            }
            vStatement.close();

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        }
        return null;
    }

    ////////////////////////Eliminar tabla////////////////////////
    /**
     * Metodo para eliminar todo el contendio de la tabla "Admins". ¡Alerta!
     * Esta operación no tiene forma para regresar la información eliminada.
     *
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Todo_DBAdmins()
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `Admins` WHERE 0");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////Eliminar por variable////////////////////////
    /**
     * Metodo para buscar en "usuario" de la tabla "Admins". La eliminación sera
     * de acuerdo a las coincidencia del parametro a buscar, Cada fila donde
     * coincida con el parametro dado sera eliminada. ¡Alerta! Esta operación no
     * tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_usuario_DBAdmins(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `admins` WHERE `usuario`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "contraseña" de la tabla "Admins". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_contraseña_DBAdmins(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `admins` WHERE `contraseña`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////Modificar por variale////////////////////////
    /**
     * Metodo para modificar en la tabla "Admins" donde se buscara en "usuario",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vAdmins Información que es alamcenada en la clase Admins.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_usuario_DBAdmins(String vBusqueda, Admins vAdmins)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `admins` SET ``usuario`=\"" + vAdmins.getUsuario() + "\",`contraseña`=\"" + vAdmins.getContraseña() + "\" WHERE `usuario`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para modificar en la tabla "Admins" donde se buscara en
     * "contraseña", la fila que coincida con la busqueda sera cambiada por la
     * información dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vAdmins Información que es alamcenada en la clase Admins.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_contraseña_DBAdmins(String vBusqueda, Admins vAdmins)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `admins` SET ``usuario`=\"" + vAdmins.getUsuario() + "\",`contraseña`=\"" + vAdmins.getContraseña() + "\" WHERE `contraseña`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBAdmins.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////////////////////////////////////////////////////////
}
