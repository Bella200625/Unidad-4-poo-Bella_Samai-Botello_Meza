/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller2.Ejercicios;

/**
 *
 * @author mezab
 */
public class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante() {
        this("dc",0);
    }
    
    public void MD () {
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("La edad del estudiante es: " + edad);
    }
    
}
