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
public class ListaMantenimiento {
    protected NodoAvion inicio,fin;
    public ListaMantenimiento() {
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
    
    public String mostrarLista(){
        if (!estaVaciaVes()){
            String datos = "";
         NodoAvion recorrer= inicio;
            while(recorrer != null){
                datos= datos+recorrer.avion.toString(5)+"\n------------------------------------------------------\n";
                    //area.setText("["+recorrer.pasajero.toString(5)+"]-->");
                //System.out.println("------");
                    recorrer = recorrer.siguiente;
            }
            //System.out.println("");
            //area.setText(datos);
            return datos;
        }else{
            //System.out.println("La lista esta vacia");
            return "Esta vacia ves";
        }
    }
}
