/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plataformastreaming;

import java.util.Scanner;
import streming.cl.model.Documental;
import streming.cl.model.Filmografia;
import streming.cl.model.ListadoFilmografia;
import streming.cl.model.Pelicula;

/**
 *
 * @author Cetecom
 */
public class PlataformaStreaming {

    public static void main(String[] args) {
        
              
        ListadoFilmografia listado = new ListadoFilmografia();
        Filmografia documental =new Documental();
        Scanner scanner = new Scanner(System.in);
        int opcion=0;
        while(opcion<5){
            System.out.println("-----------GRAN MENU FILMOGRAFIA-------------");
            System.out.println("");
            System.out.println("1) Agregar una pelicula");
            System.out.println("2) Agregar una serie ");
            System.out.println("3) Agregar un documental ");
            System.out.println("4) ver contenido en la plataforma ");
            System.out.println("5) Resumen de data ");
            System.out.println("6) salir ");
            System.out.println("ingrese una opcion ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch(opcion){
                case 1:
                        listado.agregarPelicula(scanner);
                    break;
                case 2:
                        listado.agregarSerie(scanner);
                    break;
                case 3:
                        listado.agregarDocumental(scanner);
                    break;
                case 4:
                        listado.verFilmografia();
                    break;
                case 5:
                        listado.resumenInfo();
                        listado.cantidadDeFilmografias();
                        listado.sumaTotal();
                    break;
            
            
            }
        
        }
        
        
    }
    
}
