/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller1.Ejercicios;

/**
 *
 * @author mezab
 */
public class Libro {
    String titulo;
    String autor;
    int numeroPaginas; 
    
  public Libro () {
    
     titulo = "dc";
     autor = "dc";
     numeroPaginas = 0;
     
}

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public void MD (){
    
        System.out.println("El titulo es: "+ titulo);
        System.out.println("El autor es: " + autor);
        System.out.println("El numero de paginas de este libro es: "+ numeroPaginas);
    
    }
    
    
    
    
}
        

