/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller9.Ejercicios;

/**
 *
 * @author mezab
 */
public class Persona {
    
    protected String nombre;
    protected int edad; 

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //metodo
    
    public void mostrarDetalles (){
    
        System.out.println("Nombre: "+ nombre + ", Edad: " + edad);
    }
    
}
