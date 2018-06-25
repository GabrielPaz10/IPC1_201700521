/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavacas;

import java.util.Random;

/**
 *
 * @author Ludwing_98
 */
public class Pasajero {
    int maletas;
    int documentos;
    Random alea= new Random(System.nanoTime());
    int mal = alea.nextInt(4)+1;
    int doc = alea.nextInt(10)+1;

    public Pasajero(int maletas, int documentos) {
        setMaletas(maletas);
        setDocumentos(documentos);
    }

    public Pasajero() {
        //int mal = alea.nextInt(6);
        //int doc = alea.nextInt(11);
        setMaletas(mal);
        setDocumentos(doc);
    }

    public String toString(int turno){
        return "Pasajero"+turno+"\nMaletas: "+maletas+"\nDocumentos: "+documentos+"\n";
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
