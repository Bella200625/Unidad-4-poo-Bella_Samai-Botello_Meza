/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio1;

/**
 *
 * @author mezab
 */
public class MostrarInformacionLibro {
    
    
    public static void MostrarInformacionLibro (Libro informacion){
        System.out.println("--//--Informacion del libro--//--");
                System.out.println("\n");  
        System.out.println("ID del libro: " + informacion.getIdLibro());
        System.out.println("Titulo: " + informacion.getTitulo());
        System.out.println("Autor u Autora del libro: " + informacion.getAutor());
        System.out.println("Numero de paginas del libro : " + informacion.getNumeroPaginas());
        System.out.println("ID del libro: " + informacion.getGenero());
        System.out.println("ID del libro: " + informacion.getPrecio());
        System.out.println("ID del libro: " + informacion.getDisponibilidad());
           
        
        
    
    }
    
}
