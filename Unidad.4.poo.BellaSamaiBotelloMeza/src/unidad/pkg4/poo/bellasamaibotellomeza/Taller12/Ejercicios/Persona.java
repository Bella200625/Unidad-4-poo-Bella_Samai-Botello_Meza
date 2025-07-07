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
public class Persona implements Hablador, Trabajador {

    @Override
    public void hablar() {
        System.out.println("Las personas hablan");
    }

    @Override
    public void trabajar() {
        System.out.println("Las personas trabajan");
    }
    
}
