package practicavacas;

/**
 *
 * @author Ludwing_98
 */
public class NodoMaleta {
    Maleta maletas;
    NodoMaleta siguiente,anterior;

    public NodoMaleta(Maleta maletas) {
        this.maletas = maletas;
        siguiente=anterior=null;
    }
    public void enlazarAnterior(NodoMaleta nodo){
        anterior=nodo;
    }
    public void enlazarSiguiente(NodoMaleta nodo){ 
        siguiente=nodo; //es una manera de apuntar a otro nodo que podemos añadir desde afuera
    }
    public NodoMaleta obtenerSiguiente(){
        return siguiente; //retorna el enlace hacia el siguiente nodo
    }
    public NodoMaleta obtenerAnterior(){
        return anterior;
    }
}
