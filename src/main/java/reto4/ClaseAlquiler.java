package reto4;

import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author 
   Kelly Julieth Arango Henao
   Juan Camilo Rivera Avendaño
 */

public class ClaseAlquiler {
    ClasePersona cliente = new ClasePersona();

    public ClaseAlquiler() {
        cliente = new ClasePersona();
    }

    public void alquilar(ClaseVehiculo movil, ArrayList<ClasePersona> clientes) {
        ClaseRecursos tool = new ClaseRecursos();
        movil.disponible = false;
        cliente = new ClasePersona(tool.ingresoString("Tipo de documento: "), tool.ingresoInt("Número de documento: "), tool.ingresoString("Nombre completo: "), tool.ingresoString("Uso del vehiculo"), LocalDateTime.now());
        clientes.add(cliente);
    }

    public void regresar(ArrayList<ClasePersona> clientes, int cedula) {
        ClaseRecursos tool;
        tool = new ClaseRecursos();
    }
}
