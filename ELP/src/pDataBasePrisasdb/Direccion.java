package pDataBasePrisasdb;

import java.io.Serializable;

/**
 *
 * @author Tecnologinc
 */
public class Direccion implements Serializable
{

    private static final long serialVersionUID = 1L;

    private int clave_domicilio;
    private String calle;
    private String localidad;
    private int codigo_postal;
    private String ciudad;

    public Direccion(int clave_domicilio, String calle, String localidad, int codigo_postal, String ciudad)
    {
        this.clave_domicilio = clave_domicilio;
        this.calle = calle;
        this.localidad = localidad;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
    }

    /**
     * @return Obtiene clave_domicilio
     */
    public int getClave_domicilio()
    {
        return clave_domicilio;
    }

    /**
     * @param Dar clave_domicilio
     */
    public void setClave_domicilio(int clave_domicilio)
    {
        this.clave_domicilio = clave_domicilio;
    }

    /**
     * @return Obtiene calle
     */
    public String getCalle()
    {
        return calle;
    }

    /**
     * @param Dar calle
     */
    public void setCalle(String calle)
    {
        this.calle = calle;
    }

    /**
     * @return Obtiene localidad
     */
    public String getLocalidad()
    {
        return localidad;
    }

    /**
     * @param Dar localidad
     */
    public void setLocalidad(String localidad)
    {
        this.localidad = localidad;
    }

    /**
     * @return Obtiene codigo_postal
     */
    public int getCodigo_postal()
    {
        return codigo_postal;
    }

    /**
     * @param Dar codigo_postal
     */
    public void setCodigo_postal(int codigo_postal)
    {
        this.codigo_postal = codigo_postal;
    }

    /**
     * @return Obtiene ciudad
     */
    public String getCiudad()
    {
        return ciudad;
    }

    /**
     * @param Dar ciudad
     */
    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }

}
