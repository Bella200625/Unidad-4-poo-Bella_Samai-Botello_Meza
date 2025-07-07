/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller9.Ejercicios;

/**
 *
 * @author mezab
 */
public class Error2 extends PadreError2 {
    private String N;

        public Error2(String N, int TNO) {
            super(TNO);
            this.N = N;

        }

      //error2 
  public void MD (){
   //System.out.println("TNO: " + super.TNO);
   
   //Se intenta llamar un atributo directamente de la clase padre 
   //El error se encuentra en la clase padre ya que sus atributos se encuentran en private
   //En Java, los atributos privados de una clase padre no son directamente accesibles desde las clases hijas.
   
}

        
}

    

