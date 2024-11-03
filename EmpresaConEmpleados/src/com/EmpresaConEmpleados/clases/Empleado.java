package com.EmpresaConEmpleados.clases;  

import java.util.ArrayList;  
import java.util.Random;  

public class Empleado {  
    private int numIdentificador;  
    private String nombreEmpleado;  
    private double salario;  
    public static ArrayList<Integer> identificador = new ArrayList<>();  

    public Empleado(String nombreEmpleado, double salario) {  
        this.numIdentificador = generarNumIdentificador();  
        this.nombreEmpleado = nombreEmpleado;  
        this.salario = salario;  
    }  

    public String getNombreEmpleado() {  
        return nombreEmpleado;  
    }  
    
    public void setNombreEmpleado(String nombreEmpleado) {  
        this.nombreEmpleado = nombreEmpleado;  
    }  
    
    public double getSalario() {  
        return salario;  
    }  
    
    public void setSalario(double salario) {  
        this.salario = salario;  
    }  

    public int getNumIdentificador() {  
        return numIdentificador;  
    }  

    public static ArrayList<Integer> getIdentificador() {  
        return identificador;  
    }  

    protected int generarNumIdentificador() {  
        Random random = new Random();  
        int numeroRandom = 1000 + random.nextInt(9000);  
        if (Empleado.identificador.contains(numeroRandom)) {  
            return generarNumIdentificador();  
        }  
        identificador.add(numeroRandom);  
        return numeroRandom;  
    }  
    @Override  
    public String toString() {  
        return "Empleado: " + nombreEmpleado + ", Identificador " + numIdentificador + ", salario: " + salario;  
    }  

    public double calcularSalario() {  
        return salario * 160;  
    }  
    
    public void mostrarInformacion(String string) {  
        System.out.println("Nombre del empleado: " + nombreEmpleado + ", Identificador: " + numIdentificador + ", percibe un salario de: " + salario);  
    }  
}  



