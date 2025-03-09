package futbol.trabajador;

import java.util.Date;

/**
 * La clase abstracta {@code trabajador} representa a un trabajador en el
 * sistema de fútbol.
 * Proporciona atributos comunes como nombre, fecha de nacimiento y país,
 * además de métodos para gestionar esta información.
 * También incluye un método abstracto {@code mostrarInfo()} que debe ser
 * implementado por las subclases.
 * 
 * @author TuNombre
 */
public abstract class trabajador {
    private String nombre;
    private Date fecha_nacimiento;
    private String pais;
    public static int trabajadoresTotales = 0;

    // -------------------------nuestro constructor--------------------------

    /**
     * Constructor que inicializa un trabajador con los datos especificados.
     * Incrementa el contador estático de trabajadores totales.
     * 
     * @param nombre           El nombre del trabajador.
     * @param fecha_nacimiento La fecha de nacimiento del trabajador.
     * @param pais             El país de origen del trabajador.
     */
    public trabajador(String nombre, Date fecha_nacimiento, String pais) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.pais = pais;
        trabajadoresTotales++;
    }

    // --------------------------metodo static-----------------------------
    /**
     * Devuelve el número total de trabajadores creados.
     * 
     * @return El número total de trabajadores.
     */
    public static int gettrabajadoresTotales() {
        return trabajadoresTotales;
    }

    /**
     * Constructor por defecto.
     */
    public trabajador() {
    }

    // ---------------------getters y setters-------------------------

    /**
     * Obtiene el nombre del trabajador.
     * 
     * @return El nombre del trabajador.
     */
    public String getnombre() {
        return nombre;
    }

    /**
     * Establece el nombre del trabajador.
     * 
     * @param nombre El nombre a establecer.
     */
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de nacimiento del trabajador.
     * 
     * @return La fecha de nacimiento.
     */
    public Date getfecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Establece la fecha de nacimiento del trabajador.
     * 
     * @param fecha_nacimiento La fecha de nacimiento a establecer.
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Obtiene el país de origen del trabajador.
     * 
     * @return El país de origen.
     */
    public String getpais() {
        return pais;
    }

    /**
     * Establece el país de origen del trabajador.
     * 
     * @param pais El país a establecer.
     */
    public void setpais(String pais) {
        this.pais = pais;
    }

    // ------------------método mismaNacionalidad-------------------------

    /**
     * Comprueba si dos trabajadores tienen la misma nacionalidad.
     * 
     * @param otro Otro objeto {@code trabajador} a comparar.
     * @return {@code true} si ambos trabajadores tienen el mismo país,
     *         {@code false} en caso contrario.
     */
    public boolean mismaNacionalidad(trabajador otro) {
        return this.pais.equalsIgnoreCase(otro.getpais());
    }

    // ---------------método abstracto mostrarInfo------------------------

    /**
     * Método abstracto que muestra la información del trabajador.
     * Debe ser implementado por las subclases.
     */
    public abstract void mostrarInfo();

}
