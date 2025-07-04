/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller7;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller7.Ejercicios.Utilidades;
/**
 *
 * @author mezab
 */
public class PButilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultadoSuma = Utilidades.suma (8,2);
        int resultadoResta = Utilidades.resta (8,2);
        int resultadoMultiplicacion= Utilidades.multiplicacion (8,2);
        int resultadoDivision = Utilidades.division (8,2);
        
        System.out.println("El resultado de la suma entre 8 y 2 es: " + resultadoSuma);
        System.out.println("El resultado de la Resta entre 8 y 2 es: " + resultadoResta);
        System.out.println("El resultado de la multiplicacion entre 8 y 2 es: " + resultadoMultiplicacion);
        System.out.println("El resultado de la division entre 8 y 2 es: " + resultadoDivision);
    }
    
}
