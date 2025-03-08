package futbol.entrenador;

import java.util.Date;

import futbol.trabajador;
import futbol.equipo.equipo;

/**
 * Representa un entrenador de fútbol con su nombre, formación preferida y
 * equipo asignado.
 * 
 * @author Entrega5
 * @version 1.0
 */

public class entrenador extends trabajador {
    private String nombre;
    private formaciones formacionPreferida;
    private equipo equipoID;
    private static int entrenadoresTotales = 0;

    /**
     * Constructor de la clase entrenador.
     * 
     * @param nombre             Nombre del entrenador.
     * @param formacionPreferida Formación táctica preferida del entrenador.
     * @param equipoID           Equipo al que está asignado el entrenador.
     */

    // -------------------------nuestro constructor-------------------------
    public entrenador(String nombre, formaciones formacionPreferida, equipo equipoID) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no reconocido");
            this.nombre = "no existente";
        }
        if (formacionPreferida != null) {
            this.formacionPreferida = formacionPreferida;
        } else {
            System.out.println("Formación no reconocida");
            this.formacionPreferida = formaciones.NOEXISTENTE;
        }
        entrenadoresTotales++;
    }

    // ------------------ metodo mostrar informacion--------------------

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("País: " + getpais());
    }

    // ----------------------uso de atributos y metodo static---------------------

    /**
     * Obtiene el número total de entrenadores creados.
     * 
     * @return Número total de entrenadores.
     */

    public static int getentrenadoresTotales() {
        return entrenadoresTotales;
    }

    // -------------------------getters y setters---------------------------

    /**
     * Obtiene el nombre del entrenador.
     * 
     * @return Nombre del entrenador.
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del entrenador.
     * 
     * @param nombre Nuevo nombre del entrenador.
     */

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre incorrecto");
        }
    }

    /**
     * Obtiene la formación táctica preferida del entrenador.
     * 
     * @return Formación táctica preferida.
     */

    public formaciones getFormacionPreferida() {
        return formacionPreferida;
    }

    /**
     * Establece la formación táctica preferida del entrenador.
     * 
     * @param formacionPreferida Nueva formación preferida.
     */

    public void setFormacionPreferida(formaciones formacionPreferida) {
        if (formacionPreferida != null) {
            this.formacionPreferida = formacionPreferida;
        } else {
            System.out.println("Formacion no reconocida");
        }
    }

    /**
     * Obtiene el equipo al que está asignado el entrenador.
     * 
     * @return Equipo asignado.
     */

    public equipo getEquipoID() {
        return equipoID;
    }

    /**
     * Asigna un equipo al entrenador.
     * 
     * @param equipoID Equipo a asignar.
     */

    public void setEquipoID(equipo equipoID) {
        if (equipoID != null) {
            this.equipoID = equipoID;
        } else {
            System.out.println("Equipo no reconocido");
        }

    }

    // -----------------------------metodo toString-------------------------------

    /**
     * Representación en cadena del objeto entrenador.
     * 
     * @return Cadena con los datos del entrenador.
     */

    @Override
    public String toString() {
        return "entrenador [nombre=" + nombre + ", formacionPreferida=" + formacionPreferida + ", equipoID=" + equipoID
                + "]";
    }

}