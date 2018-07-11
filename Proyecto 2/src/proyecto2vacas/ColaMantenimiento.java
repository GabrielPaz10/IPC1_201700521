/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2vacas;

import javax.swing.JTextArea;

/**
 *
 * @author Ludwing_98
 */
public class ColaMantenimiento {
    protected NodoAvion inicio, fin;
    JTextArea area;

    public ColaMantenimiento() {
        this.inicio = null;
        this.fin = null;
    }
    public void AgregarInicio(Avion avion){
        inicio= new NodoAvion(avion);
        if (fin==null){
            fin= inicio;
        }
        
    }
    public boolean estaVaciaVes(){
        if (inicio==null) {
            return true;
        }else return false;
    }
    public void agregarFinal(Avion avion){
        if (!estaVaciaVes()) {
            fin.siguiente = new NodoAvion(avion);
            fin= fin.siguiente;
        }
        else{
            inicio = fin = new NodoAvion(avion);
        }
    }
    
    public String mostrarLista(JTextArea area){
        if (!estaVaciaVes()){
            String datos = "";
         NodoAvion recorrer= inicio;
            while(recorrer != null){
                datos= datos+recorrer.avion.toString()+"\n------------------------------------------------------\n";
                    //area.setText("["+recorrer.pasajero.toString(5)+"]-->");
                //System.out.println("------");
                    recorrer = recorrer.siguiente;
            }
            //System.out.println("");
            //area.setText(datos);
            return datos;
        }else{
            //System.out.println("La lista esta vacia");
            return "Esta vacia ves\n";
        }
    }
    
    public void eliminarInicio(){
        //Pasajero pasajero = inicio.pasajero;
        if (inicio== null) {
            inicio=fin=null;
        }else{
            inicio= inicio.siguiente;
        }
        //return pasajero;
    }
}
