/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller4;
import  unidad.pkg4.poo.bellasamaibotellomeza.Taller4.Ejercicios.Estudiante;
/**
 *
 * @author mezab
 */
public class PBestudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante ("Emerejildo", 18, 3.8);
        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante1.getEdad());
        System.out.println(estudiante1.getNotaPromedio());
    }
    
}
