/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller14;

import unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios.Estudiante;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios.Persona;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios.Profesor;

/**
 *
 * @author mezab
 */
public class PBpersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();
            
            System.out.println("-----------///----------///---------");
        persona.presentarse();
            System.out.println("-----------///----------///---------");

            System.out.println("\n");
        estudiante.presentarse();
            System.out.println("\n");
        profesor.presentarse();
    }
    
}
