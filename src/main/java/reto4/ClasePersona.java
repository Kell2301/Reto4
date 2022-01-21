package reto4;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 *
 * @author 
   Kelly Julieth Arango Henao
   Juan Camilo Rivera Avendaño
 */
public class ClasePersona {

    String tipoDocumento;
    int numeroDocumento;
    String nombreCompleto;
    String uso;
    LocalDateTime alquilerInicio;
    LocalDateTime alquilerFinal;
    long valorPagar;

    public ClasePersona() {
        tipoDocumento = " ";
        numeroDocumento = 0;
        nombreCompleto = "";
        uso = "";
        alquilerInicio = LocalDateTime.MIN;
        alquilerFinal = LocalDateTime.MAX;
        valorPagar = 0;
    }

    public ClasePersona(String tipoDocumento, int numeroDocumento, String nombreCompleto, String uso, LocalDateTime alquilerInicio) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;       
        this.nombreCompleto = nombreCompleto;
        this.uso = uso;
        this.alquilerInicio = alquilerInicio;
    }

    public String getTipoID() {
        return tipoDocumento;
    }

    public void setTipoID(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getID() {
        return numeroDocumento;
    }

    public void setID(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombreCompleto;
    }

    public void setNombre(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getIntencion() {
        return uso;
    }

    public void setIntencion(String intencion) {
        this.uso = intencion;
    }

    public LocalDateTime getIngreso() {
        return alquilerInicio;
    }

    public void setIngreso(LocalDateTime alquilerInicio) {
        this.alquilerInicio = alquilerInicio;
    }

    public LocalDateTime getSalida() {
        return alquilerFinal;
    }

    public void setSalida(LocalDateTime alquilerFinal) {
        this.alquilerFinal = alquilerFinal;
    }

    public long getPago() {
        return valorPagar;
    }

    public void setPago(long valorPagar) {
        this.valorPagar = valorPagar;
    }

}
