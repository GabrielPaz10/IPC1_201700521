package proyecto1_vj2018;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ludwing_98
 */
public class MovimientoAbajo extends Thread{
    public int cantidad=0;
    public Tablero1 tablero=null;
    public MovimientoAbajo (int cantidad, Tablero1 tablero){
        this.cantidad= cantidad;
        this.tablero= tablero;
    }
    public boolean comprobarfin(){
        if (tablero.personaje.posMagoX>=tablero.tam-1) {
            return true;
        }
        return false;
    }
    public void moverAbajo(int cantidad){
        if (cantidad<=0) {
            return;
        }
        if(comprobarfin()){
            cantidad=0;
            tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
            tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
            tablero.personaje.posMagoX=0;
            tablero.vecLo[0][0]=1;
            tablero.repintar();
        }
        else{
            try {
                //mover una posicion
                tablero.vecLo[tablero.personaje.posMagoX][tablero.personaje.posMagoY]=0;
                tablero.vecG[tablero.personaje.posMagoX][tablero.personaje.posMagoY].setIcon(null);
                tablero.repintar();
                tablero.personaje.posMagoX+=1;
                tablero.vecLo[tablero.personaje.posMagoX][tablero.personaje.posMagoY]=1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                moverAbajo(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(MovimientoAbajo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void run(){
        moverAbajo(cantidad);
    }
}
