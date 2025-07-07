/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller9.Ejercicios;

/**
 *
 * @author mezab
 */
public class Empleado extends Persona {
     private String departamento;

    public Empleado(String nombre, int salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    //error (Cree un atributo "departamento" en la clase persona)
    /*
    @Override
    public void mostrarDetalles () {
    super.mostrarDetalles ();
     System.out.println("Departamento al que pertenece: " + super.departamento);
    */
    
    //Forma correcta
    @Override 
    public void mostrarDetalles () {
    super.mostrarDetalles();
    System.out.println("Departamento al que pertenece: " + departamento);
    
}
}