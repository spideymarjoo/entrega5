package futbol.equipo;


public class equipo {
    private String nombre;
    private String abreviatura;

    // -------------------------nuestro constructor-------------------------
    public equipo(String nombre, String dni) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }
    
    // -------------------------getters y setters---------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

}
