package futbol.interfaces;

import futbol.jugador.jugador;
import futbol.equipo.equipo;

/**
 * La interfaz {@code gestortraspasos} define los métodos necesarios para
 * gestionar
 * los traspasos de jugadores entre equipos en un sistema de fútbol.
 * Proporciona métodos para aprobar y rechazar traspasos.
 * 
 * @author TuNombre
 */
public interface gestortraspasos {
    /**
     * Aprueba el traspaso de un jugador a un equipo específico.
     * 
     * @param jugador El objeto {@code jugador} que se desea traspasar.
     * @param equipo  El objeto {@code equipo} al que se desea transferir el
     *                jugador.
     */
    void aprobarTraspaso(jugador jugador, equipo equipo);

    /**
     * Rechaza el traspaso de un jugador a un equipo específico.
     * 
     * @param jugador El objeto {@code jugador} cuyo traspaso se desea rechazar.
     * @param equipo  El objeto {@code equipo} involucrado en el traspaso rechazado.
     */
    void rechazarTraspaso(jugador jugador, equipo equipo);
}
