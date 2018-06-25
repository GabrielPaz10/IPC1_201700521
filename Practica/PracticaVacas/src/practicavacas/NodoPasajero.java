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
