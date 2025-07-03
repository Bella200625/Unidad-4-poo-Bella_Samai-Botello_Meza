/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller3.Ejercicios;

/**
 *
 * @author mezab
 */
public class Coche {
    
    String marca;
    String modelo;
    static int contadorCoche = 0; 

    public Coche (){
    
    contadorCoche++;
   
    
    }
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    public static void CC() {
    
        System.out.println("Cantidad de coches: " + contadorCoche);
    
    
    }
    
    
    
    
    
    
}
