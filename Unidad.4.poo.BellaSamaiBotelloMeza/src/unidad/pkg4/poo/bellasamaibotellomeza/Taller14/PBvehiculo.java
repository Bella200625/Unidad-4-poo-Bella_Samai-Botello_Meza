/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller14;

import unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios.Bicicleta;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios.Coche;

/**
 *
 * @author mezab
 */
public class PBvehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Coche coche = new Coche();
        Bicicleta bici = new Bicicleta();
        
        coche.mover();
        System.out.println("\n");
        bici.mover();
    }
    
}
