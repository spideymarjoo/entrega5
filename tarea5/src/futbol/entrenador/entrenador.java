package futbol.entrenador;

import futbol.equipo.equipo;

public class entrenador {
    private String nombre;
    private formaciones formacionPreferida;
    private equipo equipoID;



    // -------------------------nuestro constructor-------------------------
    public entrenador(String nombre, formaciones formacionPreferida, equipo equipoID) {
        this.nombre = nombre;
        this.formacionPreferida = formacionPreferida;
        this.equipoID = equipoID;
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

    public equipo getEquipoID() {
        return equipoID;
    }

    public void setEquipoID(equipo equipoID) {
        this.equipoID = equipoID;
    }
    

}