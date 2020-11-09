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
public class ManipulaDBDireccion implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    private Connection vConexion = null;
    private Statement vStatement = null;
    private ResultSet vResultSet = null;

    /**
     * Constructor para la Clase ManipulaDBDireccion, aqui se conectara a la base de
     * datos.
     */
    public ManipulaDBDireccion()
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
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    //Insetar, eliminar, consultar, modificar

    ////////////////////////Insertar////////////////////////
    
    /**
     * Metodo para poder insertar dentro de la base de datos "Direccion".
     *
     * @param vInsertarDireccion Información que es alamcenada en la clase
     * Direccion.
     * @return true o false, true: La petición fue realizada, false: La petición
     * no fue realizada.
     */
    public boolean mInsertarDBDireccion(Direccion vInsertarDireccion)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("INSERT INTO `direccion`(`clave_domicilio`, `calle`, `localidad`, `codigo_postal`, `ciudad`) VALUES ("+"\""+vInsertarDireccion.getClave_domicilio() + "\", \"" + "\""+vInsertarDireccion.getCalle() + "\", \"" + "\""+vInsertarDireccion.getLocalidad() + "\", \"" + "\""+vInsertarDireccion.getCodigo_postal() + "\", \"" + "\""+vInsertarDireccion.getCiudad() + "\""+")");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    ////////////////////////Consulta General////////////////////////
    
    /**
     * Metodo para sacar toda la información que se encuentra en la tabla
     * "Direccion".
     *
     * @return Un ArrayList<Direccion> donde contendra la información.
     */
    public ArrayList<Direccion> mConsultaGeneralDBDireccion()
    {
        ArrayList<Direccion> vDireccionList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `direccion` WHERE 1");

            while (vResultSet.next())
            {
                int clave_domicilio = ((int) vResultSet.getObject(0));
                String calle = ((String) vResultSet.getObject(0));
                String localidad = ((String) vResultSet.getObject(0));
                int codigo_postal = ((int) vResultSet.getObject(0));
                String ciudad = ((String) vResultSet.getObject(0));


                vDireccionList.add(new Direccion(clave_domicilio, calle, localidad, codigo_postal, ciudad));
            }
            vStatement.close();
            return vDireccionList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ////////////////////////Consulta por variable////////////////////////

    /**
     * Metodo para buscar en "clave_domicilio" en la tabla "Direccion". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Direccion> donde contendra la información
     */
    public ArrayList<Direccion> mConsulta_clave_domicilio_DBDireccion(String vBuscar)
    {
        ArrayList<Direccion> vDireccionList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `direccion` WHERE `clave_domicilio`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                int clave_domicilio = ((int) vResultSet.getObject(1));
                String calle = ((String) vResultSet.getObject(2));
                String localidad = ((String) vResultSet.getObject(3));
                int codigo_postal = ((int) vResultSet.getObject(4));
                String ciudad = ((String) vResultSet.getObject(5));


                vDireccionList.add(new Direccion(clave_domicilio, calle, localidad, codigo_postal, ciudad));
            }
            vStatement.close();
            return vDireccionList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "calle" en la tabla "Direccion". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Direccion> donde contendra la información
     */
    public ArrayList<Direccion> mConsulta_calle_DBDireccion(String vBuscar)
    {
        ArrayList<Direccion> vDireccionList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `direccion` WHERE `calle`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                int clave_domicilio = ((int) vResultSet.getObject(1));
                String calle = ((String) vResultSet.getObject(2));
                String localidad = ((String) vResultSet.getObject(3));
                int codigo_postal = ((int) vResultSet.getObject(4));
                String ciudad = ((String) vResultSet.getObject(5));


                vDireccionList.add(new Direccion(clave_domicilio, calle, localidad, codigo_postal, ciudad));
            }
            vStatement.close();
            return vDireccionList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "localidad" en la tabla "Direccion". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Direccion> donde contendra la información
     */
    public ArrayList<Direccion> mConsulta_localidad_DBDireccion(String vBuscar)
    {
        ArrayList<Direccion> vDireccionList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `direccion` WHERE `localidad`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                int clave_domicilio = ((int) vResultSet.getObject(1));
                String calle = ((String) vResultSet.getObject(2));
                String localidad = ((String) vResultSet.getObject(3));
                int codigo_postal = ((int) vResultSet.getObject(4));
                String ciudad = ((String) vResultSet.getObject(5));


                vDireccionList.add(new Direccion(clave_domicilio, calle, localidad, codigo_postal, ciudad));
            }
            vStatement.close();
            return vDireccionList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "codigo_postal" en la tabla "Direccion". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Direccion> donde contendra la información
     */
    public ArrayList<Direccion> mConsulta_codigo_postal_DBDireccion(String vBuscar)
    {
        ArrayList<Direccion> vDireccionList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `direccion` WHERE `codigo_postal`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                int clave_domicilio = ((int) vResultSet.getObject(1));
                String calle = ((String) vResultSet.getObject(2));
                String localidad = ((String) vResultSet.getObject(3));
                int codigo_postal = ((int) vResultSet.getObject(4));
                String ciudad = ((String) vResultSet.getObject(5));


                vDireccionList.add(new Direccion(clave_domicilio, calle, localidad, codigo_postal, ciudad));
            }
            vStatement.close();
            return vDireccionList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "ciudad" en la tabla "Direccion". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Direccion> donde contendra la información
     */
    public ArrayList<Direccion> mConsulta_ciudad_DBDireccion(String vBuscar)
    {
        ArrayList<Direccion> vDireccionList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `direccion` WHERE `ciudad`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                int clave_domicilio = ((int) vResultSet.getObject(1));
                String calle = ((String) vResultSet.getObject(2));
                String localidad = ((String) vResultSet.getObject(3));
                int codigo_postal = ((int) vResultSet.getObject(4));
                String ciudad = ((String) vResultSet.getObject(5));


                vDireccionList.add(new Direccion(clave_domicilio, calle, localidad, codigo_postal, ciudad));
            }
            vStatement.close();
            return vDireccionList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


    ////////////////////////Eliminar tabla////////////////////////
    
    /**
     * Metodo para eliminar todo el contendio de la tabla "Direccion". ¡Alerta!
     * Esta operación no tiene forma para regresar la información eliminada.
     *
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Todo_DBDireccion()
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `Direccion` WHERE 0");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////Eliminar por variable////////////////////////

    /**
     * Metodo para buscar en "clave_domicilio" de la tabla "Direccion". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_clave_domicilio_DBDireccion(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
                vStatement.executeQuery("DELETE FROM `direccion` WHERE `clave_domicilio`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "calle" de la tabla "Direccion". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_calle_DBDireccion(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
                vStatement.executeQuery("DELETE FROM `direccion` WHERE `calle`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "localidad" de la tabla "Direccion". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_localidad_DBDireccion(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
                vStatement.executeQuery("DELETE FROM `direccion` WHERE `localidad`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "codigo_postal" de la tabla "Direccion". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_codigo_postal_DBDireccion(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
                vStatement.executeQuery("DELETE FROM `direccion` WHERE `codigo_postal`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "ciudad" de la tabla "Direccion". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_ciudad_DBDireccion(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
                vStatement.executeQuery("DELETE FROM `direccion` WHERE `ciudad`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////Modificar por variale////////////////////////

    /**
     * Metodo para modificar en la tabla "Direccion" donde se buscara en "clave_domicilio",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vDireccion Información que es alamcenada en la clase Direccion.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_clave_domicilio_DBDireccion(String vBusqueda, Direccion vDireccion)
    {
        try
        {
            vStatement = vConexion.createStatement();

                vStatement.executeQuery("UPDATE `direccion` SET ``clave_domicilio`=\"" + vDireccion.getClave_domicilio() + "\",`calle`=\"" + vDireccion.getCalle() + "\",`localidad`=\"" + vDireccion.getLocalidad() + "\",`codigo_postal`=\"" + vDireccion.getCodigo_postal() + "\",`ciudad`=\"" + vDireccion.getCiudad() + "\" WHERE `clave_domicilio`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    /**
     * Metodo para modificar en la tabla "Direccion" donde se buscara en "calle",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vDireccion Información que es alamcenada en la clase Direccion.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_calle_DBDireccion(String vBusqueda, Direccion vDireccion)
    {
        try
        {
            vStatement = vConexion.createStatement();

                vStatement.executeQuery("UPDATE `direccion` SET ``clave_domicilio`=\"" + vDireccion.getClave_domicilio() + "\",`calle`=\"" + vDireccion.getCalle() + "\",`localidad`=\"" + vDireccion.getLocalidad() + "\",`codigo_postal`=\"" + vDireccion.getCodigo_postal() + "\",`ciudad`=\"" + vDireccion.getCiudad() + "\" WHERE `calle`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    /**
     * Metodo para modificar en la tabla "Direccion" donde se buscara en "localidad",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vDireccion Información que es alamcenada en la clase Direccion.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_localidad_DBDireccion(String vBusqueda, Direccion vDireccion)
    {
        try
        {
            vStatement = vConexion.createStatement();

                vStatement.executeQuery("UPDATE `direccion` SET ``clave_domicilio`=\"" + vDireccion.getClave_domicilio() + "\",`calle`=\"" + vDireccion.getCalle() + "\",`localidad`=\"" + vDireccion.getLocalidad() + "\",`codigo_postal`=\"" + vDireccion.getCodigo_postal() + "\",`ciudad`=\"" + vDireccion.getCiudad() + "\" WHERE `localidad`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    /**
     * Metodo para modificar en la tabla "Direccion" donde se buscara en "codigo_postal",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vDireccion Información que es alamcenada en la clase Direccion.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_codigo_postal_DBDireccion(String vBusqueda, Direccion vDireccion)
    {
        try
        {
            vStatement = vConexion.createStatement();

                vStatement.executeQuery("UPDATE `direccion` SET ``clave_domicilio`=\"" + vDireccion.getClave_domicilio() + "\",`calle`=\"" + vDireccion.getCalle() + "\",`localidad`=\"" + vDireccion.getLocalidad() + "\",`codigo_postal`=\"" + vDireccion.getCodigo_postal() + "\",`ciudad`=\"" + vDireccion.getCiudad() + "\" WHERE `codigo_postal`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    /**
     * Metodo para modificar en la tabla "Direccion" donde se buscara en "ciudad",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vDireccion Información que es alamcenada en la clase Direccion.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_ciudad_DBDireccion(String vBusqueda, Direccion vDireccion)
    {
        try
        {
            vStatement = vConexion.createStatement();

                vStatement.executeQuery("UPDATE `direccion` SET ``clave_domicilio`=\"" + vDireccion.getClave_domicilio() + "\",`calle`=\"" + vDireccion.getCalle() + "\",`localidad`=\"" + vDireccion.getLocalidad() + "\",`codigo_postal`=\"" + vDireccion.getCodigo_postal() + "\",`ciudad`=\"" + vDireccion.getCiudad() + "\" WHERE `ciudad`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBDireccion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    ////////////////////////////////////////////////////////////////////////////
}

