/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios;

/**
 *
 * @author mezab
 */
public class Rectangulo extends Figuras {
     private double base;
     private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
     
     
    
    
     @Override 
        public void area(){
            super.area();
            double area = base*altura;
            System.out.println("El area del rectangulo es: " + area);
        
        }
    
}
