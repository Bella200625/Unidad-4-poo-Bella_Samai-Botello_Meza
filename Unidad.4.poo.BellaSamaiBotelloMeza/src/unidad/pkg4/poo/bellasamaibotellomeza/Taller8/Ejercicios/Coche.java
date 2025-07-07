/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller8.Ejercicios;

/**
 *
 * @author mezab
 */
public class Coche extends Vehiculo {
    
    private int numeroDePuertas;
    
    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
 
    //metodo para imprimir informacion de coche
    
    @Override
    public void MD () {
        super.MD();
        System.out.println("el coche tiene el siguiente numero de puertas: " + numeroDePuertas);
    
     }
    
    
    
    
}
