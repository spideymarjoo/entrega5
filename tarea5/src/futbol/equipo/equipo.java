package futbol.equipo;
import futbol.entrenador.entrenador;
import futbol.jugador.Traspaso;
import futbol.jugador.jugador;
import futbol.presidente.presidente;
import java.util.ArrayList;

public class equipo {
    private String nombre;
    private String abreviatura;
    private presidente presidenteID;
    private entrenador entrenadorID;
    private equipo equipoID;
    private ArrayList<jugador> lista_jugadores;
    private static int equiposTotales = 0;

    // -------------------------nuestro constructor-------------------------
    public equipo(String nombre, String abreviatura, presidente presidenteID, entrenador entrenadorID, ArrayList lista_jugadores, equipo equipoID) {
        if(nombre != null){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre no reconocido");
            this.nombre = "No Reconocido";
        }
        if(abreviatura != null){
            this.abreviatura = abreviatura;
        }else{
            System.out.println("Abreviatura no reconocido");
            this.abreviatura = "No Reconocido";
        }
        equiposTotales++;        
    }
     // ------------------------- Uso de atributos y metodo static-----------------
    public static int getequiposTotales() {
        return equiposTotales;
        
    }
    
    // -------------------------getters y setters---------------------------

    public equipo getequipoID() {
        return equipoID;
    }

    public void setequipoID(equipo equipoID) {
        if(equipoID !=null){
            this.equipoID = equipoID;
        }else{
            System.out.println("Equipo no reconocido");
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre inválido");
        }
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        if(abreviatura != null){
            this.abreviatura = abreviatura;
        }else{
            System.out.println("Abreviatura no reconocida");
        }
    }

    public presidente getPresidenteID() {
        return presidenteID;
    }

    public void setPresidenteID(presidente presidenteID) {
        if(presidenteID != null){
            this.presidenteID = presidenteID;
        }else{
            System.out.println("Presidente no reconocido");
        }
    }

    public entrenador getEntrenadorID() {
        return entrenadorID;
    }

    public void setEntrenadorID(entrenador entrenadorID) {
        if(entrenadorID != null){
            this.entrenadorID = entrenadorID;
        }else{
            System.out.println("Entrenador no reconocido");
        }
        
    }

    public ArrayList<jugador> getLista_jugadores() {
        return lista_jugadores;
    }

    public void setLista_jugadores(ArrayList<jugador> lista_jugadores) {
        if (lista_jugadores != null) {
            this.lista_jugadores = lista_jugadores;
        }else{
            System.out.println("Lista de jugadores invalida");
        }

    }

    public void nuevoEstadoTraspaso() {
        for (jugador jugador : lista_jugadores) {
            if (jugador.getTraspaso() == Traspaso.RECHAZADO_PRESIDENTE || 
            jugador.getTraspaso() == Traspaso.RECHAZADO_ENTRENADOR) {
                jugador.setTraspaso(Traspaso.SIN_SOLICITAR);
            }
        }
        System.out.println("Este es el nuevo estado de los jugadores " + nombre);
    }

    //---------------------------------------------------- ejercicio 5 reseteos ---------------------------------------------------------

    public void traspasosEntrenador(jugador jugador,  boolean acepta) {
        if (jugador.getEquipoID() != this) {
            System.out.println("Este no es el entrenador del jugador.");
            return;
        }
        if (jugador.getTraspaso() == Traspaso.SOLICITADO) {
            jugador.setTraspaso( acepta ? Traspaso.APROBADO_ENTRENADOR : Traspaso.RECHAZADO_ENTRENADOR);
            System.out.println("El jugador " + jugador.getNombre() +  " será traspasado " + jugador.getTraspaso() + "por el entrenador");
        } else {
            System.out.println("El entrandor no pudo decidir el traspaso, falta solicitar");
        }
    }

    public void traspasosPresidente(jugador jugador, boolean acepta) {
        if (jugador.getEquipoID() != this) {
            System.out.println("Este no es el presidente del jugador");
            return;
        }
        if (jugador.getTraspaso() == Traspaso.APROBADO_ENTRENADOR) {
            jugador.setTraspaso(acepta ? Traspaso.APROBADO_PRESIDENTE : Traspaso.RECHAZADO_PRESIDENTE);
            System.out.println("El jugador " + jugador.getNombre() +  " será traspasado " + jugador.getTraspaso() + " por el presidente");
        } else {
            System.out.println("No se pudo decidir el traaspaso de " + jugador.getNombre());
        }
    }

    public void nuevoJugador (jugador jugador) {
        if (jugador != null && !lista_jugadores.contains(jugador)){
            lista_jugadores.add(jugador);
            jugador.setEquipoID(this);
        }
    }

    public void borrarJugador(jugador jugador) {
        if (jugador != null && lista_jugadores.contains(jugador)) {
            lista_jugadores.remove(jugador);
            jugador.setEquipoID(null);
        }
    }

    // --------------------------------------------metodo toString---------------------------------------------

    @Override
    public String toString() {
        return "equipo [nombre=" + nombre + ", abreviatura=" + abreviatura + ", presidenteID=" + presidenteID
                + ", entrenadorID=" + entrenadorID + ", lista_jugadores=" + lista_jugadores + "]";
    }
    public equipo getEquipoID() {
        return equipoID;
    }
    public void setEquipoID(equipo equipoID) {
        equipoID = equipoID;
    }
    public static int getEquiposTotales() {
        return equiposTotales;
    }
    public static void setEquiposTotales(int equiposTotales) {
        equipo.equiposTotales = equiposTotales;
    }
    

}
