/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller10.Ejercicios;

/**
 *
 * @author mezab
 */
public class faltaOverride extends Vehiculo{
    // Clase derivada (sin usar @Override)
    //Aunqueelcódigocompilayfunciona,nousar@Overridepuedellevaraerroresdifícilesdedetectar,especialmentesisecambianlos
    //métodosenlaclasebase. 
  public void moverse (){
        super.moverse();
        System.out.println("Mala practica.");
    }   
}
