package futbol.jugador;
import java.util.Date;

public class jugador {
    private String nombre;
    private Date fecha_nacimiento;
    private String pais;
    private Posicion posicion;
    private int dorsal;
    public Traspaso traspaso;
// --------------------------------------------Nuestro Constructor----------------------------------------
    public jugador(String nombre_jugador, Date fecha_nacimiento, String pais, Posicion posicion, int dorsal_jugador, Traspaso traspaso_jugador){
        this.nombre = nombre_jugador;
        this.fecha_nacimiento = fecha_nacimiento;
        this.pais = pais;
        this.posicion = posicion;
        this.dorsal = dorsal_jugador;
        this.traspaso = traspaso_jugador;
        
    }
//-------------------------------------------- Setters and Getters---------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Traspaso getTraspaso() {
        return traspaso;
    }

    public void setTraspaso(Traspaso traspaso) {
        this.traspaso = traspaso;
    }
    

    
}


