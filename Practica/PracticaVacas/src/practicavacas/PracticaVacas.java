/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavacas;

/**
 *
 * @author Ludwing_98
 */
public class PracticaVacas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaPasajero cp= new ColaPasajero();
        Pasajero pasajero;
        cp.agregarFinal();
        cp.agregarFinal();
        //cp.mostrarLista();
        //System.out.println("------");
        cp.agregarFinal();
        cp.agregarFinal();
        //cp.mostrarLista();
        cp.eliminarInicio();
        //cp.mostrarLista();
        cp.eliminarInicio();
        //cp.mostrarLista();
        //Avion avion = new Avion();
        //System.out.println("    "+avion.toString(3));
        ListaAvion aviones = new ListaAvion();
        //aviones.agregarInicio();
        //aviones.agregarInicio();
        //aviones.agregarInicio();
        //aviones.mostrarInicio(5);
        Inicio inicio= new Inicio();
        inicio.show();
    }
    
}
