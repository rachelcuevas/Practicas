package Clases;  

import java.util.ArrayList;  

public class Prestamo {  
    // ATRIBUTOS DE CLASE  
    public static String tipo = "Prestamo";  

    // ATRIBUTOS  
    private String nombre;  
    private ArrayList<Libros> librosArray;  // Cambiado de String a Libros  
    private Boolean estatus;  

    // CONSTRUCTOR  
    public Prestamo() {  
        this.nombre = "Invitado";  
        this.librosArray = new ArrayList<>();  
        this.estatus = true;  
    }  

    // Constructor sobrecargado  
    public Prestamo(String nombre, boolean status) {  
        this.nombre = nombre;  
        this.librosArray = new ArrayList<>();  
        this.estatus = status;  
    }  

    // Métodos getters y setters  
    public String getNombre() {  
        return nombre;  
    }  

    public void setNombre(String nombre) {  
        this.nombre = nombre;  
    }  

    public ArrayList<Libros> getLibros() {  // Cambiado para que coincida con el tipo  
        return librosArray;  
    }  

    public void setLibros(ArrayList<Libros> libros) {  // Cambiado para que coincida con el tipo  
        this.librosArray = libros;  
    }  

    public Boolean getEstatus() {  
        return estatus;  
    }  

    public void setEstatus(Boolean estatus) {  
        this.estatus = estatus;  
    }  

    // METODO PARA AÑADIR UN LIBRO AL PRESTAMO  
    public void agregarLibro(Libros libro) {  
        librosArray.add(libro); // Aquí agregas el objeto libro en lugar de su título  
    }  

    // METODO QUE RETORNA SI ESTA DISPONIBLE O NO  
    public void mostrarEstatus() {  
        if (librosArray.isEmpty()) {  
            System.out.println("No hay libros prestados");  
        } else {  
            System.out.println("Libros en préstamo: " + librosArray);  
        }  
    }  

    // METODO QUE MUESTRA DETALLES DEL PRESTAMO  
    public void detallesPrestamo() {  
        System.out.println("Nombre del usuario: " + nombre + " Estatus del préstamo: " + (estatus ? "Activo" : "Inactivo"));  
    }  

    // METODO PARA SUMAR PRECIOS DE REEMPLAZO  
    public double calcularTotalDeReemplazo() {  
        double total = 0.0;  
        for (Libros libro : librosArray) {  
            total += libro.getPrecioDeReemplazo();  
        }  
        return total;  
    }  
}  
