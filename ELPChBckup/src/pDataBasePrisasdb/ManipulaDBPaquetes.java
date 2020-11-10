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
public class ManipulaDBPaquetes implements Serializable
{

    private static final long serialVersionUID = 1L;

    private Connection vConexion = null;
    private Statement vStatement = null;
    private ResultSet vResultSet = null;

    /**
     * Constructor para la Clase ManipulaDBPaquetes, aqui se conectara a la base
     * de datos.
     */
    public ManipulaDBPaquetes()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            vConexion = DriverManager.getConnection("jdbc:mysql://tecnologinc.ath.cx:3306/prisasdb", "db", "Db1");
        } catch (Exception e)
        {
            System.err.println("¡ERROR! No se puede conectar a la base de datos.");
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
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    //Insetar, eliminar, consultar, modificar

    ////////////////////////Insertar////////////////////////
    /**
     * Metodo para poder insertar dentro de la base de datos "Paquetes".
     *
     * @param vInsertarPaquetes Información que es alamcenada en la clase
     * Paquetes.
     * @return true o false, true: La petición fue realizada, false: La petición
     * no fue realizada.
     */
    public boolean mInsertarDBPaquetes(Paquetes vInsertarPaquetes)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("INSERT INTO `paquetes`(`num_guia`, `fecha_recp`, `fecha_ent`, `peso`, `altura`, `ancho`, `profundidad`, `precio`) VALUES (" + "\"" + vInsertarPaquetes.getNum_guia() + "\", \"" + "\"" + vInsertarPaquetes.getFecha_recp() + "\", \"" + "\"" + vInsertarPaquetes.getFecha_ent() + "\", \"" + "\"" + vInsertarPaquetes.getPeso() + "\", \"" + "\"" + vInsertarPaquetes.getAltura() + "\", \"" + "\"" + vInsertarPaquetes.getAncho() + "\", \"" + "\"" + vInsertarPaquetes.getProfundidad() + "\", \"" + "\"" + vInsertarPaquetes.getPrecio() + "\"" + ")");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    ////////////////////////Consulta General////////////////////////
    /**
     * Metodo para sacar toda la información que se encuentra en la tabla
     * "Paquetes".
     *
     * @return Un ArrayList<Paquetes> donde contendra la información.
     */
    public ArrayList<Paquetes> mConsultaGeneralDBPaquetes()
    {
        ArrayList<Paquetes> vPaquetesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `paquetes` WHERE 1");

            while (vResultSet.next())
            {
                String num_guia = ((String) vResultSet.getObject(0));
                String fecha_recp = ((String) vResultSet.getObject(0));
                String fecha_ent = ((String) vResultSet.getObject(0));
                float peso = ((float) vResultSet.getObject(0));
                float altura = ((float) vResultSet.getObject(0));
                float ancho = ((float) vResultSet.getObject(0));
                float profundidad = ((float) vResultSet.getObject(0));
                float precio = ((float) vResultSet.getObject(0));

                vPaquetesList.add(new Paquetes(num_guia, fecha_recp, fecha_ent, peso, altura, ancho, profundidad, precio));
            }
            vStatement.close();
            return vPaquetesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ////////////////////////Consulta por variable////////////////////////
    /**
     * Metodo para buscar en "num_guia" en la tabla "Paquetes". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Paquetes> donde contendra la información
     */
    public ArrayList<Paquetes> mConsulta_num_guia_DBPaquetes(String vBuscar)
    {
        ArrayList<Paquetes> vPaquetesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `paquetes` WHERE `num_guia`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String num_guia = ((String) vResultSet.getObject(1));
                String fecha_recp = ((String) vResultSet.getObject(2));
                String fecha_ent = ((String) vResultSet.getObject(3));
                float peso = ((float) vResultSet.getObject(4));
                float altura = ((float) vResultSet.getObject(5));
                float ancho = ((float) vResultSet.getObject(6));
                float profundidad = ((float) vResultSet.getObject(7));
                float precio = ((float) vResultSet.getObject(8));

                vPaquetesList.add(new Paquetes(num_guia, fecha_recp, fecha_ent, peso, altura, ancho, profundidad, precio));
            }
            vStatement.close();
            return vPaquetesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "fecha_recp" en la tabla "Paquetes". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Paquetes> donde contendra la información
     */
    public ArrayList<Paquetes> mConsulta_fecha_recp_DBPaquetes(String vBuscar)
    {
        ArrayList<Paquetes> vPaquetesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `paquetes` WHERE `fecha_recp`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String num_guia = ((String) vResultSet.getObject(1));
                String fecha_recp = ((String) vResultSet.getObject(2));
                String fecha_ent = ((String) vResultSet.getObject(3));
                float peso = ((float) vResultSet.getObject(4));
                float altura = ((float) vResultSet.getObject(5));
                float ancho = ((float) vResultSet.getObject(6));
                float profundidad = ((float) vResultSet.getObject(7));
                float precio = ((float) vResultSet.getObject(8));

                vPaquetesList.add(new Paquetes(num_guia, fecha_recp, fecha_ent, peso, altura, ancho, profundidad, precio));
            }
            vStatement.close();
            return vPaquetesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "fecha_ent" en la tabla "Paquetes". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Paquetes> donde contendra la información
     */
    public ArrayList<Paquetes> mConsulta_fecha_ent_DBPaquetes(String vBuscar)
    {
        ArrayList<Paquetes> vPaquetesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `paquetes` WHERE `fecha_ent`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String num_guia = ((String) vResultSet.getObject(1));
                String fecha_recp = ((String) vResultSet.getObject(2));
                String fecha_ent = ((String) vResultSet.getObject(3));
                float peso = ((float) vResultSet.getObject(4));
                float altura = ((float) vResultSet.getObject(5));
                float ancho = ((float) vResultSet.getObject(6));
                float profundidad = ((float) vResultSet.getObject(7));
                float precio = ((float) vResultSet.getObject(8));

                vPaquetesList.add(new Paquetes(num_guia, fecha_recp, fecha_ent, peso, altura, ancho, profundidad, precio));
            }
            vStatement.close();
            return vPaquetesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "peso" en la tabla "Paquetes". La información sera
     * de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Paquetes> donde contendra la información
     */
    public ArrayList<Paquetes> mConsulta_peso_DBPaquetes(String vBuscar)
    {
        ArrayList<Paquetes> vPaquetesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `paquetes` WHERE `peso`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String num_guia = ((String) vResultSet.getObject(1));
                String fecha_recp = ((String) vResultSet.getObject(2));
                String fecha_ent = ((String) vResultSet.getObject(3));
                float peso = ((float) vResultSet.getObject(4));
                float altura = ((float) vResultSet.getObject(5));
                float ancho = ((float) vResultSet.getObject(6));
                float profundidad = ((float) vResultSet.getObject(7));
                float precio = ((float) vResultSet.getObject(8));

                vPaquetesList.add(new Paquetes(num_guia, fecha_recp, fecha_ent, peso, altura, ancho, profundidad, precio));
            }
            vStatement.close();
            return vPaquetesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "altura" en la tabla "Paquetes". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Paquetes> donde contendra la información
     */
    public ArrayList<Paquetes> mConsulta_altura_DBPaquetes(String vBuscar)
    {
        ArrayList<Paquetes> vPaquetesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `paquetes` WHERE `altura`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String num_guia = ((String) vResultSet.getObject(1));
                String fecha_recp = ((String) vResultSet.getObject(2));
                String fecha_ent = ((String) vResultSet.getObject(3));
                float peso = ((float) vResultSet.getObject(4));
                float altura = ((float) vResultSet.getObject(5));
                float ancho = ((float) vResultSet.getObject(6));
                float profundidad = ((float) vResultSet.getObject(7));
                float precio = ((float) vResultSet.getObject(8));

                vPaquetesList.add(new Paquetes(num_guia, fecha_recp, fecha_ent, peso, altura, ancho, profundidad, precio));
            }
            vStatement.close();
            return vPaquetesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "ancho" en la tabla "Paquetes". La información sera
     * de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Paquetes> donde contendra la información
     */
    public ArrayList<Paquetes> mConsulta_ancho_DBPaquetes(String vBuscar)
    {
        ArrayList<Paquetes> vPaquetesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `paquetes` WHERE `ancho`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String num_guia = ((String) vResultSet.getObject(1));
                String fecha_recp = ((String) vResultSet.getObject(2));
                String fecha_ent = ((String) vResultSet.getObject(3));
                float peso = ((float) vResultSet.getObject(4));
                float altura = ((float) vResultSet.getObject(5));
                float ancho = ((float) vResultSet.getObject(6));
                float profundidad = ((float) vResultSet.getObject(7));
                float precio = ((float) vResultSet.getObject(8));

                vPaquetesList.add(new Paquetes(num_guia, fecha_recp, fecha_ent, peso, altura, ancho, profundidad, precio));
            }
            vStatement.close();
            return vPaquetesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "profundidad" en la tabla "Paquetes". La
     * información sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Paquetes> donde contendra la información
     */
    public ArrayList<Paquetes> mConsulta_profundidad_DBPaquetes(String vBuscar)
    {
        ArrayList<Paquetes> vPaquetesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `paquetes` WHERE `profundidad`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String num_guia = ((String) vResultSet.getObject(1));
                String fecha_recp = ((String) vResultSet.getObject(2));
                String fecha_ent = ((String) vResultSet.getObject(3));
                float peso = ((float) vResultSet.getObject(4));
                float altura = ((float) vResultSet.getObject(5));
                float ancho = ((float) vResultSet.getObject(6));
                float profundidad = ((float) vResultSet.getObject(7));
                float precio = ((float) vResultSet.getObject(8));

                vPaquetesList.add(new Paquetes(num_guia, fecha_recp, fecha_ent, peso, altura, ancho, profundidad, precio));
            }
            vStatement.close();
            return vPaquetesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Metodo para buscar en "precio" en la tabla "Paquetes". La información
     * sera de acuerdo a las coincidencia del parametro a buscar.
     *
     * @param vBuscar Lo que se queire buscar.
     * @return Un ArrayList<Paquetes> donde contendra la información
     */
    public ArrayList<Paquetes> mConsulta_precio_DBPaquetes(String vBuscar)
    {
        ArrayList<Paquetes> vPaquetesList = new ArrayList<>();

        try
        {
            vStatement = vConexion.createStatement();
            vResultSet = vStatement.executeQuery("SELECT * FROM `paquetes` WHERE `precio`=\"" + vBuscar + "\"");

            while (vResultSet.next())
            {
                String num_guia = ((String) vResultSet.getObject(1));
                String fecha_recp = ((String) vResultSet.getObject(2));
                String fecha_ent = ((String) vResultSet.getObject(3));
                float peso = ((float) vResultSet.getObject(4));
                float altura = ((float) vResultSet.getObject(5));
                float ancho = ((float) vResultSet.getObject(6));
                float profundidad = ((float) vResultSet.getObject(7));
                float precio = ((float) vResultSet.getObject(8));

                vPaquetesList.add(new Paquetes(num_guia, fecha_recp, fecha_ent, peso, altura, ancho, profundidad, precio));
            }
            vStatement.close();
            return vPaquetesList;

        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    ////////////////////////Eliminar tabla////////////////////////
    /**
     * Metodo para eliminar todo el contendio de la tabla "Paquetes". ¡Alerta!
     * Esta operación no tiene forma para regresar la información eliminada.
     *
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Todo_DBPaquetes()
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `Paquetes` WHERE 0");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////Eliminar por variable////////////////////////
    /**
     * Metodo para buscar en "num_guia" de la tabla "Paquetes". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_num_guia_DBPaquetes(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `paquetes` WHERE `num_guia`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "fecha_recp" de la tabla "Paquetes". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_fecha_recp_DBPaquetes(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `paquetes` WHERE `fecha_recp`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "fecha_ent" de la tabla "Paquetes". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_fecha_ent_DBPaquetes(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `paquetes` WHERE `fecha_ent`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "peso" de la tabla "Paquetes". La eliminación sera
     * de acuerdo a las coincidencia del parametro a buscar, Cada fila donde
     * coincida con el parametro dado sera eliminada. ¡Alerta! Esta operación no
     * tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_peso_DBPaquetes(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `paquetes` WHERE `peso`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "altura" de la tabla "Paquetes". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_altura_DBPaquetes(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `paquetes` WHERE `altura`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "ancho" de la tabla "Paquetes". La eliminación sera
     * de acuerdo a las coincidencia del parametro a buscar, Cada fila donde
     * coincida con el parametro dado sera eliminada. ¡Alerta! Esta operación no
     * tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_ancho_DBPaquetes(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `paquetes` WHERE `ancho`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "profundidad" de la tabla "Paquetes". La
     * eliminación sera de acuerdo a las coincidencia del parametro a buscar,
     * Cada fila donde coincida con el parametro dado sera eliminada. ¡Alerta!
     * Esta operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_profundidad_DBPaquetes(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `paquetes` WHERE `profundidad`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para buscar en "precio" de la tabla "Paquetes". La eliminación
     * sera de acuerdo a las coincidencia del parametro a buscar, Cada fila
     * donde coincida con el parametro dado sera eliminada. ¡Alerta! Esta
     * operación no tiene forma para regresar la información eliminada.
     *
     * @param vBuscar Lo que se queire buscar para eliminar la fila.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mEliminar_Por_precio_DBPaquetes(String vBuscar)
    {
        try
        {
            vStatement = vConexion.createStatement();
            vStatement.executeQuery("DELETE FROM `paquetes` WHERE `precio`=\"" + vBuscar + "\"");
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////Modificar por variale////////////////////////
    /**
     * Metodo para modificar en la tabla "Paquetes" donde se buscara en
     * "num_guia", la fila que coincida con la busqueda sera cambiada por la
     * información dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vPaquetes Información que es alamcenada en la clase Paquetes.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_num_guia_DBPaquetes(String vBusqueda, Paquetes vPaquetes)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `paquetes` SET ``num_guia`=\"" + vPaquetes.getNum_guia() + "\",`fecha_recp`=\"" + vPaquetes.getFecha_recp() + "\",`fecha_ent`=\"" + vPaquetes.getFecha_ent() + "\",`peso`=\"" + vPaquetes.getPeso() + "\",`altura`=\"" + vPaquetes.getAltura() + "\",`ancho`=\"" + vPaquetes.getAncho() + "\",`profundidad`=\"" + vPaquetes.getProfundidad() + "\",`precio`=\"" + vPaquetes.getPrecio() + "\" WHERE `num_guia`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para modificar en la tabla "Paquetes" donde se buscara en
     * "fecha_recp", la fila que coincida con la busqueda sera cambiada por la
     * información dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vPaquetes Información que es alamcenada en la clase Paquetes.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_fecha_recp_DBPaquetes(String vBusqueda, Paquetes vPaquetes)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `paquetes` SET ``num_guia`=\"" + vPaquetes.getNum_guia() + "\",`fecha_recp`=\"" + vPaquetes.getFecha_recp() + "\",`fecha_ent`=\"" + vPaquetes.getFecha_ent() + "\",`peso`=\"" + vPaquetes.getPeso() + "\",`altura`=\"" + vPaquetes.getAltura() + "\",`ancho`=\"" + vPaquetes.getAncho() + "\",`profundidad`=\"" + vPaquetes.getProfundidad() + "\",`precio`=\"" + vPaquetes.getPrecio() + "\" WHERE `fecha_recp`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para modificar en la tabla "Paquetes" donde se buscara en
     * "fecha_ent", la fila que coincida con la busqueda sera cambiada por la
     * información dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vPaquetes Información que es alamcenada en la clase Paquetes.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_fecha_ent_DBPaquetes(String vBusqueda, Paquetes vPaquetes)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `paquetes` SET ``num_guia`=\"" + vPaquetes.getNum_guia() + "\",`fecha_recp`=\"" + vPaquetes.getFecha_recp() + "\",`fecha_ent`=\"" + vPaquetes.getFecha_ent() + "\",`peso`=\"" + vPaquetes.getPeso() + "\",`altura`=\"" + vPaquetes.getAltura() + "\",`ancho`=\"" + vPaquetes.getAncho() + "\",`profundidad`=\"" + vPaquetes.getProfundidad() + "\",`precio`=\"" + vPaquetes.getPrecio() + "\" WHERE `fecha_ent`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para modificar en la tabla "Paquetes" donde se buscara en "peso",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vPaquetes Información que es alamcenada en la clase Paquetes.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_peso_DBPaquetes(String vBusqueda, Paquetes vPaquetes)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `paquetes` SET ``num_guia`=\"" + vPaquetes.getNum_guia() + "\",`fecha_recp`=\"" + vPaquetes.getFecha_recp() + "\",`fecha_ent`=\"" + vPaquetes.getFecha_ent() + "\",`peso`=\"" + vPaquetes.getPeso() + "\",`altura`=\"" + vPaquetes.getAltura() + "\",`ancho`=\"" + vPaquetes.getAncho() + "\",`profundidad`=\"" + vPaquetes.getProfundidad() + "\",`precio`=\"" + vPaquetes.getPrecio() + "\" WHERE `peso`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para modificar en la tabla "Paquetes" donde se buscara en
     * "altura", la fila que coincida con la busqueda sera cambiada por la
     * información dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vPaquetes Información que es alamcenada en la clase Paquetes.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_altura_DBPaquetes(String vBusqueda, Paquetes vPaquetes)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `paquetes` SET ``num_guia`=\"" + vPaquetes.getNum_guia() + "\",`fecha_recp`=\"" + vPaquetes.getFecha_recp() + "\",`fecha_ent`=\"" + vPaquetes.getFecha_ent() + "\",`peso`=\"" + vPaquetes.getPeso() + "\",`altura`=\"" + vPaquetes.getAltura() + "\",`ancho`=\"" + vPaquetes.getAncho() + "\",`profundidad`=\"" + vPaquetes.getProfundidad() + "\",`precio`=\"" + vPaquetes.getPrecio() + "\" WHERE `altura`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para modificar en la tabla "Paquetes" donde se buscara en "ancho",
     * la fila que coincida con la busqueda sera cambiada por la información
     * dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vPaquetes Información que es alamcenada en la clase Paquetes.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_ancho_DBPaquetes(String vBusqueda, Paquetes vPaquetes)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `paquetes` SET ``num_guia`=\"" + vPaquetes.getNum_guia() + "\",`fecha_recp`=\"" + vPaquetes.getFecha_recp() + "\",`fecha_ent`=\"" + vPaquetes.getFecha_ent() + "\",`peso`=\"" + vPaquetes.getPeso() + "\",`altura`=\"" + vPaquetes.getAltura() + "\",`ancho`=\"" + vPaquetes.getAncho() + "\",`profundidad`=\"" + vPaquetes.getProfundidad() + "\",`precio`=\"" + vPaquetes.getPrecio() + "\" WHERE `ancho`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para modificar en la tabla "Paquetes" donde se buscara en
     * "profundidad", la fila que coincida con la busqueda sera cambiada por la
     * información dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vPaquetes Información que es alamcenada en la clase Paquetes.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_profundidad_DBPaquetes(String vBusqueda, Paquetes vPaquetes)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `paquetes` SET ``num_guia`=\"" + vPaquetes.getNum_guia() + "\",`fecha_recp`=\"" + vPaquetes.getFecha_recp() + "\",`fecha_ent`=\"" + vPaquetes.getFecha_ent() + "\",`peso`=\"" + vPaquetes.getPeso() + "\",`altura`=\"" + vPaquetes.getAltura() + "\",`ancho`=\"" + vPaquetes.getAncho() + "\",`profundidad`=\"" + vPaquetes.getProfundidad() + "\",`precio`=\"" + vPaquetes.getPrecio() + "\" WHERE `profundidad`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * Metodo para modificar en la tabla "Paquetes" donde se buscara en
     * "precio", la fila que coincida con la busqueda sera cambiada por la
     * información dada.
     *
     * @param vBusqueda Lo que se queire buscar para modificar los datos en la
     * fila.
     * @param vPaquetes Información que es alamcenada en la clase Paquetes.
     * @return true o false, true: La petición fue realizada, false: La
     * peticioón no fue realizada.
     */
    public boolean mModificar_Por_precio_DBPaquetes(String vBusqueda, Paquetes vPaquetes)
    {
        try
        {
            vStatement = vConexion.createStatement();

            vStatement.executeQuery("UPDATE `paquetes` SET ``num_guia`=\"" + vPaquetes.getNum_guia() + "\",`fecha_recp`=\"" + vPaquetes.getFecha_recp() + "\",`fecha_ent`=\"" + vPaquetes.getFecha_ent() + "\",`peso`=\"" + vPaquetes.getPeso() + "\",`altura`=\"" + vPaquetes.getAltura() + "\",`ancho`=\"" + vPaquetes.getAncho() + "\",`profundidad`=\"" + vPaquetes.getProfundidad() + "\",`precio`=\"" + vPaquetes.getPrecio() + "\" WHERE `precio`=" + vBusqueda);
            vStatement.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(ManipulaDBPaquetes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    ////////////////////////////////////////////////////////////////////////////
}
