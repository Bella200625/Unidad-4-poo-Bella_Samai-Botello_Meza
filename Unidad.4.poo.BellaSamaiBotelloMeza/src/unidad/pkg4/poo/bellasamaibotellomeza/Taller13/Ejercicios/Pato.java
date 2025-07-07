/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller13.Ejercicios;

/**
 *
 * @author mezab
 */
public class Pato implements Nadador, Volador {
    
    private String especie;

    public Pato(String especie) {
        this.especie = especie;
    }
    
   
    public void patito() {
        System.out.println("Este pato pertene a la especie: " + especie);
        
    }

    @Override
    public void nadar() {
            System.out.println("Los patos pueden nadar");
    }

    @Override
    public void volar() {
         System.out.println("Los patos pueden volar");
    }
    
}
