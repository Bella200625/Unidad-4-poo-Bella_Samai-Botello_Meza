/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio3;

/**
 *
 * @author mezab
 */
public class MostrarInformacionUsuario {
    
    public void MostrarInformacion (Usuario usuario){
        System.out.println("Usuario Creado: ");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Contraseña: " + usuario.getContraseña());
    }
    
}
