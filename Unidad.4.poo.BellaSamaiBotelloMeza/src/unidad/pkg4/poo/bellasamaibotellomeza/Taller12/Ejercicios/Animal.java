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
public class Animal implements Nadador, Volador {

    @Override
    public void nadar() {
        System.out.println("Este animal puede nadar");
    }

    @Override
    public void volar() {
        System.out.println("Este animal puede volar");
    }
    
    
}
