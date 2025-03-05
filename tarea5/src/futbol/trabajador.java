package futbol;

import java.util.Date;

public abstract class trabajador {
    private String nombreTra;
    private Date fechaNacimientoTra;
    private String paisTra;

    // -------------------------nuestro constructor--------------------------
    public trabajador(String nombreTra, Date fechaNacimientoTra, String paisTra) {
        this.nombreTra = nombreTra;
        this.fechaNacimientoTra = fechaNacimientoTra;
        this.paisTra = paisTra;
    }

    // ------------------------------getters------------------------------
    public String getNombreTra() {
        return nombreTra;
    }

    public Date getFechaNacimientoTra() {
        return fechaNacimientoTra;
    }

    public String getPais() {
        return paisTra;
    }

    // -------------------------------setters------------------------------
    public void setNombreTra(String nombreTra) {
        this.nombreTra = nombreTra;
    }

    public void setFechaNacimientoTra(Date fechaNacimientoTra) {
        this.fechaNacimientoTra = fechaNacimientoTra;
    }

    public void setPaisTra(String paisTra) {
        this.paisTra = paisTra;
    }

    // ------------------método mismaNacionalidad-------------------------
    public boolean mismaNacionalidad(trabajador otro) {
        return this.paisTra.equalsIgnoreCase(otro.getPais());
    }

    // ---------------método abstracto mostrarInfo------------------------
    public abstract void mostrarInfo();

}
