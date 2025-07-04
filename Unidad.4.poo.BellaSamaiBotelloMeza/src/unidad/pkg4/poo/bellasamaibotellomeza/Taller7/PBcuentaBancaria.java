/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller7;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller7.Ejercicios.CuentaBancaria;
/**
 *
 * @author mezab
 */
public class PBcuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CuentaBancaria cuenta1 = new CuentaBancaria(123456789, 5000000, "Ahorro");
       
       //Cuando intentamos acceder directamente a numeroCuenta, este no nos dejara
       //debido a que el atributo es de acceso private, y este se necesita un get
       //para poder moestrar el dato, pero tampoco tiene el GET
        //System.out.println("El numero de la cuenta es: " + cuenta1.numeroCuenta);
        System.out.println("saldo: " + cuenta1.getSaldo());
        
       // en cambio el atributo "tipoCuenta" es publico por lo tanto se puede acceder de manera
       //directa desde caulquier clase.
        System.out.println("La cuenta es de tipo: " + cuenta1.tipoCuenta);
       
      System.out.println(cuenta1.toString());
    
    }
    
    
}
