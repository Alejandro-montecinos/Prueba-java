/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streming.cl.model;

/**
 *
 * @author Cetecom
 */
public class Serie extends Filmografia implements ISuscripcion{
    private int cantidadDeTemporadas;
    private boolean estadoDeSerie;

    public Serie() {
    }

    public Serie(int cantidadDeTemporadas, boolean estadoDeSerie) {
        this.cantidadDeTemporadas = cantidadDeTemporadas;
        this.estadoDeSerie = estadoDeSerie;
    }

    public Serie(int cantidadDeTemporadas, boolean estadoDeSerie, String id, String titulo, int mesesSuscripcion) {
        super(id, titulo, mesesSuscripcion);
        this.cantidadDeTemporadas = cantidadDeTemporadas;
        this.estadoDeSerie = estadoDeSerie;
    }

    public int getCantidadDeTemporadas() {
        return cantidadDeTemporadas;
    }

    public void setCantidadDeTemporadas(int cantidadDeTemporadas) {
        this.cantidadDeTemporadas = cantidadDeTemporadas;
    }

    public boolean isEstadoDeSerie() {
        return estadoDeSerie;
    }

    public void setEstadoDeSerie(boolean estadoDeSerie) {
        this.estadoDeSerie = estadoDeSerie;
    }

    @Override
    public String toString() {
        return "Serie{" + "cantidadDeTemporadas=" + cantidadDeTemporadas + ", estadoDeSerie=" + estadoDeSerie + '}';
    }
    
    @Override
    public double costoBase(){
        return COSTO_BASE_SUSCRIPCION*super.getMesesSuscripcion();
    }
    
    @Override
    public double reglasFilmo(){
        if(cantidadDeTemporadas>3 && estadoDeSerie == false){
            return costoBase()*1.08;
        }else{
            return costoBase();
        }
    }
    
}
