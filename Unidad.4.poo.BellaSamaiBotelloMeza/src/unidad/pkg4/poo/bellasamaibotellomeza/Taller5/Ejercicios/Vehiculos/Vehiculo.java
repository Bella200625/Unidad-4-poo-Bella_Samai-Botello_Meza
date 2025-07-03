/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller5.Ejercicios.Vehiculos;

/**
 *
 * @author mezab
 */
class Vehiculo {
   
    String tipo;

Vehiculo(String tipo) {

    this.tipo = tipo;
    }
    
// <3
    String getTipo() {
        return tipo;
    }

    // Método para demostrar acceso desde el mismo paquete
    void MD() { 
        System.out.println("Tipo de vehículo: " + tipo);
    }

}
