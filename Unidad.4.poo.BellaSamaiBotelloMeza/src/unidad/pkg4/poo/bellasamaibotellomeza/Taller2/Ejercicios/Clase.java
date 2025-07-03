/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller2.Ejercicios;

/**
 *
 * @author mezab
 */
public class Clase {
    String atributo1;
    int atributo2;

    public Clase(String atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
    /*
    Aqui se intenta utilizar this en un metodo static, lo cual no es valido
    ya que this se refiere a una instancia de la clase y los metodos
    static no dependen de instancias.
    */
    
    /*
    public static void MD (){
        System.out.println("El atributo 1 de la clase es: " +  atributo1);
    }
    */
}
