package reto4;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
/**
 *
 * @author 
   Kelly Julieth Arango Henao
   Juan Camilo Rivera Avendaño
 */

public class ClaseRecursos {

    Scanner escaner = new Scanner(System.in);

    public void mostrarAutosDisponibles(ArrayList<ClaseVehiculo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            
                       
            if (lista.get(i).tipoVehiculo.equalsIgnoreCase("auto") && lista.get(i).disponible) {
                System.out.println(i + ") " + lista.get(i).modeloVehiculo + " " + lista.get(i).añoModelo + " " + "[" + lista.get(i).registro + "]");
            }

        }

    }

    public void mostrarBicisDisponibles(ArrayList<ClaseVehiculo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).tipoVehiculo.equalsIgnoreCase("bicicleta") && lista.get(i).disponible) {
                System.out.println(i + ") " + lista.get(i).modeloVehiculo + " " + lista.get(i).añoModelo + " " + "[" + lista.get(i).registro + "]\n");
            }

        }

    }

    public void mostrarTodo(ArrayList<ClaseVehiculo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ") " + lista.get(i).modeloVehiculo + " " + lista.get(i).añoModelo + " " + "[" + lista.get(i).registro + "]");
        }
    }

    public String ingresoString(String text) {
        System.out.println(text);
        return (escaner.next());
    }

    public int ingresoInt(String text) {
        System.out.println(text);
        return (escaner.nextInt());
    }

    public long ingresoLong(String text) {
        System.out.println(text);
        return (escaner.nextLong());
    }

}

