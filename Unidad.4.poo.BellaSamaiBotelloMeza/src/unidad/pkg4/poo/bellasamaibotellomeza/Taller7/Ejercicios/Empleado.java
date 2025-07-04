/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller7.Ejercicios;

/**
 *
 * @author mezab
 */


public class Empleado {
   public String nombre;
   int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    

   
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (salario >= 1400000){
        this.salario = salario;
        }else{
        
        this.salario = salario;
        }
        
        
        
    }
   
   
    public void MD (){
        
            
    if(salario >= 1400000){
    this.salario = salario;
    System.out.println("Empleado: " + nombre + ", salario: " + salario);
}else {
    System.err.println("El salario esta por debajo del minimo.");
    System.out.println("Empleado: " + nombre + ", el salario: " + salario + " no es valido");    
}
    
        
    
    }

    
}
