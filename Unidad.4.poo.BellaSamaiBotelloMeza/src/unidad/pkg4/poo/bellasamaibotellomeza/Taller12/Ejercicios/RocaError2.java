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
public class RocaError2 implements Nadador, Cantante, Volador {

     /*
    Las interfaces deben usarse para modelar 
       comportamientos cohesivos y lógicos que una 
       clase realmente posee. Implementar interfaces 
       que no corresponden con la naturaleza o propósito 
        de una clase 
        
    */
    
    @Override
    public void nadar() {
        System.out.println("La rocas pueden nadar");
    }

    @Override
    public void cantar() {
        System.out.println("Las rocas pueden cantar");
    }

    @Override
    public void volar() {
        System.out.println("Lsas rocas pueden volar muy altooo");
    }
    
}
