package reto4;

import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author 
   Kelly Julieth Arango Henao
   Juan Camilo Rivera Avendaño
 */
public class ClaseBicicleta extends ClaseVehiculo {

    String usoVehiculo;  //montaña, carrera o sencilla.

    public ClaseBicicleta() {
        this.usoVehiculo = "";
    }

    @Override
    public void registrar() {
        this.usoVehiculo = tool.ingresoString("Uso del vehiculo");
        super.registrar();
    }

    public String getUsoVehiculo() {
        return usoVehiculo;
    }

    public void setUsoVehiculo(String usoVehiculo) {
        this.usoVehiculo = usoVehiculo;
    }

    @Override
    public String toString() {
        return super.toString() + "Uso: " + getUsoVehiculo();
    }
}
