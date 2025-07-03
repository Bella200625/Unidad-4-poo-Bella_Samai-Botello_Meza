/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller6;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller6.Ejercicios.*;

/**
 *
 * @author mezab
 */
public class PBprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo  vehiculo1 = new Vehiculo("Suzuki","switf");
        //No nos deja acceder directamente al atributo "marca" ya que esta en
        //acceso protected, solo que tengamos un GET para este atributo.
        
        //System.out.println(vehiculo1.marca);
        
    }
    
}
