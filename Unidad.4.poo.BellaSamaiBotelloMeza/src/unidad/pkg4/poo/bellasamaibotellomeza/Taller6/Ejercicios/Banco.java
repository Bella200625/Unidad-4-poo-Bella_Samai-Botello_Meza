/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller6.Ejercicios;

/**
 *
 * @author mezab
 */
public class Banco {
    protected double saldo;
    
    /*
      No se recomienta usar "protected" para  En atributos que necesitan 
      ser completamente encapsulados y no debe ser accesibles nisiquiera 
      desde subclases.
      Es recomendable en estos casos usar el aceso "private" para mantener seguro 
      los datos guardados en los atributos.
    */
    //Encapsular = GET y SET
    private double saldoo;
    
    /*De esta manera el atributo "saldoo" no puede ser accedido directamente
      desde otras clases, asegurando que cualquier acceso o modificacion de
      su valor se realice a traves de metodos de encapsulamient en la clase "Banco".
      Esto promueve una mejor proteccion de los datos.
    */

    public Banco(double saldoo) {
        this.saldoo = saldoo;
    }

   

    public double getSaldoo() {
        return saldoo;
    }

    public void setSaldoo(double saldoo) {
        this.saldoo = saldoo;
    }
    
    
}
