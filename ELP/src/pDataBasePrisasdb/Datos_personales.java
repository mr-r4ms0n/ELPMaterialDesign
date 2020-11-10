package pDataBasePrisasdb;

import java.io.Serializable;

/**
 *
 * @author Tecnologinc
 */
public class Datos_personales implements Serializable
{

    private static final long serialVersionUID = 1L;

    private int IdNombre;
    private String nombre;
    private String ApeP;
    private String ApeM;

    public Datos_personales(int IdNombre, String nombre, String ApeP, String ApeM)
    {
        this.IdNombre = IdNombre;
        this.nombre = nombre;
        this.ApeP = ApeP;
        this.ApeM = ApeM;
    }

    /**
     * @return Obtiene IdNombre
     */
    public int getIdNombre()
    {
        return IdNombre;
    }

    /**
     * @param Dar IdNombre
     */
    public void setIdNombre(int IdNombre)
    {
        this.IdNombre = IdNombre;
    }

    /**
     * @return Obtiene nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param Dar nombre
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return Obtiene ApeP
     */
    public String getApeP()
    {
        return ApeP;
    }

    /**
     * @param Dar ApeP
     */
    public void setApeP(String ApeP)
    {
        this.ApeP = ApeP;
    }

    /**
     * @return Obtiene ApeM
     */
    public String getApeM()
    {
        return ApeM;
    }

    /**
     * @param Dar ApeM
     */
    public void setApeM(String ApeM)
    {
        this.ApeM = ApeM;
    }

}
