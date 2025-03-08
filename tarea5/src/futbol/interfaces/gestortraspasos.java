package futbol.interfaces;

import futbol.jugador.jugador;
import futbol.equipo.equipo;

public interface gestortraspasos {
    void aprobarTraspaso(jugador jugador, equipo equipo);
    void rechazarTraspaso(jugador jugador, equipo equipo);
}
