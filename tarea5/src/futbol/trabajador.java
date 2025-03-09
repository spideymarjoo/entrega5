package futbol;

import java.util.Date;

public abstract class trabajador {
    private String nombre;
    private Date fecha_nacimiento;
    private String pais;
    public static int trabajadoresTotales = 0;

    // -------------------------nuestro constructor--------------------------
    public trabajador(String nombre, Date fecha_nacimiento, String pais) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.pais = pais;
        trabajadoresTotales++;
    }

    public static int gettrabajadoresTotales() {
        return trabajadoresTotales;
    }

    public trabajador() {
    }

    // ---------------------getters y setters------------------------------
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getpais() {
        return pais;
    }

    public void setpais(String pais) {
        this.pais = pais;
    }

    // ------------------método mismaNacionalidad-------------------------
    public boolean mismaNacionalidad(trabajador otro) {
        return this.pais.equalsIgnoreCase(otro.getpais());
    }

    // ---------------método abstracto mostrarInfo------------------------
    public abstract void mostrarInfo();

}
