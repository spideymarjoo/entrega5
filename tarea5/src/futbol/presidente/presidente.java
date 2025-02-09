package futbol.presidente;

import futbol.equipo.equipo;

public class presidente {
    private String nombre;
    private String dni;
    private equipo equipoID;
    private static int presidentesTotales = 0;

    // -------------------------nuestro constructor-------------------------
    public presidente(String nombre, String dni, equipo equipoID) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no reconocido");
            this.nombre = "No existente";
        }
        if (dni != null) {
            this.dni = dni;
        } else {
            System.out.println("DNI no reconocido");
            this.dni = "No existente";
        }
        presidentesTotales++;
    }

    // ----------------------uso de atributos y metodo static---------------------
    public static int getpresidentesTotales() {
        return presidentesTotales; 
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

    // --------------------------------------------metodo toString---------------------------------------------

    @Override
    public String toString() {
        return "presidente [nombre=" + nombre + ", dni=" + dni + ", equipoID=" + equipoID + "]";
    }
    
    
    
}
