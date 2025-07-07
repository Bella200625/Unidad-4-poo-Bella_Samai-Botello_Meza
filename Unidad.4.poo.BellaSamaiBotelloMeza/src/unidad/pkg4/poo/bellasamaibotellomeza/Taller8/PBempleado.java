/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller8;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller8.Ejercicios.*;
/**
 *
 * @author mezab
 */
public class PBempleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente("MIS", 35, "Social");
        Empleado empleado1 = new Empleado("Sorayda", 46);
        
        gerente1.mostrarDetalles();
        System.out.println("\n");
        System.out.println("------------------------------------");
        empleado1.mostrarDetalles();
    }
    
}
