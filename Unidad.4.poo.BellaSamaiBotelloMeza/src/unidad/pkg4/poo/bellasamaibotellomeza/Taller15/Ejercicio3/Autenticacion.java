/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio3;

/**
 *
 * @author mezab
 */
public class Autenticacion {
     public boolean autentificador (Usuario usuario,   String usuarioIngresado, String correoIngresado,  String contraseñaIngresada){
         
         if (usuario.getNombre().equals(usuarioIngresado) &&
               usuario.getContraseña().equals(contraseñaIngresada)&&
                  usuario.getCorreo().equals(correoIngresado)) {
             
              System.out.println("Autenticacion Correcta.");
             return true;
         } else {
             System.out.println("Autenticacion fallida.");
             return false;
         }
          
     
     }
    
}
