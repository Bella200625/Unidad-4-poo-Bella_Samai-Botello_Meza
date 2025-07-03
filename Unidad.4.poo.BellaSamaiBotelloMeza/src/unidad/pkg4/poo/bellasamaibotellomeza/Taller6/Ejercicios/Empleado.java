/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller6.Ejercicios;

/**
 *
 * @author mezab
 */
public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void mostrarInformacion () {
        System.out.println("El nombre es: "+nombre);
        System.out.println("El salario es: "+salario);
    }
    
}
