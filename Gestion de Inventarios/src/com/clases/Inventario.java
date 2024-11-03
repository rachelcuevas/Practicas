package com.clases;  

import java.util.ArrayList;  
import com.interfases.Auditable;  
import com.interfases.Validable;  

public class Inventario implements Auditable, Validable {  
    private ArrayList<Producto> productos;  

    public Inventario(ArrayList<Producto> productos) {  
        this.productos = productos;  
    }  
    
    public void agregarProducto(Producto producto) {  
        productos.add(producto);  
        registraAccion("Añadido: " + producto.getNombre());  
    }  
    
    public boolean eliminarProducto(Producto producto) {  
        boolean eliminado = productos.remove(producto);  
        if (eliminado) {  
            registraAccion("Eliminado: " + producto.getNombre());  
        }  
        return eliminado;  
    }  
    
    public Producto buscarProducto(String criterio) {  
        for (Producto producto : productos) {  
            if (producto.getIdProducto().equals(criterio) || producto.getNombre().equalsIgnoreCase(criterio)) {  
                return producto; // Se encontró el producto  
            }  
        }  
        return null; // No se encontró el producto  
    }  

    public void listadoProductos() {  
        if (productos.isEmpty()) {  
            System.out.println("El inventario está vacío.");  
        } else {  
            System.out.println("Listado de productos en el inventario:");  
            for (Producto producto : productos) {  
                System.out.println("Código: " + producto.getIdProducto() +   
                                   ", Nombre: " + producto.getNombre() +   
                                   ", Precio: " + producto.getPrecio());  
            }  
        }  
    }  
    
    @Override  
    public Void registraAccion(String accion) {  
        System.out.println("Acción registrada: " + accion);
		return null;  
    }  

    @Override  
    public void validarInformacion() {  
        for (Producto producto : productos) {  
            producto.validarInformacion();  
        }
    }
}

