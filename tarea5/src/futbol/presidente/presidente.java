package futbol.presidente;

import java.util.Date;

import futbol.trabajador;
import futbol.equipo.equipo;

/**
 * Clase que representa a un presidente de un equipo de fútbol.
 */

public class presidente extends trabajador {
    private String nombre;
    private String dni;
    private Date fecha_nacimiento;
    private equipo equipoID;
    private static int presidentesTotales = 0;

    /**
     * Constructor de la clase presidente.
     * 
     * @param nombre   Nombre del presidente.
     * @param dni      Documento Nacional de Identidad del presidente.
     * @param equipoID Equipo al que pertenece el presidente.
     */

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

    // ------------------ metodo mostrar informacion--------------------
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getnombre());
    }

    // ----------------------uso de atributos y metodo static---------------------

    /**
     * Obtiene el número total de presidentes creados.
     * 
     * @return Número total de presidentes.
     */

    public static int getpresidentesTotales() {
        return presidentesTotales;
    }

    // -------------------------getters y setters---------------------------

    /**
     * Obtiene el nombre del presidente.
     * 
     * @return Nombre del presidente.
     */

    public String getnombre() {
        return nombre;
    }

    /**
     * Establece el nombre del presidente.
     * 
     * @param nombre Nombre del presidente.
     */

    public void setnombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no reconodido");
        }

    }

    /**
     * Obtiene el DNI del presidente.
     * 
     * @return DNI del presidente.
     */

    public String getdni() {
        return dni;
    }

    /**
     * Establece el DNI del presidente.
     * 
     * @param dni DNI del presidente.
     */

    public void setdni(String dni) {
        if (dni != null) {
            this.dni = dni;
        } else {
            System.out.println("dni no reconocido");
        }
    }

    /**
     * Obtiene el equipo al que pertenece el presidente.
     * 
     * @return Equipo del presidente.
     */

    public equipo getequipoID() {
        return equipoID;
    }

    /**
     * Establece el equipo al que pertenece el presidente.
     * 
     * @param equipoID Equipo del presidente.
     */

    public void setequipoID(equipo equipoID) {
        if (equipoID != null) {
            this.equipoID = equipoID;
        } else {
            System.out.println("Equipo no reconocido");
        }
    }

    // --------------------------metodo toString-------------------------

    /**
     * Devuelve una representación en cadena del objeto presidente.
     * 
     * @return Representación en cadena del presidente.
     */

    @Override
    public String toString() {
        return "presidente [nombre=" + nombre + ", dni=" + dni + ", equipoID=" + equipoID + "]";
    }

}
