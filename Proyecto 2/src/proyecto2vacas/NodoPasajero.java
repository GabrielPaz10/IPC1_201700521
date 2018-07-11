package proyecto2vacas;

/**
 *
 * @author Ludwing_98
 */
public class NodoPasajero {
    Pasajero pasajero;
    NodoPasajero siguiente;

    public NodoPasajero(Pasajero pasajero) {
        setPasajero(pasajero);
        setSiguiente(null);
    }

    public NodoPasajero(Pasajero pasajero, NodoPasajero siguiente) {
        this.pasajero = pasajero;
        this.siguiente = siguiente;
    }

    
    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public NodoPasajero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPasajero siguiente) {
        this.siguiente = siguiente;
    }
    
}
