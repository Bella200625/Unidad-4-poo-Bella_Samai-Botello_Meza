/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller11.Ejercicios;

/**
 *
 * @author mezab
 */
public abstract class Figura {
   
    public abstract double calcularArea();

    
    public void mostrarArea() {
        System.out.println("El area de la figura es: " + calcularArea());
        
        
    }
    
    
}
