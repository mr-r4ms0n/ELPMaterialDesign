package configuracion;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 * @author saipr
 */
public class MetodosBD
{

    private static Connection conexion;
    private static PreparedStatement sentencia;
    private static ResultSet resultado;

    /**
     * Este metodo sirve para extraer todos los paquetes de la tabla paquetes
     *
     * @return tabla con todos los paquetes
     */
    public static DefaultTableModel consultaBD()
    {
        DefaultTableModel mdl = null;
        try
        {
            conexion = ConexionBD.getConection();
            String consulta = "SELECT * FROM paquetes";
            //mdl = (DefaultTableModel) Menu.tbl.getMode();
            sentencia = conexion.prepareStatement(consulta);
            resultado = sentencia.executeQuery();
            //mdl.setRowCount(0);//Por si las moscas la vacio

            if (resultado != null)
            {
                System.out.println("Paquetes");
                while (resultado.next())
                {
                    //Extraigo los identificadores de las ID correspondientes
                    int idEmi = resultado.getInt("id_nombre_emisor");
                    int idRec = resultado.getInt("id_nombre_receptor");
                    int idDir = resultado.getInt("id_direccion");

                    //Lleno la tabla
                    /*mdl.addRow(new Object[]
                    {
                        resultado.getString("num_guia"), obtenerDatos(1, idEmi), resultado.getString("fecha_recp"), obtenerDatos(1, idRec), obtenerDatos(1, idDir), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                    });*/
                    System.out.println("\n" + resultado.getString("num_guia") + " " + obtenerDatos(1, idEmi) + " " + resultado.getString("fecha_recp") + " " + obtenerDatos(1, idRec) + " " + obtenerDatos(1, idDir) + " " + resultado.getString("fecha_ent") + " " + resultado.getDouble("peso") + " " + resultado.getDouble("altura") + " " + resultado.getDouble("ancho") + " " + resultado.getDouble("profundidad") + " " + resultado.getDouble("precio"));
                }
            }
            conexion.close();
        } catch (Exception e)
        {
        }
        return mdl;
    }

    /**
     * opc == 1 nombre opc == 2 direccion
     *
     * @param opc Selecciona laa tabla que quiere
     * @param id Busca el la PK en la tabla escogido en OPC
     * @return Cadena con el nombre o la direccion segun opc, si hay algun error
     * te retornara una Cadena de error
     */
    public static String obtenerDatos(int opc, int id)
    {
        String s = "Error";
        String consulta;
        PreparedStatement sent;
        ResultSet res;
        Connection con;
        try
        {
            con = ConexionBD.getConection();
            switch (opc)
            {
                case 1: //Caso 1, te retorna un nombre
                    s = "Error al extraer el nombre";
                    consulta = "SELECT nombre,apeP,apeM FROM datos_personales WHERE id_datos_personales = ?";
                    sent = con.prepareStatement(consulta);
                    sent.setInt(1, id);
                    res = sent.executeQuery();
                    res.next();
                    s = res.getString("nombre") + " " + res.getString("apeP") + " " + res.getString("apeM");
                    break;
                case 2: //Caso 2, Te retornara una direccion
                    s = "Error al extraer la direccion";
                    consulta = "SELECT calle,localidad,codigo_postal,ciudad FROM direccion WHERE clave_domicilio = ?";
                    sentencia = con.prepareStatement(consulta);
                    sentencia.setInt(1, id);
                    res = sentencia.executeQuery();
                    s = res.getString("ciudad") + ", " + res.getString("localidad") + ", " + res.getString("calle") + " " + res.getInt("codigo_postal");
                    break;
            }
            con.close();
            return s;
        } catch (Exception e)
        {
            System.out.println("Obtener datos Error!!! " + e);
            try
            {
                conexion.close();
            } catch (Exception ec)
            {
            }
        }
        return s;
    }

