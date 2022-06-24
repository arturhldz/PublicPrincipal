/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publicprincipal;

/**
 *
 * @author Mariana
 */
public class Periodico extends Publicacion{
    private String secciones;
    private String editor;
    private String periodicidad;

    public Periodico(String secciones, String editor, String periodicidad) {
        this.secciones = secciones;
        this.editor = editor;
        this.periodicidad = periodicidad;
    }

    public String getSecciones() {
        return secciones;
    }

    public void setSecciones(String secciones) {
        this.secciones = secciones;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    
    
    
    
}
