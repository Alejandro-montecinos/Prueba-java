/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streming.cl.model;

import static streming.cl.model.ISuscripcion.COSTO_BASE_SUSCRIPCION;

/**
 *
 * @author Cetecom
 */
public abstract class Filmografia {
    private String id;
    private String titulo;
    private int mesesSuscripcion;

    public Filmografia() {
    }

    public Filmografia(String id, String titulo, int mesesSuscripcion) {
        this.id = id;
        this.titulo = titulo;
        this.mesesSuscripcion = mesesSuscripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMesesSuscripcion() {
        return mesesSuscripcion;
    }

    public void setMesesSuscripcion(int mesesSuscripcion) {
        this.mesesSuscripcion = mesesSuscripcion;
    }

    @Override
    public String toString() {
        return "Filmografia{" + "id=" + id + ", titulo=" + titulo + ", mesesSuscripcion=" + mesesSuscripcion + '}';
    }
    
    
    public abstract double costoBase();
    
    public abstract double reglasFilmo();
    
    

}
