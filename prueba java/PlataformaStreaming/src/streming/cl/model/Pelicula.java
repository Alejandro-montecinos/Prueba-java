/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streming.cl.model;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Filmografia implements ISuscripcion{
    private double calificacion;

    public Pelicula() {
    }

    public Pelicula(double calificacion) {
        this.calificacion = calificacion;
    }

    public Pelicula(double calificacion, String id, String titulo, int mesesSuscripcion) {
        super(id, titulo, mesesSuscripcion);
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "calificacion=" + calificacion + '}';
    }

    @Override
    public double costoBase(){
        return COSTO_BASE_SUSCRIPCION*super.getMesesSuscripcion();
    }
    
    @Override
    public double reglasFilmo(){
        if(calificacion>4.5){
            return costoBase()*1.10;
        }else{
            return costoBase();
        }
    }
    
}
