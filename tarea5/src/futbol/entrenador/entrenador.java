package futbol.entrenador;

public class entrenador {
    private String nombre;
    private formaciones formacionPreferida;

    // -------------------------nuestro constructor-------------------------
    public entrenador(String nombre, formaciones formacionPreferida, String dni) {
        this.nombre = nombre;
        this.formacionPreferida = formacionPreferida;
    }

    // -------------------------getters y setters---------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public formaciones getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(formaciones formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

}