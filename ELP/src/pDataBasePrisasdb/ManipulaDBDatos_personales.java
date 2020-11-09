package pDataBasePrisasdb;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class ManipulaDBDatos_personales implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    private Connection vConexion = null;
    private Statement vStatement = null;
    private ResultSet vResultSet = null;

    /**
     * Constructor para la Clase ManipulaDBDatos_personales, aqui se conectara a la base de
     * datos.
     */
    public ManipulaDBDatos_personales()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            vConexion = DriverManager.getConnection("jdbc:mysql://tecnologinc.ath.cx:3306/prisasdb", "db", "Db1");
        } catch (Exception e)
        {
            System.err.println("¡ERROR! No se puede conectar a la base de datos.");        }
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
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    //Insetar, eliminar, consultar, modificar

    ////////////////////////Insertar////////////////////////
    
    /**
     * Metodo para poder insertar dentro de la base de datos "Datos_personales".
     *
     * @param vInsertarDatos_personales Información que es alamcenada en la clase
     * Datos_personales.
     * @return true o false, true: La petición fue realizada, false: La petición
     * no fue realizada.
     */
    public boolean mInsertarDBDatos_personales(Datos_personales vInsertarDatos_personales)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("INSERT INTO `datos_personales`(`IdNombre`, `nombre`, `ApeP`, `ApeM`) VALUES ("+"\""+vInsertarDatos_personales.getIdNombre() + "\", \"" + "\""+vInsertarDatos_personales.getNombre() + "\", \"" + "\""+vInsertarDatos_personales.getApeP() + "\", \"" + "\""+vInsertarDatos_personales.getApeM() + "\""+")");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    ////////////////////////Consulta General////////////////////////
    
    /**
     * Metodo para sacar toda la información que se encuentra en la tabla
     * "Datos_personales".
     *
     * @return Un ArrayList<Datos_personales> donde contendra la información.
     */
    public ArrayList<Datos_personales> mConsultaGeneralDBDatos_personales()
    {
        ArrayList<Datos_personales> vDatos_personalesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `datos_personales` WHERE 1");

            while (vResultSet.next())
            {
                int IdNombre = ((int) vResultSet.getObject(0));
                String nombre = ((String) vResultSet.getObject(0));
                String ApeP = ((String) vResultSet.getObject(0));
                String ApeM = ((String) vResultSet.getObject(0));


                vDatos_personalesList.add(new Datos_personales(IdNombre, nombre, ApeP, ApeM));
            }
            vStatement.close();
            return vDatos_personalesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ////////////////////////Consulta por variable////////////////////////

    /**
     * Metodo para buscar en "IdNombre" en la tabla "Datos_personales". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Datos_personales> donde contendra la información
     */
    public ArrayList<Datos_personales> mConsulta_IdNombre_DBDatos_personales(String vBuscar)
    {
        ArrayList<Datos_personales> vDatos_personalesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `datos_personales` WHERE `IdNombre`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                int IdNombre = ((int) vResultSet.getObject(1));
                String nombre = ((String) vResultSet.getObject(2));
                String ApeP = ((String) vResultSet.getObject(3));
                String ApeM = ((String) vResultSet.getObject(4));


                vDatos_personalesList.add(new Datos_personales(IdNombre, nombre, ApeP, ApeM));
            }
            vStatement.close();
            return vDatos_personalesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "nombre" en la tabla "Datos_personales". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Datos_personales> donde contendra la información
     */
    public ArrayList<Datos_personales> mConsulta_nombre_DBDatos_personales(String vBuscar)
    {
        ArrayList<Datos_personales> vDatos_personalesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `datos_personales` WHERE `nombre`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                int IdNombre = ((int) vResultSet.getObject(1));
                String nombre = ((String) vResultSet.getObject(2));
                String ApeP = ((String) vResultSet.getObject(3));
                String ApeM = ((String) vResultSet.getObject(4));


                vDatos_personalesList.add(new Datos_personales(IdNombre, nombre, ApeP, ApeM));
            }
            vStatement.close();
            return vDatos_personalesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "ApeP" en la tabla "Datos_personales". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Datos_personales> donde contendra la información
     */
    public ArrayList<Datos_personales> mConsulta_ApeP_DBDatos_personales(String vBuscar)
    {
        ArrayList<Datos_personales> vDatos_personalesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `datos_personales` WHERE `ApeP`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                int IdNombre = ((int) vResultSet.getObject(1));
                String nombre = ((String) vResultSet.getObject(2));
                String ApeP = ((String) vResultSet.getObject(3));
                String ApeM = ((String) vResultSet.getObject(4));


                vDatos_personalesList.add(new Datos_personales(IdNombre, nombre, ApeP, ApeM));
            }
            vStatement.close();
            return vDatos_personalesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "ApeM" en la tabla "Datos_personales". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Datos_personales> donde contendra la información
     */
    public ArrayList<Datos_personales> mConsulta_ApeM_DBDatos_personales(String vBuscar)
    {
        ArrayList<Datos_personales> vDatos_personalesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `datos_personales` WHERE `ApeM`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                int IdNombre = ((int) vResultSet.getObject(1));
                String nombre = ((String) vResultSet.getObject(2));
                String ApeP = ((String) vResultSet.getObject(3));
                String ApeM = ((String) vResultSet.getObject(4));


                vDatos_personalesList.add(new Datos_personales(IdNombre, nombre, ApeP, ApeM));
            }
            vStatement.close();
            return vDatos_personalesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


    ////////////////////////Eliminar tabla////////////////////////
    
    /**
     * Metodo para eliminar todo el contendio de la tabla "Datos_personales". ¡Alerta!
     * Esta operación no tiene forma para regresar la información eliminada.
     *
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Todo_DBDatos_personales()
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `Datos_personales` WHERE 0");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////Eliminar por variable////////////////////////

    /**
     * Metodo para buscar en "IdNombre" de la tabla "Datos_personales". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_IdNombre_DBDatos_personales(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
                vStatement.executeQuery("DELETE FROM `datos_personales` WHERE `IdNombre`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "nombre" de la tabla "Datos_personales". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_nombre_DBDatos_personales(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
                vStatement.executeQuery("DELETE FROM `datos_personales` WHERE `nombre`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "ApeP" de la tabla "Datos_personales". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_ApeP_DBDatos_personales(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
                vStatement.executeQuery("DELETE FROM `datos_personales` WHERE `ApeP`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "ApeM" de la tabla "Datos_personales". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_ApeM_DBDatos_personales(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
                vStatement.executeQuery("DELETE FROM `datos_personales` WHERE `ApeM`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////Modificar por variale////////////////////////

    /**
     * Metodo para modificar en la tabla "Datos_personales" donde se buscara en "IdNombre",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vDatos_personales Información que es alamcenada en la clase Datos_personales.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_IdNombre_DBDatos_personales(String vBusqueda, Datos_personales vDatos_personales)
    {
        try
        {
            vStatement = vConexion.createStatement();

                vStatement.executeQuery("UPDATE `datos_personales` SET ``IdNombre`=\"" + vDatos_personales.getIdNombre() + "\",`nombre`=\"" + vDatos_personales.getNombre() + "\",`ApeP`=\"" + vDatos_personales.getApeP() + "\",`ApeM`=\"" + vDatos_personales.getApeM() + "\" WHERE `IdNombre`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    /**
     * Metodo para modificar en la tabla "Datos_personales" donde se buscara en "nombre",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vDatos_personales Información que es alamcenada en la clase Datos_personales.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_nombre_DBDatos_personales(String vBusqueda, Datos_personales vDatos_personales)
    {
        try
        {
            vStatement = vConexion.createStatement();

                vStatement.executeQuery("UPDATE `datos_personales` SET ``IdNombre`=\"" + vDatos_personales.getIdNombre() + "\",`nombre`=\"" + vDatos_personales.getNombre() + "\",`ApeP`=\"" + vDatos_personales.getApeP() + "\",`ApeM`=\"" + vDatos_personales.getApeM() + "\" WHERE `nombre`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    /**
     * Metodo para modificar en la tabla "Datos_personales" donde se buscara en "ApeP",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vDatos_personales Información que es alamcenada en la clase Datos_personales.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_ApeP_DBDatos_personales(String vBusqueda, Datos_personales vDatos_personales)
    {
        try
        {
            vStatement = vConexion.createStatement();

                vStatement.executeQuery("UPDATE `datos_personales` SET ``IdNombre`=\"" + vDatos_personales.getIdNombre() + "\",`nombre`=\"" + vDatos_personales.getNombre() + "\",`ApeP`=\"" + vDatos_personales.getApeP() + "\",`ApeM`=\"" + vDatos_personales.getApeM() + "\" WHERE `ApeP`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    /**
     * Metodo para modificar en la tabla "Datos_personales" donde se buscara en "ApeM",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vDatos_personales Información que es alamcenada en la clase Datos_personales.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_ApeM_DBDatos_personales(String vBusqueda, Datos_personales vDatos_personales)
    {
        try
        {
            vStatement = vConexion.createStatement();

                vStatement.executeQuery("UPDATE `datos_personales` SET ``IdNombre`=\"" + vDatos_personales.getIdNombre() + "\",`nombre`=\"" + vDatos_personales.getNombre() + "\",`ApeP`=\"" + vDatos_personales.getApeP() + "\",`ApeM`=\"" + vDatos_personales.getApeM() + "\" WHERE `ApeM`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDatos_personales.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    ////////////////////////////////////////////////////////////////////////////
}

