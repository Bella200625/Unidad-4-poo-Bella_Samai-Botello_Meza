/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller3;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller3.Ejercicios.Matematicas;
/**
 *
 * @author mezab
 */
public class PBmatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int resultadoSuma = Matematicas.suma (8,2);
        int resultadoResta = Matematicas.resta (8,2);
        int resultadoMultiplicacion= Matematicas.multiplicacion (8,2);
        int resultadoDivicion = Matematicas.divicion (8,2);
        
        System.out.println("El resultado de la suma entre 8 y 2 es: " + resultadoSuma);
        System.out.println("El resultado de la Resta entre 8 y 2 es: " + resultadoResta);
        System.out.println("El resultado de la multiplicacion entre 8 y 2 es: " + resultadoMultiplicacion);
        System.out.println("El resultado de la divicion entre 8 y 2 es: " + resultadoDivicion);
        
    }
    
}
