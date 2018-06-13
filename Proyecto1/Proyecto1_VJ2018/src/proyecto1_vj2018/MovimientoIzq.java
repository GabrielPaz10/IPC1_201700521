/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_vj2018;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ludwing_98
 */
public class MovimientoIzq extends Thread{
    public int cantidad=0;
    public Tablero1 tablero=null;
    public MovimientoIzq (int cantidad, Tablero1 tablero){
        this.cantidad= cantidad;
        this.tablero= tablero;
    }
    public boolean comprobarfin(){
        if (tablero.personaje.posMagoY<=0) {
            return true;
        }
        return false;
    }
    public void moverIzq(int cantidad){
        if (cantidad<=0) {
            return;
        }
        if(comprobarfin()){
            cantidad=0;
            tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
            tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
            tablero.personaje.posMagoY=(tablero.tam/2)+1;
            tablero.vecLo[0][0]=1;
            tablero.repintar();
        }
        else{
            try {
                //mover una posicion
                tablero.vecLo[tablero.personaje.posMagoX][tablero.personaje.posMagoY]=0;
                tablero.vecG[tablero.personaje.posMagoX][tablero.personaje.posMagoY].setIcon(null);
                tablero.repintar();
                tablero.personaje.posMagoY-=1;
                tablero.vecLo[tablero.personaje.posMagoX][tablero.personaje.posMagoY]=1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                moverIzq(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(MovimientoArriba.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void run(){
        moverIzq(cantidad);
    }

}
