/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller14;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios.Persona;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios.Error1;
/**
 *
 * @author mezab
 */
public class PBError1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Persona es la referencia de la clase base
        Persona error = new Error1 ();
        
        //Solo me va compilar los metodos que se encuentran en la clase persona
        //sin importar que el objeto sea de la clase Erro1 por eso marca error en el 
        //metodo que esta en la clase hija 
        error.presentarse();
        //ERROR
        
       // error.YO(); 
        
    }
    
}
