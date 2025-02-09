
import futbol.entrenador.entrenador;
import futbol.entrenador.formaciones;
import futbol.equipo.equipo;
import futbol.jugador.Posicion;
import futbol.jugador.Traspaso;
import futbol.jugador.jugador;
import futbol.presidente.presidente;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static Date fechanacimiento(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia);
        return cal.getTime();
    }
    public static void main(String[] args) throws Exception {
    
        jugador j1 = new jugador( "Lamine Yamal", fechanacimiento(2007, 11, 20), "Espania", Posicion.DELANTERO, 10, Traspaso.SIN_SOLICITAR);
        jugador j2 = new jugador( "Paolo Guerreo", fechanacimiento(1986, 10, 06), "Peru", Posicion.DELANTERO, 9, Traspaso.SIN_SOLICITAR);
        jugador j3 = new jugador( "Jefferson Farfan", fechanacimiento(1988, 10, 26), "Peru", Posicion.DELANTERO, 10, Traspaso.SIN_SOLICITAR);
        jugador j4 = new jugador( "Pau Cubarsi", fechanacimiento(2007, 19, 11), "Espania", Posicion.DEFENSA, 8, Traspaso.SIN_SOLICITAR);
        jugador j5 = new jugador( "Cristiano Ronaldo", fechanacimiento(1984, 6, 29), "Portugal", Posicion.DELANTERO, 7, Traspaso.SIN_SOLICITAR);
        jugador j6 = new jugador( "Leo Messi", fechanacimiento(1986, 9, 11), "Argentina", Posicion.DELANTERO, 10, Traspaso.SIN_SOLICITAR);
        jugador j7 = new jugador( "Kylyan Mbappe", fechanacimiento(1998, 10, 17), "Francia", Posicion.DELANTERO, 8, Traspaso.SIN_SOLICITAR);
        jugador j8 = new jugador( "Cristian Cueva", fechanacimiento(1991, 6, 28), "Peru", Posicion.CENTROCAMPISTA, 6, Traspaso.SIN_SOLICITAR);
        jugador j9 = new jugador( "Yosimar Yotun", fechanacimiento(1992, 12, 21), "Peru", Posicion.CENTROCAMPISTA, 17, Traspaso.SIN_SOLICITAR);
        jugador j10 = new jugador( "Pedro Gallese", fechanacimiento(1992, 2, 30), "Peru", Posicion.PORTERO, 1, Traspaso.SIN_SOLICITAR);

        presidente presi1 = new presidente("Florentino Perez", "A12B",null);
        presidente presi2 = new presidente("Johan Laporta", "A23E",null);
        presidente presi3 = new presidente("Nasser Alkhela", "A34C",null);
        presidente presi4 = new presidente("Fernando Cabada", "A56D",null);
        presidente presi5 = new presidente("Enrique Cerezo", "A78F",null);

        entrenador e1 = new entrenador("Hansi Flick", formaciones.CUATRO_TRES_TRES,null);
        entrenador e2 = new entrenador("Carlo Ancelotti", formaciones.CINCO_TRES_DOS,null);
        entrenador e3 = new entrenador("Luis Marinez", formaciones.CUATRO_CUATRO_DOS,null);
        entrenador e4 = new entrenador("Nestor Gorosito", formaciones.CUATRO_CINCO_UNO,null);
        entrenador e5 = new entrenador("Xolo Simeone", formaciones.CINCO_TRES_DOS,null);

        equipo equi1 = new equipo("Barcelona", "BCN",null,null,null);
        equipo equi2 = new equipo("Real Madrid", "RMCF",null,null,null);
        equipo equi3 = new equipo("Alianza Lima", "AL",null,null,null);
        equipo equi4 = new equipo("Atletico de Madrird", "ATM",null,null,null);
        equipo equi5 = new equipo("Paris Saint Germain", "PSG",null,null,null);

        // ----------------------------------------- pruebas de impresiones -----------------------------------------------
        System.out.println(j1);
        System.out.println(presi1);
        System.out.println(e1);
        System.out.println(equi1);
    }
    
    
}
