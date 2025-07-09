/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio3;

/**
 *
 * @author mezab
 */
public class ValidacionCorreo {
     public boolean VDcorreo(Usuario usuario) {
         
         if (usuario.getCorreo().endsWith("@gmail.com")) {
 //           System.out.println("El correo no es valido.");
 //         return false;
             System.out.println("Correo si cumple");
            return true;
            

         } else {
              
             System.out.println("no es valido el correo");
             return false;
         }
     }
}
//usuario.getCorreo()== null || usuario.getCorreo().isEmpty()