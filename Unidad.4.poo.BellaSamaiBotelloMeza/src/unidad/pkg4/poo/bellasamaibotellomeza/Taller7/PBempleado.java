/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller7;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller7.Ejercicios.Empleado;
/**
 *
 * @author mezab
 */
public class PBempleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          
        
        Empleado empleado1 = new Empleado ("Alvaro", 1500000);
        empleado1.setSalario(100);
        
        Empleado empleado2 = new Empleado ("Camila", 1600000);
      
        empleado1.MD();
        empleado2.MD();
        
        
    }
    
    
}
