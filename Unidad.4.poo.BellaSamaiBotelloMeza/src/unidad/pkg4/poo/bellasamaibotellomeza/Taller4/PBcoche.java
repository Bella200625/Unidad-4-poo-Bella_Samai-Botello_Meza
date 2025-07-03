/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller4;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller4.Ejercicios.Coche;
/**
 *
 * @author mezab
 */
public class PBcoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Coche coche1 = new Coche ("Suzuki", "Switft", 280.0);  
       //No se puede acceder al atributo "modelo" porque se encuentra en private y no estamos haciendo uso de los get para acceder
       /*
        System.out.println(coche1.modelo);
        */
        
        
        //Para el ejercicio 3 se nos pide lo mismo que hicimos en el ejercicio dos
        //Pero hay que explicar que, en la proteccion de datos, es muy importante
        //el tener los atributos en private para que cualquier clase no acceda con 
        //facilidad a ellos, esto se tiene que tener en cuenta cuando son 
        //datos muy sensibles y privados.
        
        
    }
    
}
