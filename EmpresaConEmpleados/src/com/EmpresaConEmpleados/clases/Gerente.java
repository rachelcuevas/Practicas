package com.EmpresaConEmpleados.clases;  

public class Gerente extends Empleado {  
    private double bono;  

    public Gerente(String nombreEmpleado, double salario, double bono) {  
        super(nombreEmpleado, salario);  
        this.bono = bono;  
    }  

    public double getBono() {  
        return bono;  
    }  

    public void setBono(double bono) {  
        this.bono = bono;  
    }  

    @Override  
    public String toString() {  
        return "Gerente: " + super.toString() + "[bono=" + bono + "]";  
    }  

    @Override  
    public double calcularSalario() {  
        // Calcular el salario total como salario base más bono  
        return super.getSalario() * 160 + bono;  
    }  

    @Override  
    public void mostrarInformacion(String string) {  
        super.mostrarInformacion(string);  
    }  
}



