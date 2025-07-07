/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller9.Ejercicios;

/**
 *
 * @author mezab
 */
public class Error1  {
   
    
    protected int TN;
    
    public Error1(String especie, int TN) {
    //    super(especie);
    
    /*
        El código super(especie); dentro de una clase que 
        no hereda de otra es incorrecto. super se utiliza 
        para acceder a métodos o atributos de la clase padre 
        (superclase) en el contexto de la herencia. Si no hay herencia, 
        no hay clase padre a la que referirse, por lo tanto, super no tiene sentido. 
        */
    
     //   super(especie);
        this.TN = TN;
    }
    
   
    
}
