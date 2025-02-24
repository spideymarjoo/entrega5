package futbol.jugador;

import futbol.equipo.equipo;
import java.util.Date;

/**
 * Representa un jugador de fútbol con su nombre, fecha de nacimiento, país,
 * posición, dorsal y estado de traspaso.
 * 
 * @author Entrega5
 * @version 1.0
 */

public class jugador {
    private String nombre;
    private Date fecha_nacimiento;
    private String pais;
    private Posicion posicion;
    private int numdorsal;
    private equipo equipoID;
    public Traspaso traspaso;
    private static int jugadoresTotales = 0;

    /**
     * Constructor de la clase jugador.
     *
     * @param nombre_jugador   Nombre del jugador.
     * @param fecha_nacimiento Fecha de nacimiento del jugador.
     * @param pais             País de origen del jugador.
     * @param posicion         Posición en la que juega el jugador.
     * @param dorsal_jugador   Número de dorsal del jugador.
     * @param traspaso_jugador Estado de traspaso del jugador.
     * @param equipoID         Equipo al que pertenece el jugador.
     */

    // --------------------------------------------Nuestro
    // Constructor----------------------------------------
    public jugador(String nombre_jugador, Date fecha_nacimiento, String pais, Posicion posicion, int dorsal_jugador,
            Traspaso traspaso_jugador, equipo equipoID) {
        if (nombre_jugador != null) {
            this.nombre = nombre_jugador;
        } else {
            System.out.println("Nombre no reconocido");
            this.nombre = "No reconocido";
        }
        if (fecha_nacimiento != null) {
            this.fecha_nacimiento = fecha_nacimiento;
        } else {
            System.out.println("FechaNacimiento no reconocido");
            this.fecha_nacimiento = new Date();
        }
        if (pais != null) {
            this.pais = pais;
        } else {
            System.out.println("Pais no reconocido");
            this.pais = "Desconocido";
        }
        if (posicion != null) {
            this.posicion = posicion;
        } else {
            System.out.println("Posicion no reconocida");
            this.posicion = posicion.RESERVA;
        }
        if (dorsal_jugador >= 1) {
            this.numdorsal = dorsal_jugador;
        } else {
            System.out.println("Error dorsal");
            this.numdorsal = 0;
        }
        if (traspaso_jugador != null) {
            this.traspaso = traspaso_jugador;
        } else {
            System.out.println("Error traspaso");
            this.traspaso = traspaso.SIN_SOLICITAR;
        }
        jugadoresTotales++;
    }

    // ----------------------uso de atributos y metodo static---------------------
    /**
     * Obtiene el número total de jugadores.
     * 
     * @return Número total de jugadores creados.
     */

    public static int getjugadoresTotales() {
        return jugadoresTotales;
    }

    // ------------------------getters y setter -------------------

    /**
     * Obtiene el nombre del jugador.
     * 
     * @return Nombre del jugador.
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del jugador.
     * 
     * @param nombre Nuevo nombre del jugador.
     */

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }

    /**
     * Obtiene el equipo al que pertenece el jugador.
     * 
     * @return Equipo del jugador.
     */

    public equipo getEquipoID() {
        return equipoID;
    }

    /**
     * Establece el equipo del jugador.
     * 
     * @param equipoID Nuevo equipo del jugador.
     */

    public void setEquipoID(equipo equipoID) {
        if (equipoID != null) {
            this.equipoID = equipoID;
        } else {
            System.out.println("Equipo no reconocido");
        }
    }

    /**
     * Obtiene la fecha de nacimiento del jugador.
     * 
     * @return Fecha de nacimiento.
     */

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Establece la fecha de nacimiento del jugador.
     * 
     * @param fecha_nacimiento Nueva fecha de nacimiento.
     */

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        if (fecha_nacimiento != null) {
            this.fecha_nacimiento = fecha_nacimiento;
        } else {
            System.out.println("Fecha de nacimiento inválida");
        }
    }

    /**
     * Obtiene el país de origen del jugador.
     * 
     * @return País del jugador.
     */

    public String getPais() {
        return pais;
    }

    /**
     * Establece el país del jugador.
     * 
     * @param pais Nuevo país del jugador.
     */

    public void setPais(String pais) {
        if (pais != null) {
            this.pais = pais;
        } else {
            System.out.println("País no reconocido");
        }
    }

    /**
     * Obtiene la posición en la que juega el jugador.
     * 
     * @return Posición del jugador.
     */

    public Posicion getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición del jugador.
     * 
     * @param posicion Nueva posición del jugador.
     */

    public void setPosicion(Posicion posicion) {
        if (posicion != null) {
            this.posicion = posicion;
        } else
            System.out.println("Posicion invalida");
    }

    /**
     * Obtiene el número dorsal del jugador.
     * 
     * @return Número dorsal.
     */

    public int getDorsal() {
        return numdorsal;
    }

    /**
     * Establece el número dorsal del jugador.
     * 
     * @param dorsal Nuevo número dorsal.
     */

    public void setDorsal(int dorsal) {
        if (dorsal >= 1) {
            this.numdorsal = dorsal;
        } else {
            System.out.println("Error, ...");
            this.numdorsal = 0;
        }
    }

    /**
     * Obtiene el estado de traspaso del jugador.
     * 
     * @return Estado de traspaso.
     */

    public Traspaso getTraspaso() {
        return traspaso;
    }

    /**
     * Establece el estado de traspaso del jugador.
     * 
     * @param traspaso Nuevo estado de traspaso.
     */

    public void setTraspaso(Traspaso traspaso) {
        if (traspaso != null) {
            this.traspaso = traspaso;
        } else {
            System.out.println("Error de traspaso");
        }
    }

    /**
     * Devuelve una representación en cadena del jugador.
     * 
     * @return Información del jugador en formato legible.
     */

    // --------------------------------------------metodo
    // toString---------------------------------------------
    @Override
    public String toString() {
        return "jugador [nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", pais=" + pais + ", posicion="
                + posicion + ", numdorsal=" + numdorsal + ", traspaso=" + traspaso + "]";
    }

}
