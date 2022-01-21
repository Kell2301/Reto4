package reto4;

import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author 
   Kelly Julieth Arango Henao
   Juan Camilo Rivera Avendaño
 */
public class ClaseAuto extends ClaseVehiculo {

    String placa;

    public ClaseAuto() {
        this.placa = " ";
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
@Override
    public void registrar() {
        this.placa = tool.ingresoString("Ingrese la placa del auto: ");
        super.registrar();
        
        
    }
    @Override
    public String toString(){
    return super.toString() + "placa: " + getPlaca() ;
    
    }
    
}