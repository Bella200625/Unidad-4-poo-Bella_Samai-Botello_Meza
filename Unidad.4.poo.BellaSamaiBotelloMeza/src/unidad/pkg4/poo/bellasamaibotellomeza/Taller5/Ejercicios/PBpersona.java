/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller5.Ejercicios;

/**
 *
 * @author mezab
 */
public class PBpersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona persona1 = new Persona ("Lesly", 25);
        /*
        Como podemos ver en pantalla podemos acceder al atributo "nombre" por medio del metodo get 
        dado que este atriubuto es private y este no accedera directamente, por otro lado tenemos 
        el atributo "edad" que esta por default y podemos entrar directamente por medio de 
        esta clase.
        La diferencia entre private y default, es que el private se usa mas a menudo por lo cual 
        nos da mas seguridad a los datos guardados en nuestros atributos de los cuales solo se puede
        acceder o modificar por medio de los metodos get y set algo que no hara el metodo default que 
        podemos  acceder a los atributos, metodos o clases dentro del mismo paquete.     
        
        */
        System.out.println("Nombre: " + persona1.getNombre() + ", Edad: " + persona1.edad);
    }
    
}
