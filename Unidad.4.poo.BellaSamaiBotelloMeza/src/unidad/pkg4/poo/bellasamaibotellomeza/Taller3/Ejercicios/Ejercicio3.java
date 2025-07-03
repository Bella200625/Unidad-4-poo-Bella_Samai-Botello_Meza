/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller3.Ejercicios;

public class Ejercicio3 {

    // Atributos
    String mensaje1 = "hi"; 
    static String mensaje2 = "Holaaaaaaaaa";
   
    //error
    //
//    public static void MM() { 
//        System.out.println("Intentando acceder a mensaje1: " + mensaje1);
//        mensaje1 = "Hi mundo"; 
//        System.out.println("Mensaje 1 modificado: " + mensaje1);
//    }

    // corregido
    public static void mM() { 
        System.out.println("Accediendo a mensaje1 (antes de modificar): " + mensaje2); 
        mensaje2 = "Cristo te ama";
        System.out.println("Mesaje 2 modificado: " + mensaje2); 
    }
}