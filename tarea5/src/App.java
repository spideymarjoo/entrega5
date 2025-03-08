
import futbol.entrenador.entrenador;
import futbol.entrenador.formaciones;
import futbol.equipo.equipo;
import futbol.jugador.Posicion;
import futbol.jugador.Traspaso;
import futbol.jugador.jugador;
import futbol.presidente.presidente;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Clase principal que gestiona la creación de jugadores, entrenadores,
 * presidentes y equipos de fútbol, asignándolos y mostrando información
 * relevante en la consola.
 */
public class App {
/**
         * Método que genera una fecha de nacimiento basada en el año, mes y día
         * proporcionados.
         * 
         * @param anio Año de nacimiento.
         * @param mes  Mes de nacimiento (1-12).
         * @param dia  Día de nacimiento.
         * @return Objeto Date que representa la fecha de nacimiento.
         */
        public static Date fecha_nacimiento(int anio, int mes, int dia) {
                Calendar cal = Calendar.getInstance();
                cal.set(anio, mes - 1, dia);
                return cal.getTime();
        }

        /**
         * Método principal donde se crean instancias de jugadores, entrenadores,
         * presidentes y equipos, y se establecen sus relaciones.
         * 
         * @param args Argumentos de la línea de comandos (no utilizados en este
         *             programa).
         * @throws Exception Manejo de posibles excepciones.
         */
        public static void main(String[] args) throws Exception {

                jugador j1 = new jugador("Lamine Yamal", fechanacimiento(2007, 11, 20), "Espania", Posicion.DELANTERO,
                                10,
                                Traspaso.SIN_SOLICITAR, null);
                jugador j2 = new jugador("Paolo Guerreo", fechanacimiento(1986, 10, 06), "Peru", Posicion.DELANTERO, 9,
                                Traspaso.SIN_SOLICITAR, null);
                jugador j3 = new jugador("Jefferson Farfan", fechanacimiento(1988, 10, 26), "Peru", Posicion.DELANTERO,
                                10,
                                Traspaso.SIN_SOLICITAR, null);
                jugador j4 = new jugador("Pau Cubarsi", fechanacimiento(2007, 12, 11), "Espania", Posicion.DEFENSA, 8,
                                Traspaso.SIN_SOLICITAR, null);
                jugador j5 = new jugador("Cristiano Ronaldo", fechanacimiento(1984, 6, 29), "Portugal",
                                Posicion.DELANTERO, 7,
                                Traspaso.SIN_SOLICITAR, null);
                jugador j6 = new jugador("Leo Messi", fechanacimiento(1986, 9, 11), "Argentina", Posicion.DELANTERO, 10,
                                Traspaso.SIN_SOLICITAR, null);
                jugador j7 = new jugador("Kylyan Mbappe", fechanacimiento(1998, 10, 17), "Francia", Posicion.DELANTERO,
                                8,
                                Traspaso.SIN_SOLICITAR, null);
                jugador j8 = new jugador("Cristian Cueva", fechanacimiento(1991, 6, 28), "Peru",
                                Posicion.CENTROCAMPISTA, 6,
                                Traspaso.SIN_SOLICITAR, null);
                jugador j9 = new jugador("Yosimar Yotun", fechanacimiento(1992, 12, 21), "Peru",
                                Posicion.CENTROCAMPISTA, 17,
                                Traspaso.SIN_SOLICITAR, null);
                jugador j10 = new jugador("Pedro Gallese", fechanacimiento(1992, 2, 20), "Peru", Posicion.PORTERO, 1,
                                Traspaso.SIN_SOLICITAR, null);

                presidente presi1 = new presidente("Florentino Perez", "A12B", null);
                presidente presi2 = new presidente("Johan Laporta", "A23E", null);
                presidente presi3 = new presidente("Nasser Alkhela", "A34C", null);
                presidente presi4 = new presidente("Fernando Cabada", "A56D", null);
                presidente presi5 = new presidente("Enrique Cerezo", "A78F", null);

                entrenador e1 = new entrenador("Hansi Flick", formaciones.CUATRO_TRES_TRES, null);
                entrenador e2 = new entrenador("Carlo Ancelotti", formaciones.CINCO_TRES_DOS, null);
                entrenador e3 = new entrenador("Luis Marinez", formaciones.CUATRO_CUATRO_DOS, null);
                entrenador e4 = new entrenador("Nestor Gorosito", formaciones.CUATRO_CINCO_UNO, null);
                entrenador e5 = new entrenador("Xolo Simeone", formaciones.CINCO_TRES_DOS, null);

                equipo equi1 = new equipo("Barcelona", "BCN", null, null, null, null);
                equipo equi2 = new equipo("Real Madrid", "RMCF", null, null, null, null);
                equipo equi3 = new equipo("Alianza Lima", "AL", null, null, null, null);
                equipo equi4 = new equipo("Atletico de Madrird", "ATM", null, null, null, null);
                equipo equi5 = new equipo("Paris Saint Germain", "PSG", null, null, null, null);

                ArrayList<jugador> jugadoresBarcelona = new ArrayList<jugador>();
                jugadoresBarcelona.add(j1);
                jugadoresBarcelona.add(j2);

                ArrayList<jugador> jugadoresRealMadrid = new ArrayList<jugador>();
                jugadoresRealMadrid.add(j3);
                jugadoresRealMadrid.add(j4);

                ArrayList<jugador> jugadoresAlianzaLima = new ArrayList<jugador>();
                jugadoresAlianzaLima.add(j5);
                jugadoresAlianzaLima.add(j6);

                ArrayList<jugador> jugadoresAtletico = new ArrayList<jugador>();
                jugadoresAtletico.add(j7);
                jugadoresAtletico.add(j8);

                ArrayList<jugador> jugadoresPSG = new ArrayList<jugador>();
                jugadoresPSG.add(j9);
                jugadoresPSG.add(j10);

                equi1.setPresidenteID(presi1);
                equi1.setEntrenadorID(e1);
                equi1.setLista_jugadores(jugadoresBarcelona);

                equi2.setPresidenteID(presi2);
                equi2.setEntrenadorID(e2);
                equi2.setLista_jugadores(jugadoresRealMadrid);

                equi3.setPresidenteID(presi3);
                equi3.setEntrenadorID(e3);
                equi3.setLista_jugadores(jugadoresAlianzaLima);

                equi4.setPresidenteID(presi4);
                equi4.setEntrenadorID(e4);
                equi4.setLista_jugadores(jugadoresAtletico);

                equi5.setPresidenteID(presi5);
                equi5.setEntrenadorID(e5);
                equi5.setLista_jugadores(jugadoresPSG);

                presi1.setEquipoID(equi1);
                presi2.setEquipoID(equi2);
                presi3.setEquipoID(equi3);
                presi4.setEquipoID(equi4);
                presi5.setEquipoID(equi5);

                e1.setEquipoID(equi1);
                e2.setEquipoID(equi2);
                e3.setEquipoID(equi3);
                e4.setEquipoID(equi4);
                e5.setEquipoID(equi5);

                j1.setEquipoID(equi1);
                j2.setEquipoID(equi1);
                j3.setEquipoID(equi2);
                j4.setEquipoID(equi2);
                j5.setEquipoID(equi3);
                j6.setEquipoID(equi3);
                j7.setEquipoID(equi4);
                j8.setEquipoID(equi4);
                j9.setEquipoID(equi5);
                j10.setEquipoID(equi5);

                // -------------------- pruebas de impresiones---------------------------

                System.out.println(equi1);
                // System.out.println(presi1);
                // System.out.println(e1);
        }
   /**
     * Método que genera una fecha de nacimiento basada en el año, mes y día
     * proporcionados.
     *
     * @param anio Año de nacimiento.
     * @param mes Mes de nacimiento (1-12).
     * @param dia Día de nacimiento.
     * @return Objeto Date que representa la fecha de nacimiento.
     */
    public static Date fechanacimiento(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia);
        return cal.getTime();
    }

    /**
     * Método principal donde se crean instancias de jugadores, entrenadores,
     * presidentes y equipos, y se establecen sus relaciones.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este
     * programa).
     * @throws Exception Manejo de posibles excepciones.
     */
    public static void main(String[] args) throws Exception {

        jugador j1 = new jugador("Lamine Yamal", fechanacimiento(2007, 11, 20), "Espania", Posicion.DELANTERO, 10,
                Traspaso.SIN_SOLICITAR, null);
        jugador j2 = new jugador("Paolo Guerreo", fechanacimiento(1986, 10, 06), "Peru", Posicion.DELANTERO, 9,
                Traspaso.SIN_SOLICITAR, null);
        jugador j3 = new jugador("Jefferson Farfan", fechanacimiento(1988, 10, 26), "Peru", Posicion.DELANTERO, 10,
                Traspaso.SIN_SOLICITAR, null);
        jugador j4 = new jugador("Pau Cubarsi", fechanacimiento(2007, 12, 11), "Espania", Posicion.DEFENSA, 8,
                Traspaso.SIN_SOLICITAR, null);
        jugador j5 = new jugador("Cristiano Ronaldo", fechanacimiento(1984, 6, 29), "Portugal", Posicion.DELANTERO, 7,
                Traspaso.SIN_SOLICITAR, null);
        jugador j6 = new jugador("Leo Messi", fechanacimiento(1986, 9, 11), "Argentina", Posicion.DELANTERO, 10,
                Traspaso.SIN_SOLICITAR, null);
        jugador j7 = new jugador("Kylyan Mbappe", fechanacimiento(1998, 10, 17), "Francia", Posicion.DELANTERO, 8,
                Traspaso.SIN_SOLICITAR, null);
        jugador j8 = new jugador("Cristian Cueva", fechanacimiento(1991, 6, 28), "Peru", Posicion.CENTROCAMPISTA, 6,
                Traspaso.SIN_SOLICITAR, null);
        jugador j9 = new jugador("Yosimar Yotun", fechanacimiento(1992, 12, 21), "Peru", Posicion.CENTROCAMPISTA, 17,
                Traspaso.SIN_SOLICITAR, null);
        jugador j10 = new jugador("Pedro Gallese", fechanacimiento(1992, 2, 20), "Peru", Posicion.PORTERO, 1,
                Traspaso.SIN_SOLICITAR, null);

        presidente presi1 = new presidente("Florentino Perez", "A12B", null);
        presidente presi2 = new presidente("Johan Laporta", "A23E", null);
        presidente presi3 = new presidente("Nasser Alkhela", "A34C", null);
        presidente presi4 = new presidente("Fernando Cabada", "A56D", null);
        presidente presi5 = new presidente("Enrique Cerezo", "A78F", null);

        entrenador e1 = new entrenador("Hansi Flick", formaciones.CUATRO_TRES_TRES, null);
        entrenador e2 = new entrenador("Carlo Ancelotti", formaciones.CINCO_TRES_DOS, null);
        entrenador e3 = new entrenador("Luis Marinez", formaciones.CUATRO_CUATRO_DOS, null);
        entrenador e4 = new entrenador("Nestor Gorosito", formaciones.CUATRO_CINCO_UNO, null);
        entrenador e5 = new entrenador("Xolo Simeone", formaciones.CINCO_TRES_DOS, null);

        equipo equi1 = new equipo("Barcelona", "BCN", null, null, null, null);
        equipo equi2 = new equipo("Real Madrid", "RMCF", null, null, null, null);
        equipo equi3 = new equipo("Alianza Lima", "AL", null, null, null, null);
        equipo equi4 = new equipo("Atletico de Madrird", "ATM", null, null, null, null);
        equipo equi5 = new equipo("Paris Saint Germain", "PSG", null, null, null, null);

        ArrayList<jugador> jugadoresBarcelona = new ArrayList<jugador>();
        jugadoresBarcelona.add(j1);
        jugadoresBarcelona.add(j2);

        ArrayList<jugador> jugadoresRealMadrid = new ArrayList<jugador>();
        jugadoresRealMadrid.add(j3);
        jugadoresRealMadrid.add(j4);

        ArrayList<jugador> jugadoresAlianzaLima = new ArrayList<jugador>();
        jugadoresAlianzaLima.add(j5);
        jugadoresAlianzaLima.add(j6);

        ArrayList<jugador> jugadoresAtletico = new ArrayList<jugador>();
        jugadoresAtletico.add(j7);
        jugadoresAtletico.add(j8);

        ArrayList<jugador> jugadoresPSG = new ArrayList<jugador>();
        jugadoresPSG.add(j9);
        jugadoresPSG.add(j10);

        equi1.setPresidenteID(presi1);
        equi1.setEntrenadorID(e1);
        equi1.setLista_jugadores(jugadoresBarcelona);

        equi2.setPresidenteID(presi2);
        equi2.setEntrenadorID(e2);
        equi2.setLista_jugadores(jugadoresRealMadrid);

        equi3.setPresidenteID(presi3);
        equi3.setEntrenadorID(e3);
        equi3.setLista_jugadores(jugadoresAlianzaLima);

        equi4.setPresidenteID(presi4);
        equi4.setEntrenadorID(e4);
        equi4.setLista_jugadores(jugadoresAtletico);

        equi5.setPresidenteID(presi5);
        equi5.setEntrenadorID(e5);
        equi5.setLista_jugadores(jugadoresPSG);

        presi1.setEquipoID(equi1);
        presi2.setEquipoID(equi2);
        presi3.setEquipoID(equi3);
        presi4.setEquipoID(equi4);
        presi5.setEquipoID(equi5);

        e1.setEquipoID(equi1);
        e2.setEquipoID(equi2);
        e3.setEquipoID(equi3);
        e4.setEquipoID(equi4);
        e5.setEquipoID(equi5);

        j1.setEquipoID(equi1);
        j2.setEquipoID(equi1);
        j3.setEquipoID(equi2);
        j4.setEquipoID(equi2);
        j5.setEquipoID(equi3);
        j6.setEquipoID(equi3);
        j7.setEquipoID(equi4);
        j8.setEquipoID(equi4);
        j9.setEquipoID(equi5);
        j10.setEquipoID(equi5);

        // -------------------- pruebas de impresiones---------------------------
        System.out.println(j1);
        System.out.println("El jugador solicita cambiarse de equipo");
        j1.setTraspaso(Traspaso.SOLICITADO);
        System.out.println(j1);
        System.out.println("El entrenador debe aceptar al jugador");
        equi1.traspasosEntrenador(j1, true);
        System.out.println("Proceso de aceptacion por parte del presidente castillo");
        equi1.traspasosPresidente(j1, true);
        System.out.println(j1);
        //System.out.println(presi1);
        //System.out.println(equi1);
        //System.out.println(e1);
        //System.out.println(equi1);
        //System.out.println(presi1);
        // System.out.println(e1);
        //--------------------------------Pruebas de receteo-----------------------------------
        System.out.println(j1);
        System.out.println("El jugador solicita cambiarse de equipo");
        j1.setTraspaso(Traspaso.SOLICITADO);
        System.out.println(j1);

        System.out.println("El entrenador debe aceptar al jugador");
        equi1.traspasosEntrenador(j1, true);

        System.out.println("Proceso de aceptacion por parte del presidente");
        equi1.traspasosPresidente(j1, true);
        System.out.println(j1);
        System.out.println("El jugador solicita cambiarse de equipo");
        j1.setTraspaso(Traspaso.SOLICITADO);
        System.out.println(j1);

        System.out.println("El entrenador debe aceptar al jugador");
        equi1.traspasosEntrenador(j1, true);

        System.out.println("Proceso de aceptacion por parte del presidente");
        equi1.traspasosPresidente(j1, false);
        System.out.println(j1);

        equi1.nuevoEstadoTraspaso();
        System.out.println(j1);

        //--------------------------------------Prueba de nuevo jugador y borrar jugador------------------------------------------
        System.out.println("Añadiendo nuevo jugador al equipo 3 y borrando del equipo 1");
        equi3.nuevoJugador(j1);
        equi1.borrarJugador(j1);

        //-----------------------Prueba equipos totales----------------
        System.out.println("Numero de equipos totales " + equipo.getEquiposTotales());

        System.out.println("Numero de jugadores totales " + jugador.getjugadoresTotales());

        System.out.println("Numero de entrenadores totales " + entrenador.getentrenadoresTotales());

    }

}
