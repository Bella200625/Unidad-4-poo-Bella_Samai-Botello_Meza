/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller11.Ejercicios;

/**
 *
 * @author mezab
 */
public class Vendedor extends Empleado {
    private double salario;

    public Vendedor() {
        salario = 1400000;
    }
    
    
    
    @Override
   public double calcularSalario (){
       System.out.println("\n");
       System.out.println("Vendedor: ");
       return salario*0.10;
   }

    
}
