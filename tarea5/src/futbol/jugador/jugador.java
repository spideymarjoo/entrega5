package futbol.jugador;
import java.util.Date;

public class jugador {
    private String nombre;
    private Date fecha_nacimiento;
    private String pais;
    private Posicion posicion;
    private int numdorsal;
    public Traspaso traspaso;
// --------------------------------------------Nuestro Constructor----------------------------------------
    public jugador(String nombre_jugador, Date fecha_nacimiento, String pais, Posicion posicion, int dorsal_jugador, Traspaso traspaso_jugador){
        this.nombre = nombre_jugador;
        this.fecha_nacimiento = fecha_nacimiento;
        this.pais = pais;
        this.posicion = posicion;
        this.numdorsal = dorsal_jugador;
        this.traspaso = traspaso_jugador;

    }
//-------------------------------- Setters and Getters---------------------------------------
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        if(fecha_nacimiento != null){
            this.fecha_nacimiento = fecha_nacimiento;
        }else{
            System.out.println("Fecha de nacimiento inválida");
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        if(pais != null){
            this.pais = pais;
        }else{
            System.out.println("País no reconocido");
        }
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if(posicion != null){
            this.posicion = posicion;
        }else
        System.out.println("Posicion invalida");
    }

    public int getDorsal() {
        return numdorsal;
    }

    public void setDorsal(int dorsal) {
        if(dorsal >= 1){
            this.numdorsal = dorsal;
        }else{
            System.out.println("Error, ...");
            this.numdorsal = 0;
        }
    }

    public Traspaso getTraspaso() {
        return traspaso;
    }

    public void setTraspaso(Traspaso traspaso) {
        if(traspaso != null){
            this.traspaso = traspaso;
        }else{
            System.out.println("Error de traspaso");
        }
    }
    @Override
    public String toString() {
        return "jugador [nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", pais=" + pais + ", posicion="
                + posicion + ", numdorsal=" + numdorsal + ", traspaso=" + traspaso + "]";
    }
    
}


