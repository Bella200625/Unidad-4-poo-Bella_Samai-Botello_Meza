/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller12.Ejercicios;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller12.Ejercicios.*;
/**
 *
 * @author mezab
 */
public class ErrorCaballo2 implements Cantante, Volador {
    /*
    Las interfaces deben usarse para modelar 
       comportamientos cohesivos y lógicos que una 
       clase realmente posee. Implementar interfaces 
       que no corresponden con la naturaleza o propósito 
        de una clase 
        
    */
    @Override
    public void cantar() {
        System.out.println("Mi caballo canta opera");
                
    }

    @Override
    public void volar() {
        System.out.println("Mi caballo puede volar");
    }
    
    
}
