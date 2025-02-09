package futbol.equipo;
import futbol.entrenador.entrenador;
import futbol.jugador.jugador;
import futbol.presidente.presidente;
import java.util.ArrayList;


public class equipo {
    private String nombre;
    private String abreviatura;
    private presidente presidenteID;
    private entrenador entrenadorID;
    private ArrayList<jugador> lista_jugadores;



    // -------------------------nuestro constructor-------------------------
    public equipo(String nombre, String abreviatura, presidente presidenteID, entrenador entrenadorID, ArrayList lista_jugadores) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.presidenteID = presidenteID;
        this.entrenadorID = entrenadorID;
        this.lista_jugadores = lista_jugadores;

        
    }
    
    // -------------------------getters y setters---------------------------
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

    @Override
    public String toString() {
        return "equipo [nombre=" + nombre + ", abreviatura=" + abreviatura + ", presidenteID=" + presidenteID
                + ", entrenadorID=" + entrenadorID + ", lista_jugadores=" + lista_jugadores + "]";
    }
    

}
