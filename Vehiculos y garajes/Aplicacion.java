import Clases.Garage;
import Clases.Vehiculo;

public class Aplicacion {
    public static void main(String[] args) {

        // Creamos tres objetos Vehiculo
        Vehiculo autoUno = new Vehiculo("Toyota", "Yaris", 2020);
        Vehiculo autoDos = new Vehiculo("Suzuki", "Swift", 2018);
        Vehiculo autoTres = new Vehiculo("Mitsubishi", "Eclipse", 2023);

        // Creamos un garaje con capacidad para 2 vehículos
        Garage garage = new Garage(2);

        // Intentamos agregar los vehículos al garaje
        garage.agregarVehiculo(autoTres);
        garage.agregarVehiculo(autoDos);

        // Mostramos los vehículos en el garaje
        garage.mostrarVehiculos();

        // Intentamos agregar otro vehículo (autoUno) cuando el garaje ya está lleno
        garage.agregarVehiculo(autoUno);
    }
}
