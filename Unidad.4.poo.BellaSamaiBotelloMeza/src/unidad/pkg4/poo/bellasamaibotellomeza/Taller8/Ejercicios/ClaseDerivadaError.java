/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller8.Ejercicios;

/**
 *
 * @author mezab
 */
public class ClaseDerivadaError extends ClasePadreError {
    
    private String job;
    
    public ClaseDerivadaError(String name, int number, String job) {
        super(name, number);
        this.job = job;
    }
    //En Java, los atributos privados de una clase padre no son directamente accesibles desde las clases hijas.
    public void MD2 (){
        //System.out.println("Nombre: " + super.name);
        //error
    }
    
    
}
