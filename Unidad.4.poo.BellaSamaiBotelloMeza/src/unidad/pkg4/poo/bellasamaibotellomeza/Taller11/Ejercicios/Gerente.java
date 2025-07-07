/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller11.Ejercicios;

/**
 *
 * @author mezab
 */
public class Gerente extends Empleado {
   
    private double salario;

    public Gerente(double salario) {
        this.salario = salario;
    }
    
  @Override       
public double calcularSalario (){
    return salario*0.11;

}

    
}
