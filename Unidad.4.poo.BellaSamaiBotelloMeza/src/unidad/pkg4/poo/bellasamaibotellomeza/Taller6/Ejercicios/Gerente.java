/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller6.Ejercicios;

/**
 *
 * @author mezab
 */
public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
        

    }
    @Override
        public void mostrarInformacion (){
            System.out.println("Los datos del gerente son: ");
            super.mostrarInformacion();
            System.out.println("El departamento es: " + departamento);
        }    
    
    
}
