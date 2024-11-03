package com;  

import com.EmpresaConEmpleados.clases.Empleado;  
import com.EmpresaConEmpleados.clases.Gerente;  
import com.EmpresaConEmpleados.clases.Director;  

public class Aplicacion {  

    public static void main(String[] args) {  
        
 
        Empleado empleado1 = new Empleado("Rodrigo", 500.90);  
        Gerente gerente1 = new Gerente("Manuel", 1000.99, 150.50);  
        Director director1 = new Director("Matias", 5000.99, 150.99, 570.50);  
         
        System.out.println(empleado1);  
        System.out.println("Salario total de " + empleado1.getNombreEmpleado() + ": " + empleado1.calcularSalario());  
        
        System.out.println(gerente1);  
        System.out.println("Salario total de " + gerente1.getNombreEmpleado() + ": " + gerente1.calcularSalario());  
        
        System.out.println(director1);  
        System.out.println("Salario total de " + director1.getNombreEmpleado() + ": " + director1.calcularSalario());  
    }  
}  