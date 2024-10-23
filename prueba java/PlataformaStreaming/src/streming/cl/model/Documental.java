/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streming.cl.model;

/**
 *
 * @author Cetecom
 */
public class Documental extends Filmografia implements ISuscripcion{
    private double duracion;

    public Documental() {
    }

    public Documental(double duracion) {
        this.duracion = duracion;
    }

    public Documental(double duracion, String id, String titulo, int mesesSuscripcion) {
        super(id, titulo, mesesSuscripcion);
        this.duracion = duracion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Documental{" + "duracion=" + duracion + '}';
    }
    
    @Override
    public double costoBase(){
        return COSTO_BASE_SUSCRIPCION*super.getMesesSuscripcion();
    }

    @Override
    public double reglasFilmo(){
        if(duracion>90){
            return costoBase()*0.95;
        }else{
            return costoBase();
        }
    }
}
