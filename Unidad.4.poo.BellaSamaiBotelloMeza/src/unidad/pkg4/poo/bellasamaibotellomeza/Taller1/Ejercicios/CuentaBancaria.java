/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller1.Ejercicios;

/**
 *
 * @author mezab
 */
public class CuentaBancaria {
    int numeroCuenta; 
    double saldo;
    String tipoCuenta;

    // por defecto
    public CuentaBancaria() {
        
     numeroCuenta = 0;
     saldo = 0;
     tipoCuenta = "dc"; 
    }
// parametrisado con dos propiedades
    public CuentaBancaria(int numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }
//sobrecargado
    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
//metodo

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta: " + numeroCuenta + ", saldo: " + saldo + ", tipoCuenta: " + tipoCuenta + '}';
    }
    
    
    
    

}
