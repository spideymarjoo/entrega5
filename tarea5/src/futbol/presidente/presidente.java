package futbol.presidente;

public class presidente {
    private String nombre;
    private String dni;

    // -------------------------nuestro constructor-------------------------
    public presidente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // -------------------------getters y setters---------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
