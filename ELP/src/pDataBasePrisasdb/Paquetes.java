package pDataBasePrisasdb;

import java.io.Serializable;

/**
 *
 * @author Tecnologinc
 */
public class Paquetes implements Serializable
{

    private static final long serialVersionUID = 1L;

    private String num_guia;
    private String fecha_recp;
    private String fecha_ent;
    private float peso;
    private float altura;
    private float ancho;
    private float profundidad;
    private float precio;

    public Paquetes(String num_guia, String fecha_recp, String fecha_ent, float peso, float altura, float ancho, float profundidad, float precio)
    {
        this.num_guia = num_guia;
        this.fecha_recp = fecha_recp;
        this.fecha_ent = fecha_ent;
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.precio = precio;
    }

    /**
     * @return Obtiene num_guia
     */
    public String getNum_guia()
    {
        return num_guia;
    }

    /**
     * @param Dar num_guia
     */
    public void setNum_guia(String num_guia)
    {
        this.num_guia = num_guia;
    }

    /**
     * @return Obtiene fecha_recp
     */
    public String getFecha_recp()
    {
        return fecha_recp;
    }

    /**
     * @param Dar fecha_recp
     */
    public void setFecha_recp(String fecha_recp)
    {
        this.fecha_recp = fecha_recp;
    }

    /**
     * @return Obtiene fecha_ent
     */
    public String getFecha_ent()
    {
        return fecha_ent;
    }

    /**
     * @param Dar fecha_ent
     */
    public void setFecha_ent(String fecha_ent)
    {
        this.fecha_ent = fecha_ent;
    }

    /**
     * @return Obtiene peso
     */
    public float getPeso()
    {
        return peso;
    }

    /**
     * @param Dar peso
     */
    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    /**
     * @return Obtiene altura
     */
    public float getAltura()
    {
        return altura;
    }

    /**
     * @param Dar altura
     */
    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    /**
     * @return Obtiene ancho
     */
    public float getAncho()
    {
        return ancho;
    }

    /**
     * @param Dar ancho
     */
    public void setAncho(float ancho)
    {
        this.ancho = ancho;
    }

    /**
     * @return Obtiene profundidad
     */
    public float getProfundidad()
    {
        return profundidad;
    }

    /**
     * @param Dar profundidad
     */
    public void setProfundidad(float profundidad)
    {
        this.profundidad = profundidad;
    }

    /**
     * @return Obtiene precio
     */
    public float getPrecio()
    {
        return precio;
    }

    /**
     * @param Dar precio
     */
    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

}
