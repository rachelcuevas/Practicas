package Clases;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehiculo> vehiculos; // Lista de vehículos
    private int capacidadMaxima; // Capacidad máxima del garaje

    // Constructor que inicializa el garaje con la capacidad dada
    public Garage(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.vehiculos = new ArrayList<>(); // Inicializamos el ArrayList
    }

    // Método para agregar un vehículo si hay espacio disponible
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() < capacidadMaxima) {
            vehiculos.add(vehiculo);
            System.out.println("Vehículo añadido: " + vehiculo.despliegaInformacion());
        } else {
            System.out.println("No hay espacio disponible para añadir más vehículos.");
        }
    }

    // Método para mostrar todos los vehículos en el garaje
    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("El garaje está vacío.");
        } else {
            System.out.println("Lista de Vehículos en el Garaje:");
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo.despliegaInformacion());
            }
        }
    }
}
