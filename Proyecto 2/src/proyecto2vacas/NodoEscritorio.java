package proyecto2vacas;

/**
 *
 * @author Ludwing_98
 */
public class NodoEscritorio {
    ColaPasajero cola;
    NodoEscritorio anterior;
    NodoEscritorio siguiente;

    public NodoEscritorio(ColaPasajero cola) {
        this.cola = cola;
        siguiente=anterior=null;
    }
    public void enlazarAnterior(NodoEscritorio nodo){
        anterior=nodo;
    }
    public void enlazarSiguiente(NodoEscritorio nodo){ 
        siguiente=nodo; //es una manera de apuntar a otro nodo que podemos añadir desde afuera
    }
    public NodoEscritorio obtenerSiguiente(){
        return siguiente; //retorna el enlace hacia el siguiente nodo
    }
    public NodoEscritorio obtenerAnterior(){
        return anterior;
    }
}
