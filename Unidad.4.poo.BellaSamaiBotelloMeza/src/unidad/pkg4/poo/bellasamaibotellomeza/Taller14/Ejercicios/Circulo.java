/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios;

/**
 *
 * @author mezab
 */
public class Circulo extends Figuras {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override 
        public void area(){
            super.area();
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El area del circulo es: " + area);
        
        }

    
}
