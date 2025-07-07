/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller8;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller8.Ejercicios.Estudiante;

/**
 *
 * @author mezab
 */
public class PBestudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Estudiante estudiante1 = new Estudiante("Alvaro", 30, "Matricula");
       Estudiante estudiante2 = new Estudiante("Msii", 35 , "Matricula");
        
    estudiante1.MD();
        System.out.println("\n");
    estudiante2.MD();
    }
    
}
