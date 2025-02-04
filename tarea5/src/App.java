
import futbol.jugador.Posicion;
import futbol.jugador.Traspaso;
import futbol.jugador.jugador;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static Date fechanacimiento(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia);
        return cal.getTime();
    }
    public static void main(String[] args) throws Exception {
    
        jugador j1 = new jugador( "Lamine Yamal", fechanacimiento(2007, 11, 20), "Espania", Posicion.DELANTERO, 19, Traspaso.SIN_SOLICITAR);
        jugador j2 = new jugador( "Paolo Guerreo", fechanacimiento(1986, 10, 06), "Peru", Posicion.DELANTERO, 9, Traspaso.SIN_SOLICITAR);
        jugador j3 = new jugador( "Jefferson Farfan", fechanacimiento(1988, 10, 26), "Peru", Posicion.DELANTERO, 10, Traspaso.SIN_SOLICITAR);
        jugador j4 = new jugador( "Kounde Quispe", fechanacimiento(1998, 4, 16), "Bolivia", Posicion.CENTROCAMPISTA, 12, Traspaso.SIN_SOLICITAR);
        jugador j5 = new jugador( "Pau Cubarsi", fechanacimiento(2007, 19, 11), "Espania", Posicion.DEFENSA, 8, Traspaso.SIN_SOLICITAR);
        jugador j6 = new jugador( "Cristiano Ronaldo", fechanacimiento(1984, 6, 29), "Portugal", Posicion.DELANTERO, 7, Traspaso.SIN_SOLICITAR);
        jugador j7 = new jugador( "Leo Messi", fechanacimiento(1986, 9, 11), "Argentina", Posicion.DELANTERO, 10, Traspaso.SIN_SOLICITAR);
        jugador j8 = new jugador( "Kylyan Mbappe", fechanacimiento(1998, 10, 17), "Francia", Posicion.DELANTERO, 8, Traspaso.SIN_SOLICITAR);
        jugador j9 = new jugador( "Cristian Cueva", fechanacimiento(1991, 6, 28), "Peru", Posicion.CENTROCAMPISTA, 6, Traspaso.SIN_SOLICITAR);
        jugador j10 = new jugador( "Yosimar Yotun", fechanacimiento(1992, 12, 21), "Peru", Posicion.CENTROCAMPISTA, 17, Traspaso.SIN_SOLICITAR);
        jugador j11 = new jugador( "Pedro Gallese", fechanacimiento(1992, 2, 30), "Peru", Posicion.PORTERO, 1, Traspaso.SIN_SOLICITAR);

    }
    
    
}
