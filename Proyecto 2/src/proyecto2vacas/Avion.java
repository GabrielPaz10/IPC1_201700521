package proyecto2vacas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Ludwing_98
 */
public class Avion {
    int turnosDesabordaje;
    int turnosMantenimiento;
    int pasajeros;
    Random alea= new Random(System.nanoTime());
    String tamaño;
    int tamañito;
    public Avion(int turnoD){
        this.turnosDesabordaje=turnoD;
    }
    public Avion(int turnoM,int turno){
        this.turnosMantenimiento=turnoM;
    }

    public Avion() {
        tamañito= alea.nextInt(3)+1;
        
            if (tamañito==1){
                tamaño = "Pequeño";
                turnosDesabordaje=1;
                //Random turno= new Random(System.nanoTime());
                //turnosMantenimiento= Integer.parseInt(turno.ints(1, 4).toString());
                turnosMantenimiento = ThreadLocalRandom.current().nextInt(2, 5);
                //Random pasaje= new Random(System.nanoTime());
                //pasajeros = Integer.parseInt(pasaje.ints(5,11).toString());
                pasajeros= ThreadLocalRandom.current().nextInt(5, 11);
            }
            else if (tamañito==2){
                tamaño = "Mediano";
                turnosDesabordaje=2;
                //Random turno= new Random(System.nanoTime());
                //turnosMantenimiento= Integer.parseInt(turno.ints(2, 5).toString());
                turnosMantenimiento = ThreadLocalRandom.current().nextInt(2, 5);
                //Random pasaje= new Random(System.nanoTime());
                //pasajeros = Integer.parseInt(pasaje.ints(15,26).toString());
                pasajeros = ThreadLocalRandom.current().nextInt(15, 26);
            }
            else if (tamañito==3){
                tamaño = "Grande";
                turnosDesabordaje=3;
                //Random turno= new Random(System.nanoTime());
                //turnosMantenimiento= Integer.parseInt(turno.ints(3, 7).toString());
                turnosMantenimiento = ThreadLocalRandom.current().nextInt(3, 7);
                //Random pasaje= new Random(System.nanoTime());
                //pasajeros = Integer.parseInt(pasaje.ints(30,41).toString());
                pasajeros= ThreadLocalRandom.current().nextInt(30, 41);
            }
        
    }

    public int getTurnosDesabordaje() {
        return turnosDesabordaje;
    }

    public void setTurnosDesabordaje(int turnosDesabordaje) {
        this.turnosDesabordaje = turnosDesabordaje;
    }

    public int getTurnosMantenimiento() {
        return turnosMantenimiento;
    }

    public void setTurnosMantenimiento(int turnosMantenimiento) {
        this.turnosMantenimiento = turnosMantenimiento;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String toString(/*int no*/){
        return "Avion "+"\nTipo: "+tamaño+"\nNo Pasajeros: "+pasajeros+"\nTurnos Mantenimiento: "+turnosMantenimiento+"\nTurnos Desabordaje: "+ turnosDesabordaje;
    }
    public String toString(int no){
        return "Avion "+no+"\nTipo: "+tamaño+
                "\nNo Pasajeros: "+pasajeros+
                "\nTurnos Mantenimiento: "+turnosMantenimiento+
                "\nTurnos Desabordaje: "+ turnosDesabordaje;
    }
}
    