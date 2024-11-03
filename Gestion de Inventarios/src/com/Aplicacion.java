package com;  

import com.clases.Inventario;  
import com.clases.Producto;  
import com.clases.Transaccion;  

import java.util.ArrayList;  

public class Aplicacion {  
    public static void main(String[] args) {  
        ArrayList<Producto> productos = new ArrayList<>();  
        Producto producto1 = new Producto("P001", "Laptop", 1200.00);  
        Producto producto2 = new Producto("P002", "Teclado", 50.00);  
        Producto producto3 = new Producto("P003", "Ratón", 25.00);  
        
        // Validando información de los productos  
        producto1.validarInformacion();  
        producto2.validarInformacion();  
        producto3.validarInformacion();  
        
        // Creando el inventario y agregando productos  
        Inventario inventario = new Inventario(productos);  
        inventario.agregarProducto(producto1);  
        inventario.agregarProducto(producto2);  
        inventario.agregarProducto(producto3);  
        
        System.out.println("\nListado inicial de productos:");  
        inventario.listadoProductos();  
        
        // Eliminando un producto  
        inventario.eliminarProducto(producto3);  
        
        System.out.println("\nListado después de eliminar un producto:");  
        inventario.listadoProductos();  
        
        // Buscando un producto  
        Producto encontrado = inventario.buscarProducto("P001");  
        System.out.println("\nBúsqueda de producto:");  
        if (encontrado != null) {  
            System.out.println("Producto encontrado: " + encontrado.getNombre());  
        } else {  
            System.out.println("Producto no encontrado.");  
        }  
        
        // Registrando una transacción  
        Transaccion transaccion = new Transaccion("T001", "Compra", 1200.00);  
        transaccion.registraAccion("Compra de producto: " + producto1.getNombre());  
        transaccion.validarInformacion();  
    }  
}
