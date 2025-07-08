/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio1;

/**
 *
 * @author mezab
 */
public class LibroReporte {
    
    public static void mostrarReporte (Libro libro){
        System.out.println("--//--Reportes--//--");
                System.out.println("\n");  
        System.out.println("Calificaciones del libro: " + libro.getCalificacion());
        System.out.println("Se encuentra disponible: " + libro.getDisponibilidad());
    }
    
}
