/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller5.Ejercicios;

/**
 *
 * @author mezab
 */
public class PBproducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto ("Ganchos", 12000, 140);
        
        System.out.println("Nombre del producto: " + producto1.nombre);
        System.out.println("Precio: " + producto1.precio);
        System.out.println("Cantidad: " + producto1.Stock);
    }
    
}