    /**
     * Recorre las direcciones y si encuentra la direccion en la tabla te
     * retornara su PK
     *
     * @param calle
     * @param localidad
     * @param cp
     * @param ciudad
     * @return int, con la PK de la direccion o un -1 si no existe
     */
    public static int existeDireccion(String calle, String localidad, int cp, String ciudad)
    {
        int id = -1;
        try
        {
            conexion = ConexionBD.getConection();
            sentencia = conexion.prepareStatement("SELECT * FROM direccion");
            resultado = sentencia.executeQuery();
            while (resultado.next())
            {
                if (resultado.getString("calle").toUpperCase().equals(calle.toUpperCase())
                        && resultado.getString("localidad").toUpperCase().equals(localidad.toUpperCase())
                        && resultado.getInt("codigo_postal") == cp
                        && resultado.getString("ciudad").toUpperCase().equals(ciudad.toUpperCase())) //Se cumple, entonces existe la direccion, solo hay que extraerla 
                {
                    id = resultado.getInt("clave_domicilio"); //como existe, guardo el numero de registro al que apunta
                    break; //Salgo del ciclo
                }
            }
            conexion.close();
        } catch (SQLException e)
        {
            System.out.println("Existe Direccion Error!!! " + e);
            try
            {
                conexion.close();
            } catch (SQLException ex)
            {
            }
        }
        return id;
    }

