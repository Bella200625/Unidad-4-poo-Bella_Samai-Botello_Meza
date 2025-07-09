/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio3;

/**
 *
 * @author mezab
 */
public class ValidacionContraseña {
    
    public boolean VDcontraseña(Usuario usuario) {
        if (usuario.getContraseña().length() >= 8 &&
               usuario.getContraseña().matches(".*[A-Z].*") &&     // Al menos una mayúscula
               usuario.getContraseña().matches(".*[a-z].*") &&     // Al menos una minúscula
               usuario.getContraseña().matches(".*\\d.*") &&       // Al menos un número
               usuario.getContraseña().matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"))
        
        {
            System.out.println("Contraseña Cumple");
            return true; // Al menos un símbolo 
        } else {
            
            System.out.println("Error debe tener Al menos una mayúscula, una minúscula y un numero. ");
            return false;
        }
 
    
    }
}