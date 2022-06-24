/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publicprincipal;

/**
 *
 * @author Mariana
 */
public class Revista extends Publicacion{
    private String ISSN;
    private int numero ;
    private int anio;

    public Revista(String ISSN, int numero, int anio) {
        this.ISSN = ISSN;
        this.numero = numero;
        this.anio = anio;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    
    
}
