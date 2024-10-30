package Clases;

public class Vehiculo {

    // Atributos de clase
    public static String tipo = "Autos";
    public static int cantidad = 0;

    // Atributos de instancia
    public String marca;
    public String modelo;
    public int año;

    // Constructor para inicializar los atributos
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        cantidad++;  // Incrementamos la cantidad de vehículos creados
    }

    // Método que devuelve la información del vehículo en una cadena
    public String despliegaInformacion() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año;
    }
}
