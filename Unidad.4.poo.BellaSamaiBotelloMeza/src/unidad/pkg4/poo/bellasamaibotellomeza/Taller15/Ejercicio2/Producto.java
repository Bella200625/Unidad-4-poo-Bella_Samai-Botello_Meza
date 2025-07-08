/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.bellasamaibotellomeza.Taller15.Ejercicio2;

/**
 *
 * @author mezab
 */
public class Producto {
    
    //crear producto
    
     private int idProducto;
     private String nombre;
     private int cantidad;
     private int precioUnidad;
     private int precioFinal;
     private String calidad;
     private String marca;
     private String fechaFabricacion;
  

    public Producto(int idProducto, String nombre, int cantidad, int precioUnidad, String calidad, String marca, String fechaFabricacion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.precioFinal = 0;
        this.calidad = calidad;
        this.marca = marca;
        this.fechaFabricacion = fechaFabricacion;

    }

    

   

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }


    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }

    
    
}
