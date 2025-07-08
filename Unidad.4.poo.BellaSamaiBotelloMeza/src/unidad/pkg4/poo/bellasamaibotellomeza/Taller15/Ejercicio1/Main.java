/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio1;

/**
 *
 * @author mezab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libInfo = new Libro(1, "La verdad", "Anonimo", 655, "cristiano", 38000, 4.99, true);
        Libro lib2 = new Libro(2, "Tigrillo", "Sekki", 302, "Fantastico", 30000, 4.80, false);

        MostrarInformacionLibro.MostrarInformacionLibro(libInfo);
        System.out.println("\n");
        LibroReporte.mostrarReporte(libInfo);
        System.out.println("\n");  
        LibroPersistencia.guardarLibro(libInfo);
        System.out.println("\n");
        MostrarInformacionLibro.MostrarInformacionLibro(lib2);
        System.out.println("\n");
        LibroReporte.mostrarReporte(lib2);
        System.out.println("\n");  
        LibroPersistencia.guardarLibro(lib2);
            
    }
    
}
