/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publicprincipal;

import java.util.ArrayList;

/**
 *
 * @author Mariana
 */
public class Publicacion {
   private String titulo;
   private float precio;
   private int numPagina;
   
   private ArrayList<Libro> Libros = new ArrayList();
   
   public void agregarLibroEnPublicacion(Libro libro1)
   {
      Libros.add(libro1);
      
   }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }
   
   @Override
   public String toString()
   {
       return "Titulo : "+this.titulo+" precio : "+this.precio+" numero de pagina : "+this.numPagina;
       
   }
   
}
