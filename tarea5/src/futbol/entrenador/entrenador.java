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
        if(nombre != null){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre incorrecto");        
        }
    }

    public formaciones getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(formaciones formacionPreferida) {
        if(formacionPreferida != null){
            this.formacionPreferida = formacionPreferida;
        }else{
            System.out.println("Formacion no reconocida");
        }
    }

    public equipo getEquipoID() {
        return equipoID;
    }

    public void setEquipoID(equipo equipoID) {
        if(equipoID != null){
            this.equipoID = equipoID;
        }else{
            System.out.println("Equipo no reconocido");
        }
        
    }

    @Override
    public String toString() {
        return "entrenador [nombre=" + nombre + ", formacionPreferida=" + formacionPreferida + ", equipoID=" + equipoID
                + "]";
    }
    
    

}