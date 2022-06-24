/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publicprincipal;

/**
 *
 * @author Mariana
 */
public class Libro extends Publicacion {
    
    private String ISBN;
    private String ediccion;
    private String autor;

    public Libro(String ISBN, String ediccion, String autor) {
        this.ISBN = ISBN;
        this.ediccion = ediccion;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdiccion() {
        return ediccion;
    }

    public void setEdiccion(String ediccion) {
        this.ediccion = ediccion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString()
    {
        return "El ISBN es : "+this.ISBN+" la edicion es : "+this.ediccion+" el autor es : "+this.autor;
        
    }
    
    
}
