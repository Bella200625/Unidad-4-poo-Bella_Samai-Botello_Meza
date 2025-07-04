/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller7.Ejercicios;

/**
 *
 * @author mezab
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private int saldo;
    public String tipoCuenta;

    public CuentaBancaria(int numeroCuenta, int saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuantaBancaria{" + "numeroCuenta: " + numeroCuenta + ", saldo: " + saldo + ", tipoCuenta: " + tipoCuenta + '}';
    }
    

    
}
