/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller10;

import unidad.pkg4.poo.bellasamaibotellomeza.Taller10.Ejercicios.*;

/**
 *
 * @author mezab
 */
public class PBvehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo ();
        Bicicleta bicicleta = new Bicicleta (); 
        
        System.out.println("----------//------------//-----");
        vehiculo.moverse();
        System.out.println("----------//------------//-----");
        System.out.println("\n");
        bicicleta.moverse();
    }
    
}
