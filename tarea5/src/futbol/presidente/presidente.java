package futbol.presidente;

import futbol.equipo.equipo;

public class presidente {
    private String nombre;
    private String dni;
    private equipo equipoID;

    // -------------------------nuestro constructor-------------------------
    public presidente(String nombre, String dni, equipo equipoID) {
        this.nombre = nombre;
        this.dni = dni;
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
            System.out.println("Nombre no reconodido");
        }
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if(dni != null){
            this.dni = dni;
        }else{
            System.out.println("dni no reconocido");
        }
        
    }

    public equipo getEquipoID() {
        return equipoID;
    }

    public void setEquipoID(equipo equipoID) {
        if(equipoID !=null){
            this.equipoID = equipoID;
        }else{
            System.out.println("Equipo no reconocido");
        }
    }

    @Override
    public String toString() {
        return "presidente [nombre=" + nombre + ", dni=" + dni + ", equipoID=" + equipoID + "]";
    }
    
    
    
}
