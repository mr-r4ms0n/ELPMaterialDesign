package pDataBasePrisasdb;

import java.io.Serializable;

/**
 *
 * @author Tecnologinc
 */
public class Admins implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    private String usuario;
    private String contraseña;

    public Admins(String usuario, String contraseña)
    {
        this.usuario=usuario;
        this.contraseña=contraseña;
    }
    /**
     * @return Obtiene usuario
     */
    public String getUsuario()
    {
        return usuario;
    }
    
    /**
     * @param Dar usuario
     */
    public void setUsuario(String usuario)
    {
        this.usuario=usuario;
    }
    /**
     * @return Obtiene contraseña
     */
    public String getContraseña()
    {
        return contraseña;
    }
    
    /**
     * @param Dar contraseña
     */
    public void setContraseña(String contraseña)
    {
        this.contraseña=contraseña;
    }

}
