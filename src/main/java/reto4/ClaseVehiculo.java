package reto4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 
   Kelly Julieth Arango Henao
   Juan Camilo Rivera Avendaño
 */
public abstract class ClaseVehiculo {
    
    String descripcionVehiculo, tipoVehiculo, modeloVehiculo;   
    int añoModelo;
    long precioHora, registro;
    boolean disponible;
    ClaseRecursos tool = new ClaseRecursos();
    Scanner escaner = new Scanner(System.in);
    int indice = 0;
    ClasePersona cliente = new ClasePersona();

    public ClaseVehiculo() {
        
          
        descripcionVehiculo = " ";
        tipoVehiculo = " ";
        modeloVehiculo = " ";
        añoModelo = 0;
        precioHora = 0;
        registro = -1;
        disponible = false;
        
    }

    public void registrar() {
        
        this.descripcionVehiculo = tool.ingresoString("Ingrese la descripción del vehiculo");
        this.tipoVehiculo = tool.ingresoString("Ingrese si es bicicleta o auto:");
        this.modeloVehiculo = tool.ingresoString("Ingrese el modelo del vehiculo");
        this.añoModelo = tool.ingresoInt("Ingrese el año del modelo");
        this.precioHora = tool.ingresoLong("Ingrese el precio por hora de alquiler");
        this.disponible = true;

    }

    public void consultar(ArrayList<ClaseVehiculo> registrados) {
        indice = tool.ingresoInt("Ingrese el registro del vehiculo:");

    }

    public void regresar(ArrayList<ClasePersona> clientes){
    
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getDescripcion() {
        return descripcionVehiculo;
    }

    public void setDescripcion(String descripcionVehiculo) {
        this.descripcionVehiculo = descripcionVehiculo;
    }

    public String getTipo() {
        return tipoVehiculo;
    }

    public void setTipo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getModelo() {
        return modeloVehiculo;
    }

    public void setModelo(String modelo) {
        this.modeloVehiculo = modelo;
    }

    public int getAño() {
        return añoModelo;
    }

    public void setAño(int año) {
        this.añoModelo = año;
    }

    public long getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(long precioHora) {
        this.precioHora = precioHora;
    }

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Los datos del vehiculo son: \nDescripción" + descripcionVehiculo + "\nTipo: " + tipoVehiculo + "\nModelo: " + modeloVehiculo + "\nAño: " + añoModelo + "\nPrecioHora: " + precioHora + "\nRegistro: " + registro + "\nEstado:" + disponible + "\n";
    }

}
