/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

/**
 *
 * @author saipr
 */
public class Paqs
{

    private int num_guia;
    private String eNombre;
    private String eApP;
    private String eApM;
    private String fchRecp;
    private String rNombre;
    private String rApP;
    private String rApM;
    private String fchEnt;
    private double peso;
    private double altura;
    private double ancho;
    private double profundidad;
    private double precio;
    private String calle;
    private String localidad;
    private int cp;
    private String ciudad;
    ////////////////////////////////////

    public void desp()
    {
        System.out.println("*********Datos del paquete*********");
        System.out.println(
                "Nombre Emisor == " + eNombre
                + "\nApellido Paterno Emisor == " + eApP
                + "\nApellido Materno Emisor == " + eApM
                + "\nNombre Receptor == " + rNombre
                + "\nApellido Paterno Receptor == " + rApP
                + "\nApellido Materno Receptor == " + rApM
                + "\nAltura == " + altura
                + "\nAncho == " + ancho
                + "\nProfundidad == " + profundidad
                + "\nPeso == " + peso
                + "\nPrecio == " + precio
                + "\nCalle == " + calle
                + "\nLocalidad == " + localidad
                + "\nCiudad == " + ciudad
                + "\nC.P. == " + cp
                + "Fecha Recp == " + fchRecp
                + "Fecha Entrega == " + fchEnt
        );
        System.out.println("************************************");
    }

    ////////////////////////////////////
    public Paqs()
    {
    }

    public Paqs(String eNombre, String eApP, String eApM, String fchRecp, String rNombre, String rApP, String rApM, String fchEnt, double peso, double altura, double ancho, double profundidad, double precio, String calle, String localidad, int cp, String ciudad)
    {
        this.eNombre = eNombre;
        this.eApP = eApP;
        this.eApM = eApM;
        this.fchRecp = fchRecp;
        this.rNombre = rNombre;
        this.rApP = rApP;
        this.rApM = rApM;
        this.fchEnt = fchEnt;
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.precio = precio;
        this.calle = calle;
        this.localidad = localidad;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    ////////////////////////////////////
    /**
     * @return the eNombre
     */
    public String geteNombre()
    {
        return eNombre;
    }

    /**
     * @param eNombre the eNombre to set
     */
    public void seteNombre(String eNombre)
    {
        this.eNombre = eNombre;
    }

    /**
     * @return the eApP
     */
    public String geteApP()
    {
        return eApP;
    }

    /**
     * @param eApP the eApP to set
     */
    public void seteApP(String eApP)
    {
        this.eApP = eApP;
    }

    /**
     * @return the eApM
     */
    public String geteApM()
    {
        return eApM;
    }

    /**
     * @param eApM the eApM to set
     */
    public void seteApM(String eApM)
    {
        this.eApM = eApM;
    }

    /**
     * @return the fchRecp
     */
    public String getFchRecp()
    {
        return fchRecp;
    }

    /**
     * @param fchRecp the fchRecp to set
     */
    public void setFchRecp(String fchRecp)
    {
        this.fchRecp = fchRecp;
    }

    /**
     * @return the rNombre
     */
    public String getrNombre()
    {
        return rNombre;
    }

    /**
     * @param rNombre the rNombre to set
     */
    public void setrNombre(String rNombre)
    {
        this.rNombre = rNombre;
    }

    /**
     * @return the rApP
     */
    public String getrApP()
    {
        return rApP;
    }

    /**
     * @param rApP the rApP to set
     */
    public void setrApP(String rApP)
    {
        this.rApP = rApP;
    }

    /**
     * @return the rApM
     */
    public String getrApM()
    {
        return rApM;
    }

    /**
     * @param rApM the rApM to set
     */
    public void setrApM(String rApM)
    {
        this.rApM = rApM;
    }

    /**
     * @return the fchEnt
     */
    public String getFchEnt()
    {
        return fchEnt;
    }

    /**
     * @param fchEnt the fchEnt to set
     */
    public void setFchEnt(String fchEnt)
    {
        this.fchEnt = fchEnt;
    }

    /**
     * @return the peso
     */
    public double getPeso()
    {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura()
    {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    /**
     * @return the ancho
     */
    public double getAncho()
    {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }

    /**
     * @return the profundidad
     */
    public double getProfundidad()
    {
        return profundidad;
    }

    /**
     * @param profundidad the profundidad to set
     */
    public void setProfundidad(double profundidad)
    {
        this.profundidad = profundidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return the calle
     */
    public String getCalle()
    {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle)
    {
        this.calle = calle;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad()
    {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad)
    {
        this.localidad = localidad;
    }

    /**
     * @return the cp
     */
    public int getCp()
    {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(int cp)
    {
        this.cp = cp;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad()
    {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }

    /**
     * @return the num_guia
     */
    public int getNum_guia()
    {
        return num_guia;
    }

    /**
     * @param num_guia the num_guia to set
     */
    public void setNum_guia(int num_guia)
    {
        this.num_guia = num_guia;
    }

}
