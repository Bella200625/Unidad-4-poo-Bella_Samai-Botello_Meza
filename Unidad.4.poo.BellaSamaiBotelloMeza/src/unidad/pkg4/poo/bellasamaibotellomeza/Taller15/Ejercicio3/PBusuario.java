/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio3;

/**
 *
 * @author mezab
 */
public class PBusuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Autenticacion objeto1 = new Autenticacion();
       Usuario usuario1 = new Usuario("Alavaro roca", "Alvaro32@gmail.com", "12345@6789Aa");
       ValidacionNombre validarNB = new ValidacionNombre();
       ValidacionCorreo validarCorreo = new  ValidacionCorreo();
       ValidacionContraseña validarCont = new ValidacionContraseña();
       MostrarInformacionUsuario info = new MostrarInformacionUsuario();
       
       validarNB.VDnombre(usuario1);
       validarCorreo.VDcorreo(usuario1);
       validarCont.VDcontraseña(usuario1);
            System.out.println("\n");

     info.MostrarInformacion(usuario1);
        System.out.println("\n");
        System.out.println("Validando con los datos correctos: ");
       objeto1.autentificador(usuario1, "Alavaro roca", "Alvaro32@gmail.com", "12345@6789Aa");
               System.out.println("\n");
        System.out.println("Validando con datos incorrectos: ");
       objeto1.autentificador(usuario1, "Alavaro roca", "Alvaro32@gmail.com", "1345@6789Aa");
       
       
       
      
     
        
        
        


        
        
     }   
        
        
 }
    

