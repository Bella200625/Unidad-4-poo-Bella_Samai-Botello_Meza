/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller11.Ejercicios;

/**
 *
 * @author mezab
 */
 public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

public Rectangulo(double largo, double ancho) {
    this.largo = largo;
    this.ancho = ancho;
}
    

    @Override
public double calcularArea() {
    return largo * ancho;
    
    
    
    
    
    }
}