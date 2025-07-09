/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio2;

/**
 *
 * @author mezab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto producto = new Producto(1, "Sueter", 4, 25000, "Media", "Lik", "08/07/25");
        Producto producto2 = new Producto(2, "Camisa", 1, 250000, "Alta", "pop", "08/07/25");
        
        CalculosPrecios.calcularPrecio(producto);
        Etiqueta.etiqueta(producto);
        System.out.println("------------/////----------/////-------------");
        System.out.println("\n");
        CalculosPrecios.calcularPrecio(producto2);
        Etiqueta.etiqueta(producto2);
        
    }
    
}
