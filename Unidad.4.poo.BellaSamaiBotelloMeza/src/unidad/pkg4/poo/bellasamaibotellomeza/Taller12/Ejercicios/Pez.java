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
public class Pez implements Nadador, Respirador {
    
    @Override
    public void nadar(){
        System.out.println("El pez nada");
    }
    
    @Override
    public void respirar(){
        System.out.println("El pez respira");
    }
}
