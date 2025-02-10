package futbol.equipo;
import futbol.entrenador.entrenador;
import futbol.jugador.Traspaso;
import futbol.jugador.jugador;
import futbol.presidente.presidente;
import java.util.ArrayList;

/**
 * Representa un equipo de fútbol con su nombre, abreviatura, 
 * entrenador, presidente y lista de jugadores.
 * 
 * @author Entrega5
 * @version 1.0
 */

public class equipo {
    private String nombre;
    private String abreviatura;
    private presidente presidenteID;
    private entrenador entrenadorID;
    private equipo equipoID;
    private ArrayList<jugador> lista_jugadores;
    private static int equiposTotales = 0;

    /**
     * Constructor de la clase equipo.
     *
     * @param nombre Nombre del equipo.
     * @param abreviatura Abreviatura del equipo.
     * @param presidenteID Presidente del equipo.
     * @param entrenadorID Entrenador del equipo.
     * @param lista_jugadores Lista de jugadores del equipo.
     * @param equipoID Identificador del equipo.
     */

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
    
    /**
     * Obtiene la cantidad total de equipos creados.
     * 
     * @return Número total de equipos creados.
     */
    
    public static int getequiposTotales() {
        return equiposTotales;
        
    }
    
    // -------------------------getters y setters---------------------------

    /**
     * Obtiene el identificador del equipo.
     * 
     * @return Identificador del equipo.
     */

    public equipo getequipoID() {
        return equipoID;
    }
    /**
     * Establece el identificador del equipo.
     * 
     * @param equipoID Identificador del equipo.
     */

    public void setequipoID(equipo equipoID) {
        if(equipoID !=null){
            this.equipoID = equipoID;
        }else{
            System.out.println("Equipo no reconocido");
        }
    }

    /**
     * Obtiene el nombre del equipo.
     * 
     * @return Nombre del equipo.
     */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre del equipo.
     * 
     * @param nombre Nuevo nombre del equipo.
     */

    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre inválido");
        }
    }

    /**
     * Obtiene la abreviatura del equipo.
     * 
     * @return Abreviatura del equipo.
     */

    public String getAbreviatura() {
        return abreviatura;
    }

    /**
     * Establece la abreviatura del equipo.
     * 
     * @param abreviatura Nueva abreviatura del equipo.
     */

    public void setAbreviatura(String abreviatura) {
        if(abreviatura != null){
            this.abreviatura = abreviatura;
        }else{
            System.out.println("Abreviatura no reconocida");
        }
    }

    /**
     * Obtiene el presidente del equipo.
     * 
     * @return Presidente del equipo.
     */

    public presidente getPresidenteID() {
        return presidenteID;
    }

    /**
     * Establece el presidente del equipo.
     * 
     * @param presidenteID Nuevo presidente del equipo.
     */

    public void setPresidenteID(presidente presidenteID) {
        if(presidenteID != null){
            this.presidenteID = presidenteID;
        }else{
            System.out.println("Presidente no reconocido");
        }
    }

    /**
     * Obtiene el entrenador del equipo.
     * 
     * @return Entrenador del equipo.
     */

    public entrenador getEntrenadorID() {
        return entrenadorID;
    }

    /**
     * Establece el entrenador del equipo.
     * 
     * @param entrenadorID Nuevo entrenador del equipo.
     */

    public void setEntrenadorID(entrenador entrenadorID) {
        if(entrenadorID != null){
            this.entrenadorID = entrenadorID;
        }else{
            System.out.println("Entrenador no reconocido");
        }
        
    }

    /**
     * Obtiene la lista de jugadores del equipo.
     * 
     * @return Lista de jugadores del equipo.
     */

    public ArrayList<jugador> getLista_jugadores() {
        return lista_jugadores;
    }

    /**
     * Establece la lista de jugadores del equipo.
     * 
     * @param lista_jugadores Nueva lista de jugadores.
     */

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

    /**
     * Representación en cadena del equipo.
     * 
     * @return Información del equipo en formato legible.
     */

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
