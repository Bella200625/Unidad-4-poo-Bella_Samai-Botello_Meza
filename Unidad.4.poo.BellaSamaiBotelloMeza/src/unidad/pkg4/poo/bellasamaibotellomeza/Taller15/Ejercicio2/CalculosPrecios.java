/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio2;

/**
 *
 * @author mezab
 */
public class CalculosPrecios {
  public static int calcularPrecio (Producto producto){  
   double  precioConIVA = producto.getPrecioUnidad() * (1 + 0.19);
    int PF = (int) Math.round(precioConIVA * producto.getCantidad());
    producto.setPrecioFinal(PF); 
    return PF; 
  }
    }

