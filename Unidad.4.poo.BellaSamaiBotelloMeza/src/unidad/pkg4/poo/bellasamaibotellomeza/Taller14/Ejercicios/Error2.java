/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller14.Ejercicios;

/**
 *
 * @author mezab
 */
public class Error2 extends Persona {
    
    //Aunque el codigo compile se considera una mala practica ya que no se esta modificando el metodo 
    //solo lo esta llamando desde una clase hija por lo cual provocara mucha rebundancia en el codigo  
    //
    @Override
    public void presentarse (){
    super.presentarse();
    }
    
    
}
