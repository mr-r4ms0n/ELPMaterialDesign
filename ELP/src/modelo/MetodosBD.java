/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import RSMaterialComponent.RSTableMetroCustom;
import configuracion.ConexionBD;
import configuracion.Paqs;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

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

    /**
     * Recibe objeto de tipo Paqs de para realizar la modificacion en la base de
     * datos, OBJ ya debe tener dentro del numero de guia
     *
     * @param obj Contiene todos los datos que se van modificar
     * @param opc OPC 1 == Modifica un paquete recibido que aun no es enviado,
     * esta opcion se ejecuta al seleccionar la fila que quieres modificar y
     * rellenar el formulario con las correspodientes modificaciones............
     * OPC 2 == Ejecuta unicamente la modificacion de la fecha de entrega, esta
     * opcion se ejecuta cuando seleccionas un paquete y presionas el boton de
     * enviar
     */
    public static void modificacion(Paqs obj, int opc)
    {
        try
        {
            conexionBD = ConexionBD.getConection();
            switch (opc)
            {
                case 1: //Caso de modificar un paquete recibido
                    //1ero modifico los datos del paquete de la tabla paquetes
                    sentencia = conexionBD.prepareStatement("UPDATE paquetes SET peso = ?, altura = ?, ancho = ?, profundidad = ?, precio = ? WHERE num_guia = ?");
                    sentencia.setDouble(1, obj.getPeso());
                    sentencia.setDouble(2, obj.getAltura());
                    sentencia.setDouble(3, obj.getAncho());
                    sentencia.setDouble(4, obj.getProfundidad());
                    sentencia.setDouble(5, obj.getPrecio());
                    sentencia.setInt(6, obj.getNum_guia());
                    int f = sentencia.executeUpdate();
                    if (f > 0)
                    {
                        System.out.println("Modificaciones del paquete guardados con exito");
                    } else
                    {
                        System.out.println("Modificaciones del paquete NO REALIZADOS");
                    }
                    //2do modificacion de los nombres del paquete

                    break;
                case 2: //Caso de enviar un paquete recibido
                    sentencia = conexionBD.prepareStatement("UPDATE paquetes SET fecha_ent = ? WHERE num_guia = ?");
                    sentencia.setString(1, obj.getFchEnt());
                    sentencia.setInt(2, obj.getNum_guia());
                    int ff = sentencia.executeUpdate();
                    if (ff > 0)
                    {
                        System.out.println("Paquete enviado con exito");
                    } else
                    {
                        System.out.println("NO se pudo ENVIAR el paquete");
                    }
                    break;
            }
        } catch (Exception e)
        {
        } finally
        {
            try
            {
                conexionBD.close();
            } catch (Exception e)
            {
            }
        }
    }

    public static int ultimoRegistro()
    {
        int n = 0;

        try
        {
            conexionBD = ConexionBD.getConection();
            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes ORDER BY num_guia DESC LIMIT 1");
            resultado = sentencia.executeQuery();
            if (resultado.next())
            {
                n = resultado.getInt("num_guia");
            } else
            {
                n = -1;
            }
        } catch (SQLException e)
        {
            System.out.println("Error al conectar a BD vehiculos incorporados " + e);
        } finally
        {
            try
            {
                conexionBD.close();
            } catch (Exception e)
            {
            }
        }
        return n;
    }

    public static void eliminaBD(int num_guia)
    {
        try
        {
            conexionBD = ConexionBD.getConection();
            sentencia = conexionBD.prepareStatement("DELETE FROM paquetes WHERE num_guia = ?");
            sentencia.setInt(1, num_guia);
            sentencia.executeUpdate();
            conexionBD.close();
        } catch (Exception e)
        {
            System.out.println("Error al eliminar el pauete con el numero de guia: \"" + num_guia + "\"");
            try
            {
                conexionBD.close();
            } catch (Exception ex)
            {
            }
        }
    }

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

    /**
     * Retorna una tabla con los resultados de la consulta SQL
     *
     * @param busq Cadena de texto a buscar
     * @param tipo tipo de busqueda segun el combo box que escojas
     * @param tbl Tabla en la que deseas buscar 1 = recibidos 2 = enviados
     * @param table El modelo de la tabla que se desea llenar
     */
    public static void busqBD(String busq, int tipo, int tbl, RSTableMetroCustom table)
    {
        System.out.println("TIPO: " + tipo);
        DefaultTableModel mdl = null;
        mdl = (DefaultTableModel) table.getModel();
        while (mdl.getRowCount() > 0)
        {
            mdl.setRowCount(0);//Por si las moscas la vacio
        }
        try
        {
            conexionBD = ConexionBD.getConection();
            switch (tbl) //tabla de recibidos o tabla de enviados
            {
                case 1: //Tabla recibidios
                    switch (tipo)
                    {
                        case 1: //numero de guia 
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent = 'PENDIENTE' AND num_guia LIKE ?");
                            sentencia.setString(1, "%" + busq + "%");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    System.out.println("SI ENTRO A BUSCAR PAPS");
                                    System.out.println("NumGuia == " + resultado.getInt("num_guia") + " Busq == " + busq);
                                    mdl.addRow(new Object[]
                                    {
                                        resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                    });
                                }
                            }
                            break;
                        case 2://nombre del emisor
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent = 'PENDIENTE'");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    String nomb = MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")).toUpperCase();
                                    if (nomb.contains(busq.toUpperCase()))
                                    {
                                        mdl.addRow(new Object[]
                                        {
                                            resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                        });
                                    }
                                }
                            }
                            break;
                        case 3: //nombre del receptor
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent = 'PENDIENTE'");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    String nomb = MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")).toUpperCase();
                                    if (nomb.contains(busq.toUpperCase()))
                                    {
                                        mdl.addRow(new Object[]
                                        {
                                            resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                        });
                                    }
                                }
                            }
                            break;
                        case 4: //Direccion (Calle,Localidad,Ciudad,Codigo Postal)
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent = 'PENDIENTE'");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    String dir = MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")).toUpperCase();
                                    System.out.println("DIRECCION EN EL 4: " + dir);
                                    if (dir.contains(busq.toUpperCase()))
                                    {
                                        mdl.addRow(new Object[]
                                        {
                                            resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                        });
                                    }
                                }
                            }
                            break;

                        case 5: //Fecha de recibido
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent = 'PENDIENTE' AND fecha_recp LIKE ?");
                            sentencia.setString(1, "%" + busq + "%");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    mdl.addRow(new Object[]
                                    {
                                        resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                    });
                                }
                            }
                            break;
                    }
                    break;
                case 2: //Tabla enviados
                    switch (tipo)
                    {
                        case 1: //numero de guia 
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent != 'PENDIENTE' AND num_guia LIKE ?");
                            sentencia.setString(1, "%" + busq + "%");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    System.out.println("SI ENTRO A BUSCAR PAPS");
                                    System.out.println("NumGuia == " + resultado.getInt("num_guia") + " Busq == " + busq);
                                    mdl.addRow(new Object[]
                                    {
                                        resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                    });
                                }
                            }
                            break;
                        case 2://nombre del emisor
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent != 'PENDIENTE'");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    String nomb = MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")).toUpperCase();
                                    if (nomb.contains(busq.toUpperCase()))
                                    {
                                        mdl.addRow(new Object[]
                                        {
                                            resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                        });
                                    }
                                }
                            }
                            break;
                        case 3: //nombre del receptor
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent != 'PENDIENTE'");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    String nomb = MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")).toUpperCase();
                                    if (nomb.contains(busq.toUpperCase()))
                                    {
                                        mdl.addRow(new Object[]
                                        {
                                            resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                        });
                                    }
                                }
                            }
                            break;
                        case 4: //Direccion (Calle,Localidad,Ciudad,Codigo Postal)
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent != 'PENDIENTE'");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    String dir = MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")).toUpperCase();
                                    System.out.println("DIRECCION EN EL 4: " + dir);
                                    if (dir.contains(busq.toUpperCase()))
                                    {
                                        mdl.addRow(new Object[]
                                        {
                                            resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                        });
                                    }
                                }
                            }
                            break;

                        case 5: //Fecha de recibido
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent != 'PENDIENTE' AND fecha_recp LIKE ?");
                            sentencia.setString(1, "%" + busq + "%");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    mdl.addRow(new Object[]
                                    {
                                        resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                    });
                                }
                            }
                            break;
                        case 6: //Fecha de recibido
                            sentencia = conexionBD.prepareStatement("SELECT * FROM paquetes WHERE fecha_ent != 'PENDIENTE' AND fecha_ent LIKE ?");
                            sentencia.setString(1, "%" + busq + "%");
                            resultado = sentencia.executeQuery();
                            if (resultado != null)
                            {
                                while (resultado.next())
                                {
                                    mdl.addRow(new Object[]
                                    {
                                        resultado.getInt("num_guia"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_emisor")), resultado.getString("fecha_recp"), MetodosBD.obtenerDatos(1, resultado.getInt("id_nombre_receptor")), MetodosBD.obtenerDatos(2, resultado.getInt("id_direccion")), resultado.getString("fecha_ent"), resultado.getDouble("peso"), resultado.getDouble("altura"), resultado.getDouble("ancho"), resultado.getDouble("profundidad"), resultado.getDouble("precio")
                                    });
                                }
                            }
                            break;
                    }

                    break;
            }

            conexionBD.close();
        } catch (SQLException e)
        {
            System.out.println("Error al buscar " + e);
            try
            {
                conexionBD.close();
            } catch (SQLException xe)
            {
            }
        }
    }

    /**
     * Este metodo sirve para extraer todos los paquetes de la tabla paquetes
     *
     * @param opc 1 --> para paquetes recibidos
     * @param tab 2 --> para paquetes enviados
     */
    public static void consultaBD(int opc, RSTableMetroCustom tab)
    {
        DefaultTableModel mdl = null;
        mdl = (DefaultTableModel) tab.getModel();
        while (mdl.getRowCount() > 0)
        {
            mdl.setRowCount(0);//Por si las moscas la vacio
        }
        try
        {
            conexionBD = ConexionBD.getConection();
            String consulta = "";

            switch (opc)
            {
                case 1: //Caso de los paquetes recibidos
                    consulta = "SELECT * FROM paquetes WHERE fecha_ent = 'PENDIENTE'";
                    break;

                case 2: //Caso de los paquetes enviados
                    consulta = "SELECT * FROM paquetes WHERE fecha_ent != 'PENDIENTE'";
                    break;
            }

            sentencia = conexionBD.prepareStatement(consulta);
            resultado = sentencia.executeQuery();

            if (resultado != null)
            {
                System.out.println("Paquetes");
                while (resultado.next())
                {
                    //Extraigo los identificadores de las ID correspondientes
                    int idEmi = resultado.getInt("id_nombre_emisor");
                    int idRec = resultado.getInt("id_nombre_receptor");
                    int idDir = resultado.getInt("id_direccion");
                    System.out.println("EMISOR " + idEmi);
                    System.out.println("RECEPTOR" + idRec);
                    System.out.println("DIRECCION" + idDir);
                    String nombreE = obtenerDatos(1, idEmi);
                    System.out.println(nombreE);
                    String nombreR = obtenerDatos(1, idRec);
                    System.out.println(nombreR);
                    String direc = obtenerDatos(2, idDir);
                    System.out.println(direc);
                    //Lleno la tabla
                    mdl.addRow(new Object[]
                    {
                        resultado.getString("num_guia"), nombreE,
                        resultado.getString("fecha_recp"), nombreR,
                        direc, resultado.getString("fecha_ent"),
                        resultado.getDouble("peso"), resultado.getDouble("altura"),
                        resultado.getDouble("ancho"), resultado.getDouble("profundidad"),
                        resultado.getDouble("precio")

                    });
                }
            }
            conexionBD.close();
        } catch (SQLException e)
        {
        }

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
                    if (res.next())
                    {
                        s = res.getString("nombre") + " " + res.getString("apeP") + " " + res.getString("apeM");
                    }

                    break;
                case 2: //Caso 2, Te retornara una direccion
                    s = "Error al extraer la direccion";
                    consulta = "SELECT calle,localidad,codigo_postal,ciudad FROM direccion WHERE clave_domicilio = ?";
                    sentencia = con.prepareStatement(consulta);
                    sentencia.setInt(1, id);
                    res = sentencia.executeQuery();
                    if (res.next())
                    {
                        s = res.getString("calle") + ", " + res.getString("localidad") + ", " + res.getString("ciudad") + " " + res.getInt("codigo_postal");
                    }

                    break;
            }
            con.close();
            return s;
        } catch (SQLException e)
        {
            System.out.println("Obtener datos Error!!! " + e.toString());
            try
            {
                conexionBD.close();
            } catch (SQLException ec)
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
            conexionBD = ConexionBD.getConection();
            sentencia = conexionBD.prepareStatement("SELECT * FROM direccion");
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
            conexionBD.close();
        } catch (SQLException e)
        {
            System.out.println("No Existe Direccion Error!!! " + e);
            try
            {
                conexionBD.close();
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
            conexionBD = ConexionBD.getConection();
            String consulta = "INSERT INTO direccion (calle,localidad,codigo_postal,ciudad) VALUES (?,?,?,?)";
            sentencia = conexionBD.prepareStatement(consulta);
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
            conexionBD.close();
        } catch (Exception e)
        {
            System.out.println("Guarda Direccion Error!!! " + e);
            try
            {
                conexionBD.close();
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
            conexionBD = ConexionBD.getConection();
            sentencia = conexionBD.prepareStatement("SELECT * FROM datos_personales");
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
            conexionBD.close();
        } catch (SQLException e)
        {
            System.out.println("Existe Nombre Error!!! " + e);
            try
            {
                conexionBD.close();
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
            conexionBD = ConexionBD.getConection();
            String consulta = "INSERT INTO datos_personales (nombre,apeP,apeM) VALUES (?,?,?)";
            sentencia = conexionBD.prepareStatement(consulta);
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
            conexionBD.close();
        } catch (Exception e)
        {
            System.out.println("Guarda Nombres Error!!! " + e);
            try
            {
                conexionBD.close();
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
            conexionBD = ConexionBD.getConection();
            String consulta = "INSERT INTO paquetes "
                    + "(id_nombre_emisor,fecha_recp,id_nombre_receptor,id_direccion,fecha_ent, peso, altura, ancho, profundidad, precio) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
            sentencia = conexionBD.prepareStatement(consulta);
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
            conexionBD.close();
        } catch (HeadlessException | SQLException e)
        {
            System.out.println("Guarda Paqs Error!!! " + e);
        } finally
        {
            try
            {
                conexionBD.close();
            } catch (SQLException e)
            {
            }
        }
    }
}
