/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streming.cl.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.w3c.dom.ls.LSInput;

/**
 *
 * @author Cetecom
 */
public class ListadoFilmografia {
    private List<Filmografia> listaFilmografia = new ArrayList<>();

    public ListadoFilmografia() {
    }
    
    public void agregarPelicula(Scanner scanner){
        
        System.out.println("ingrese la id diferente a otra ");
        String id = scanner.next();
        
        System.out.println("ingrese el titulo ");
        String titulo= scanner.next();
        
        System.out.println("Ingrese sus meses de suscripcion ");
        int mesesSuscripcion = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese la calificacion ");
        double calificacion = scanner.nextDouble();
        Filmografia pelicula=new Pelicula(calificacion, id, titulo, mesesSuscripcion);
        
        listaFilmografia.add(pelicula);
        
    }
    public void agregarSerie(Scanner scanner){
        
        System.out.println("ingrese la id diferente a otra ");
        String id = scanner.next();
        
        System.out.println("ingrese el titulo ");
        String titulo= scanner.next();
        
        System.out.println("Ingrese sus meses de suscripcion ");
        int mesesSuscripcion = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese la cantidad de temporadas");
        int cantidadTemporadas = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("¿la serie termino ? (true/false)");
        boolean estado = scanner.nextBoolean();
        
        
       Filmografia serie=new Serie(cantidadTemporadas, estado, id, titulo, mesesSuscripcion);
        
        listaFilmografia.add(serie);
        
    }
    
    public void agregarDocumental(Scanner scanner){
        
        System.out.println("ingrese la id diferente a otra ");
        String id = scanner.next();
        
        System.out.println("ingrese el titulo ");
        String titulo= scanner.next();
        
        System.out.println("Ingrese sus meses de suscripcion ");
        int mesesSuscripcion = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese la duracion ");
        double duracion = scanner.nextDouble();
        
        Filmografia documental =new Documental(duracion, id, titulo, mesesSuscripcion);
        listaFilmografia.add(documental);
    
        
    
     
    }

    
    public void verFilmografia(){
        for(Filmografia i: listaFilmografia){
            if(i instanceof Pelicula pelicula){
                        System.out.println("id: "+ i.getId()+ " titulo: "+i.getTitulo()+
                        "Meses suscripcion "+i.getMesesSuscripcion()+" Calificacion "+pelicula.getCalificacion());
            }else if(i instanceof Serie serie){
                        System.out.println("id: "+ i.getId()+ " titulo: "+i.getTitulo()+
                        " Meses suscripcion "+i.getMesesSuscripcion()+"Cantidad de temporadas "+serie.getCantidadDeTemporadas()+" Estado de la serie "+serie.isEstadoDeSerie());
            
            }else if(i instanceof Documental documental){
                        System.out.println("id: "+i.getId()+" Titulo: "+i.getTitulo()+" Meses suscripcion: "+i.getMesesSuscripcion()+
                                " Duracion "+documental.getDuracion());
            }
        
        }
    
    }
    
    public void resumenInfo(){
        for(Filmografia i: listaFilmografia){
            if(i instanceof Pelicula){
                System.out.println("Por tener una calificacion sobre 4.5 su mensualidad es de == "+i.reglasFilmo());
            }else if(i instanceof Serie){
                System.out.println("Por tener una cantidad de temporadas mayor a 3 y sin terminar == "+i.reglasFilmo());
            }else if(i instanceof Documental){
                System.out.println("Por tener una duracion superior a 90 minutos su mensualidad es de == "+i.reglasFilmo());
            }
                
        }
    
    }
    
    
    public void cantidadDeFilmografias(){
            System.out.println("cantidad total de peliculas "+listaFilmografia.size());
        
    }

    public void sumaTotal(){
        double y=0;
        double x=0;
        for(Filmografia i: listaFilmografia){
             y=x+i.reglasFilmo();
             x=y;
        }System.out.println("Total = "+ y);
    }

    

}
