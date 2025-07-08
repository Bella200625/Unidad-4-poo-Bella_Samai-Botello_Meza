/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio2;

/**
 *
 * @author mezab
 */
public class Etiqueta {
    
    public static void etiqueta(Producto producto){
        System.out.println("-----Generar etiqueta-----");
        System.out.println("\n");
        System.out.println("---//---Etiqueta---//---");
        System.out.println("Producto: " + producto.getNombre() );
        System.out.println("Marca: " + producto.getMarca());
        System.out.println("Calidad: " + producto.getCalidad());
        System.out.println("Precio: " + producto.getPrecioFinal());
        System.out.println("Fecha de fabricacion: " + producto.getFechaFabricacion());
    }
}
