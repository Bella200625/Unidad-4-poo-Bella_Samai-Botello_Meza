/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller12.Ejercicios;

/**
 *
 * @author mezab
 */
public class Ave implements Volador,Cantante {

    @Override
    public void volar() {
        System.out.println("El ave puede volar");
    }

    @Override
    public void cantar() {
        System.out.println("El ave puede cantar");
    }
    
}
