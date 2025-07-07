/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller13;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller13.Ejercicios.*;
/**
 *
 * @author mezab
 */
public class PBfigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(75, 13.5);
        Rectangulo rectangulo = new Rectangulo(55, 7);
        
        triangulo.calcularArea();
        rectangulo.calcularArea();
    }
    
}
