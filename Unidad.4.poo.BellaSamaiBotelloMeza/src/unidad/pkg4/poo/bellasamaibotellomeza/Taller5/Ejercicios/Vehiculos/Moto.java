/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller5.Ejercicios.Vehiculos;

/**
 *
 * @author mezab
 */
class Moto extends Vehiculo {
    
    String color;

Moto(String tipo, String color) {  
        super(tipo); 
        this.color = color;
    }

String getEstilo() {
        return color;
    }
}
