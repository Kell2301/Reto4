package reto4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
/**
 *
 * @author 
   Kelly Julieth Arango Henao
   Juan Camilo Rivera Avendaño
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        int opcion = 8;
        ClaseRecursos tool = new ClaseRecursos();
        ArrayList<ClaseVehiculo> registrados = new ArrayList();
        ArrayList<ClasePersona> clientes = new ArrayList();
        ClaseAlquiler alquilados = new ClaseAlquiler();
        while (opcion != 8) {

            opcion = tool.ingresoInt("\n ¿Qué desea hacer?:\n\n"
                    + "1) Registrar un auto\n" 
                    + "2) Registrar una bicicleta.\n"
                    + "3) Consultar autos disponibles.\n" 
                    + "4) Consultar bicicletas disponibles. \n"
                    + "5) Consultar vehiculo.\n"
                    + "6) Alquilar.\n"
                    + "7) Regresar\n"
                    + "8) Salir del menú\n");
            if (opcion == 1) {
                ClaseAuto auto = new ClaseAuto();
                auto.registrar();
                auto.setRegistro(registrados.size());
                registrados.add(auto);

                System.out.println("Se completó el registro:)");
            }
            if (opcion == 2) {
                ClaseBicicleta bici = new ClaseBicicleta();
                bici.registrar();
                bici.setRegistro(registrados.size());
                registrados.add(bici);
                System.out.println("Se completó el registro:)");
            }
            if (opcion == 3) {
                System.out.println("Autos disponibles:\n");
                tool.mostrarAutosDisponibles(registrados);
                System.out.println("--------------------------------------------------------------------------------------------------------------");
            }
            if (opcion == 4) {
                System.out.println("Biciletas disponibles:\n");
                tool.mostrarBicisDisponibles(registrados);
                System.out.println("--------------------------------------------------------------------------------------------------------------");
            }
            if (opcion == 5) {
                tool.mostrarTodo(registrados);
                System.out.println(registrados.get(tool.ingresoInt("Ingrese el registro del vehiculo a consultar:")).toString());
            }
            if (opcion == 6) {
                tool.mostrarTodo(registrados);
                alquilados.alquilar(registrados.get(tool.ingresoInt("Ingrese el registro del vehiculo a alquilar")),clientes); //almacene al cliente en el arraylist de clientes 
                
            }
            if (opcion == 7) {
                System.out.println(LocalDateTime.now().getHour());
            }

        }
    }
        
}
