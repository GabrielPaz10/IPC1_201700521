package proyecto2vacas;

import java.util.Random;

/**
 *
 * @author Ludwing_98
 */
public class Pasajero {
    int maletas;
    int documentos;
    int turnoRegis;
    Random alea= new Random(System.nanoTime());
    int mal = alea.nextInt(4)+1;
    int doc = alea.nextInt(10)+1;
    int turn = alea.nextInt(3)+1;

    public Pasajero(int maletas, int documentos,int turnoRegis) {
        setMaletas(maletas);
        setDocumentos(documentos);
        setTurnoRegis(turnoRegis);
    }

    public int getTurnoRegis() {
        return turnoRegis;
    }

    public void setTurnoRegis(int turnoRegis) {
        this.turnoRegis = turnoRegis;
    }

    public Pasajero() {
        //int mal = alea.nextInt(6);
        //int doc = alea.nextInt(11);
        setMaletas(mal);
        setDocumentos(doc);
        setTurnoRegis(turn);
    }

    public String toString(){
        return "Pasajero"+"\nMaletas: "+maletas+"\nDocumentos: "+documentos+"\nTurnos de Registro: "+turnoRegis+"\n";
    }
    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public int getDocumentos() {
        return documentos;
    }

    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }
    
    
}
