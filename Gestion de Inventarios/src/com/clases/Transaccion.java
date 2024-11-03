package com.clases;  

import com.interfases.Auditable;  
import com.interfases.Validable;  

public class Transaccion implements Auditable, Validable {  
    private String idTransaccion;  
    private String tipo;  
    private double monto;  

    public Transaccion(String idTransaccion, String tipo, double monto) {  
        this.idTransaccion = idTransaccion;  
        this.tipo = tipo;  
        this.monto = monto;  
    }  

    public String getIdTransaccion() {  
        return idTransaccion;  
    }  

    public void setIdTransaccion(String idTransaccion) {  
        this.idTransaccion = idTransaccion;  
    }  

    public String getTipo() {  
        return tipo;  
    }  

    public void setTipo(String tipo) {  
        this.tipo = tipo;  
    }  

    public double getMonto() {  
        return monto;  
    }  

    public void setMonto(double monto) {  
        this.monto = monto;  
    }  

    @Override  
    public Void registraAccion(String accion) {  
        System.out.println("Transacción registrada: " + accion);
		return null;  
    }  

    @Override  
    public void validarInformacion() {  
        if (tipo == null || tipo.isEmpty()) {  
            System.out.println("El tipo de transacción no puede estar vacío.");  
            return;  
        }  

        if (monto <= 0) {  
            System.out.println("El monto de la transacción debe ser mayor que cero.");  
            return;  
        }  

        System.out.println("Transacción validada correctamente.");  
    }  
}