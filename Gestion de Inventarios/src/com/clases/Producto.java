package com.clases;  

import com.interfases.Validable;  

public class Producto implements Validable {  
    
    private String idProducto;  // Cambiar a private  
    private String nombre;      // Cambiar a private  
    private double precio;      // Cambiar a private  

    public Producto(String idProducto, String nombre, double precio) {  
        this.idProducto = idProducto;  
        this.nombre = nombre;  
        this.precio = precio;  
    }  

    public String getIdProducto() {  
        return idProducto;  
    }  

    public void setIdProducto(String idProducto) {  
        this.idProducto = idProducto;  
    }  

    public String getNombre() {  
        return nombre;  
    }  

    public void setNombre(String nombre) {  
        this.nombre = nombre;  
    }  

    public double getPrecio() {  
        return precio;  
    }  

    public void setPrecio(double precio) {  
        this.precio = precio;  
    }  

    @Override  
    public void validarInformacion() {  
        if (nombre == null || nombre.isEmpty()) {  
            System.out.println("El nombre del producto no puede estar vacío.");  
            return;  // Finaliza el método si la información no es válida  
        }  

        if (precio <= 0) {  
            System.out.println("El precio del producto debe ser mayor que cero.");  
            return;  // Finaliza el método si la información no es válida  
        }  

        System.out.println("Producto validado correctamente.");  
    }  
}


