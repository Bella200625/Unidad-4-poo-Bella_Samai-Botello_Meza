/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller1;
import java.util.Scanner;
import unidad.pkg4.poo.bellasamaibotellomeza.Taller1.Ejercicios.*;

/**
 *
 * @author mezab
 */
public class PBejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        //crear objeto libro1
        Libro libro1 = new Libro ("Iris flores de ceniza", "Mauricio Temporin", 364);
        
        // crear objeto libro2
        Libro libro2 = new Libro ();
        
        //objeto de cuenta bancaria
        CuentaBancaria CB1 = new CuentaBancaria (123456789, "Ahorro"); 
        
        //objeto estudiante
        Estudiante estudiante1 = new Estudiante ("Alvaro", 26, "2 smt");
        
       
            //metodo
            System.out.println(libro1.toString());
            System.out.println(libro2.toString());
            System.out.println(CB1.toString());
            System.out.println(estudiante1.toString());
            
            System.out.println("Ahora vamos a actualizar libro #2");
            System.out.println("Introduce el nuevo titulo: ");
            libro2.setTitulo(sc.nextLine());
            System.out.println("Introduce el nuevo autor: ");
            libro2.setAutor(sc.nextLine());
            System.out.println("Introducte el nuevo numero de paginas: ");
            libro2.setNumeroPaginas(Integer.parseInt(sc.nextLine()));
            System.out.println("Se ha actualizado el libro #2");
            System.out.println(libro2.toString());
           
            
            
         
        
        
        
        
        
        
        
        
    }
    
}