    /**
     * Guarda exclusivamente las direcciones en la tabla direcciones
     *
     * @param calle
     * @param localidad
     * @param cp
     * @param ciudad
     */
    public static void guardaDireccion(String calle, String localidad, int cp, String ciudad)
    {
        try
        {
            conexion = ConexionBD.getConection();
            String consulta = "INSERT INTO direccion (calle,localidad,codigo_postal,ciudad) VALUES (?,?,?,?)";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, calle);
            sentencia.setString(2, localidad);
            sentencia.setInt(3, cp);
            sentencia.setString(4, ciudad);
            int i = sentencia.executeUpdate();
            if (i > 0)
            {
                System.out.println("Se ha agregado la direccion:\n \"" + ciudad + " " + localidad + " " + calle + " " + cp + "\" en la tabla direcciones");
            } else
            {
                System.out.println("NO se ha podido agregar la direccion:\n \"" + ciudad + " " + localidad + " " + calle + " " + cp + "\" en la tabla direcciones");
            }
            conexion.close();
        } catch (Exception e)
        {
            System.out.println("Guarda Direccion Error!!! " + e);
            try
            {
                conexion.close();
            } catch (SQLException ex)
            {
            }
        }
    }

    /**
     * Recorre las celdas de la tabla datos_personales para retornarte la PK que
     * tiene el nombre
     *
     * @param nomb Nombre de la presona que quieres encontrar
     * @param apeP Apellido paterno de la presona que quieres encontrar
     * @param apeM Apellido maternode la presona que quieres encontrar
     * @return int, el cual es la PK que apunta el nombre que has mandado en los
     * parametros, si no existe te retornara -1
     */
    public static int existeNombre(String nomb, String apeP, String apeM)
    {
        int id = -1;
        try
        {
            conexion = ConexionBD.getConection();
            sentencia = conexion.prepareStatement("SELECT * FROM datos_personales");
            resultado = sentencia.executeQuery();
            while (resultado.next())
            {
                if (resultado.getString("nombre").toUpperCase().equals(nomb.toUpperCase())
                        && resultado.getString("apeP").toUpperCase().equals(apeP.toUpperCase())
                        && resultado.getString("apeP").toUpperCase().equals(apeP.toUpperCase())) //Se cumple, entonces existe ya el nombre y apellidos 
                {
                    id = resultado.getInt("id_datos_personales"); //como existe, guardo el numero de registro al que apunta
                    break; //Salgo del ciclo
                }
            }
            conexion.close();
        } catch (SQLException e)
        {
            System.out.println("Existe Nombre Error!!! " + e);
            try
            {
                conexion.close();
            } catch (SQLException ex)
            {
            }
        }
        return id;
    }

    /**
     * Guarda exclusivamente nombres en la tabla datos_personales, es un metodo
     * auxiliar en guardaPaqs() debido al caso de que no exista el noombre del
     * emisor o receptor
     *
     * @param nombre Nombre de la persona
     * @param apeP Apellido paterno de la persona
     * @param apeM Apellido materno de la persona
     */
    public static void guardaNombres(String nombre, String apeP, String apeM)
    {
        try
        {
            conexion = ConexionBD.getConection();
            String consulta = "INSERT INTO datos_personales (nombre,apeP,apeM) VALUES (?,?,?)";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            sentencia.setString(2, apeP);
            sentencia.setString(3, apeM);
            int i = sentencia.executeUpdate();
            if (i > 0)
            {
                System.out.println("Se ha agregado a \"" + nombre + " " + apeP + " " + apeM + "\" en la tabla datos_personales");
            } else
            {
                System.out.println("No se podido agregar a \"" + nombre + " " + apeP + " " + apeM + "\" en la tabla datos_personales");
            }
            conexion.close();
        } catch (Exception e)
        {
            System.out.println("Guarda Nombres Error!!! " + e);
            try
            {
                conexion.close();
            } catch (SQLException ex)
            {
            }
        }
    }

    /**
     * Guarda la informacion de los paquetes, se requiere un objeto de tipo
     * paquete que contenga toda la informacion que se sube a la base de datos
     * desde nombre del emisor y direccion hasta direccion.
     *
     * @param obj Objeto de tipo Paqs, asegurate que no tenga atributos en NULL
     */
    public static void guardaPaqs(Paqs obj)
    {
        try
        {
            //Pte1 Existe el nombre del emisor en la BD???
            int idENombre = existeNombre(obj.geteNombre(), obj.geteApP(), obj.geteApM()); //Guarda el id del nombre del emisor
            if (idENombre == -1) //Si es -1 entonces no existe el nombre, asi que hay que registrarlo
            {
                guardaNombres(obj.geteNombre(), obj.geteApP(), obj.geteApM());
                idENombre = existeNombre(obj.geteNombre(), obj.geteApP(), obj.geteApM());
            }
            //Pte2 Existe el nombre del receptor en la BD??
            int idRNombre = existeNombre(obj.getrNombre(), obj.getrApP(), obj.getrApM()); //Guarda el id del nombre del receptor
            if (idRNombre == -1) //Si es -1 entonces no existe el nombre, asi que hay que registrarlo
            {
                guardaNombres(obj.getrNombre(), obj.getrApP(), obj.getrApM());
                idRNombre = existeNombre(obj.getrNombre(), obj.getrApP(), obj.getrApM());
            }
            //Pte3 Existe la direccion del receptor en la BD??
            int idDireccion = existeDireccion(obj.getCalle(), obj.getLocalidad(), obj.getCp(), obj.getCiudad());
            if (idDireccion == -1) //Si es -1 entonces no existe el nombre, asi que hay que registrarlo
            {
                guardaDireccion(obj.getCalle(), obj.getLocalidad(), obj.getCp(), obj.getCiudad());
                idDireccion = existeDireccion(obj.getCalle(), obj.getLocalidad(), obj.getCp(), obj.getCiudad());
            }
            //Pte4 Ya tenemos los ID de los nombres y la direccion, ahora si procedemos a guar el paquete
            conexion = ConexionBD.getConection();
            String consulta = "INSERT INTO paquetes "
                    + "(id_nombre_emisor,fecha_recp,id_nombre_receptor,id_direccion,fecha_ent, peso, altura, ancho, profundidad, precio) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
            sentencia = conexion.prepareStatement(consulta);
            sentencia.setInt(1, idENombre);
            sentencia.setString(2, obj.getFchRecp());
            sentencia.setInt(3, idRNombre);
            sentencia.setInt(4, idDireccion);
            sentencia.setString(5, obj.getFchEnt());
            sentencia.setDouble(6, obj.getPeso());
            sentencia.setDouble(7, obj.getAltura());
            sentencia.setDouble(8, obj.getAncho());
            sentencia.setDouble(9, obj.getProfundidad());
            sentencia.setDouble(10, obj.getPrecio());
            int i = sentencia.executeUpdate();
            if (i > 0)
            {
                System.out.println("Datos del paquete guardados correctamente.");
            } else
            {
                System.out.println("Datos del paquete NO SE HAN GUARDADO.");
            }
            conexion.close();
        } catch (HeadlessException | SQLException e)
        {
            System.out.println("Guarda Paqs Error!!! " + e);
        } finally
        {
            try
            {
                conexion.close();
            } catch (SQLException e)
            {
            }
        }
    }
}
