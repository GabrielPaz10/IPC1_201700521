package proyecto2vacas;

/**
 *
 * @author Ludwing_98
 */
public class NodoAvion {
    Avion avion;
    NodoAvion siguiente;
    NodoAvion anterior;

    public NodoAvion(Avion avion) {
        this.avion=avion;
        siguiente=anterior=null;
    }
    public NodoAvion (Avion avion, NodoAvion siguiente){
        this.avion=avion;
        this.siguiente=siguiente;
    }
    public void enlazarAnterior(NodoAvion nodo){
        anterior=nodo;
    }
    public void enlazarSiguiente(NodoAvion nodo){ 
        siguiente=nodo; //es una manera de apuntar a otro nodo que podemos añadir desde afuera
    }
    public NodoAvion obtenerSiguiente(){
        return siguiente; //retorna el enlace hacia el siguiente nodo
    }
    public NodoAvion obtenerAnterior(){
        return anterior;
    }
    
}
