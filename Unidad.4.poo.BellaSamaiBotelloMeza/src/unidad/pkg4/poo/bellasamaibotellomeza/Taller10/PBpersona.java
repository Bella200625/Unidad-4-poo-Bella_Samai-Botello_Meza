/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller10;


import unidad.pkg4.poo.bellasamaibotellomeza.Taller10.Ejercicios.Profesor;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller10.Ejercicios.Estudiante;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller10.Ejercicios.Persona;

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
        Profesor profesor = new Profesor();
        Estudiante estudiante = new Estudiante();
        
        persona.presentarse();
        
            System.out.println("\n");
        profesor.presentarse();
            System.out.println("\n");
        estudiante.presentarse();
    }
    
}
