package com.EmpresaConEmpleados.clases;  

public class Director extends Gerente {  
    private double valorAcciones;  

    public Director(String nombreEmpleado, double salario, double bono, double valorAcciones) {  
        super(nombreEmpleado, salario, bono);  
        this.valorAcciones = valorAcciones;  
    }  

    public double getValorAcciones() {  
        return valorAcciones;  
    }  

    public void setValorAcciones(double valorAcciones) {  
        this.valorAcciones = valorAcciones;  
    }  

    @Override  
    public String toString() {  
        return "Director: " + super.toString() + "[valorAcciones=" + valorAcciones + "]";  
    }  

    @Override  
    public double calcularSalario() {   
        return super.calcularSalario() + valorAcciones;  
    }  

    @Override  
    public void mostrarInformacion(String string) {  
        super.mostrarInformacion(string);  
    }  
}  
	

