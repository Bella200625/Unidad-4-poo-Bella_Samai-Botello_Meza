/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller5.Ejercicios;

/**
 *
 * @author mezab
 */
class Producto {
    String nombre;
    int precio;
    int Stock; 

Producto(String nombre, int precio, int Stock) {
        
    this.nombre = nombre;
    this.precio = precio;
    this.Stock = Stock;
    }

//
void mostrarInfo (){
    System.out.println("nombre: " + nombre + ", precio: " + precio + ", Stock: " + Stock);
  
}

  
    }
