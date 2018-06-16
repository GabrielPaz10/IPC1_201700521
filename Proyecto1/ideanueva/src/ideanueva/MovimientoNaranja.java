package ideanueva;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ludwing_98
 */
public class MovimientoNaranja extends Thread{
    public int cantidad=0;
    public Tablero tablero=null;
    public int per;
    public  int numero;
    public MovimientoNaranja (int cantidad, Tablero tablero, int numero,int per){
        this.cantidad= cantidad;
        this.tablero= tablero;
        this.numero=numero;
        this.per=per;
    }
    public boolean comprobarfin(){
        if (tablero.personaje.pospery>=tablero.tam-1||tablero.personaje.posperx>=tablero.tam-1) {
            return true;
        }
        return false;
    }
    public boolean comprobarinicio(){
        if (tablero.personaje.pospery<=0||tablero.personaje.posperx<=0) {
            return true;
        }
        return false;
    }
    public void moverArriba(int cantidad){
        switch(per){
            case 1:
                switch (numero){
                    case 1: if (cantidad<=0)
                                return;
                            if(comprobarfin()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.personaje.pospery=0;
                                tablero.personaje.posperx=0;
                                tablero.vecLo[0][0]=1;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.personaje.pospery][tablero.personaje.posperx]=0;
                                    tablero.vecG[tablero.personaje.pospery][tablero.personaje.posperx].setIcon(null);
                                    tablero.repintar();
                                    tablero.personaje.pospery+=1;
                                    tablero.vecLo[tablero.personaje.pospery][tablero.personaje.posperx]=1;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 2: if (cantidad<=0) {
                               return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.personaje.pospery=0;
                                tablero.personaje.posperx=0;
                                tablero.vecLo[0][0]=1;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.personaje.pospery][tablero.personaje.posperx]=0;
                                    tablero.vecG[tablero.personaje.pospery][tablero.personaje.posperx].setIcon(null);
                                    tablero.repintar();
                                    tablero.personaje.pospery-=1;
                                    tablero.vecLo[tablero.personaje.pospery][tablero.personaje.posperx]=1;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }       
                            break;
                    case 3: if (cantidad<=0) {
                                return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.personaje.posperx=(tablero.tam/2)+1;
                                tablero.vecLo[0][0]=1;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.personaje.pospery][tablero.personaje.posperx]=0;
                                    tablero.vecG[tablero.personaje.pospery][tablero.personaje.posperx].setIcon(null);
                                    tablero.repintar();
                                    tablero.personaje.posperx-=1;
                                    tablero.vecLo[tablero.personaje.pospery][tablero.personaje.posperx]=1;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 4:
                        if (cantidad<=0) {
                            return;
                        }
                        if(comprobarfin()){
                            cantidad=0;
                            tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                            tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                            tablero.personaje.posperx=0;
                            tablero.vecLo[0][0]=1;
                            tablero.repintar();
                        }
                        else{
                            try {
                                //mover una posicion
                                tablero.vecLo[tablero.personaje.pospery][tablero.personaje.posperx]=0;
                                tablero.vecG[tablero.personaje.pospery][tablero.personaje.posperx].setIcon(null);
                                tablero.repintar();
                                tablero.personaje.posperx+=1;
                                tablero.vecLo[tablero.personaje.pospery][tablero.personaje.posperx]=1;
                                tablero.repintar();
                                cantidad--;
                                Thread.sleep(500);
                                moverArriba(cantidad);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                }
                break;
            case 2:switch (numero){
                    case 1: if (cantidad<=0)
                                return;
                            if(comprobarfin()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.barbaro2.posX=0;
                                tablero.barbaro2.posY=0;
                                tablero.vecLo[0][0]=4;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.barbaro2.posX][tablero.barbaro2.posY]=0;
                                    tablero.vecG[tablero.barbaro2.posX][tablero.barbaro2.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.barbaro2.posX+=1;
                                    tablero.vecLo[tablero.barbaro2.posX][tablero.barbaro2.posY]=4;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 2: if (cantidad<=0) {
                               return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.barbaro2.posX=0;
                                tablero.vecLo[0][0]=4;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.barbaro2.posX][tablero.barbaro2.posY]=0;
                                    tablero.vecG[tablero.barbaro2.posX][tablero.barbaro2.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.barbaro2.posX-=1;
                                    tablero.vecLo[tablero.barbaro2.posX][tablero.barbaro2.posY]=4;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }       
                            break;
                    case 3: if (cantidad<=0) {
                                return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.barbaro2.posY=(tablero.tam/2)+1;
                                tablero.vecLo[0][0]=4;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.barbaro2.posX][tablero.barbaro2.posY]=0;
                                    tablero.vecG[tablero.barbaro2.posX][tablero.barbaro2.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.barbaro2.posY-=1;
                                    tablero.vecLo[tablero.barbaro2.posX][tablero.barbaro2.posY]=4;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 4:
                        if (cantidad<=0) {
                            return;
                        }
                        if(comprobarfin()){
                            cantidad=0;
                            tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                            tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                            tablero.barbaro2.posY=0;
                            tablero.vecLo[0][0]=4;
                            tablero.repintar();
                        }
                        else{
                            try {
                                //mover una posicion
                                tablero.vecLo[tablero.barbaro2.posX][tablero.barbaro2.posY]=0;
                                tablero.vecG[tablero.barbaro2.posX][tablero.barbaro2.posY].setIcon(null);
                                tablero.repintar();
                                tablero.barbaro2.posY+=1;
                                tablero.vecLo[tablero.barbaro2.posX][tablero.barbaro2.posY]=4;
                                tablero.repintar();
                                cantidad--;
                                Thread.sleep(500);
                                moverArriba(cantidad);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                }
                break;
            case 3:switch (numero){
                    case 1: if (cantidad<=0)
                                return;
                            if(comprobarfin()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.mago1.posMagoX=0;
                                tablero.mago1.posMagoY=0;
                                tablero.vecLo[0][0]=2;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.mago1.posMagoX][tablero.mago1.posMagoY]=0;
                                    tablero.vecG[tablero.mago1.posMagoX][tablero.mago1.posMagoY].setIcon(null);
                                    tablero.repintar();
                                    tablero.mago1.posMagoX+=1;
                                    tablero.vecLo[tablero.mago1.posMagoX][tablero.mago1.posMagoY]=2;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 2: if (cantidad<=0) {
                               return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.mago1.posMagoX=0;
                                tablero.mago1.posMagoY=0;
                                tablero.vecLo[0][0]=2;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.mago1.posMagoX][tablero.mago1.posMagoY]=0;
                                    tablero.vecG[tablero.mago1.posMagoX][tablero.mago1.posMagoY].setIcon(null);
                                    tablero.repintar();
                                    tablero.mago1.posMagoX-=1;
                                    tablero.vecLo[tablero.mago1.posMagoX][tablero.mago1.posMagoY]=1;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }       
                            break;
                    case 3: if (cantidad<=0) {
                                return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.mago1.posMagoY=(tablero.tam/2)+1;
                                tablero.vecLo[0][0]=2;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.mago1.posMagoX][tablero.mago1.posMagoY]=0;
                                    tablero.vecG[tablero.mago1.posMagoX][tablero.mago1.posMagoY].setIcon(null);
                                    tablero.repintar();
                                    tablero.mago1.posMagoY-=1;
                                    tablero.vecLo[tablero.mago1.posMagoX][tablero.mago1.posMagoY]=2;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 4:
                        if (cantidad<=0) {
                            return;
                        }
                        if(comprobarfin()){
                            cantidad=0;
                            tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                            tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                            tablero.mago1.posMagoY=0;
                            tablero.vecLo[0][0]=2;
                            tablero.repintar();
                        }
                        else{
                            try {
                                //mover una posicion
                                tablero.vecLo[tablero.mago1.posMagoX][tablero.mago1.posMagoY]=0;
                                tablero.vecG[tablero.mago1.posMagoX][tablero.mago1.posMagoY].setIcon(null);
                                tablero.repintar();
                                tablero.mago1.posMagoY+=1;
                                tablero.vecLo[tablero.mago1.posMagoX][tablero.mago1.posMagoY]=2;
                                tablero.repintar();
                                cantidad--;
                                Thread.sleep(500);
                                moverArriba(cantidad);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                }
                break;
            case 4:switch (numero){
                    case 1: if (cantidad<=0)
                                return;
                            if(comprobarfin()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.mago2.posX=0;
                                tablero.mago2.posY=0;
                                tablero.vecLo[0][0]=3;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.mago2.posX][tablero.mago2.posY]=0;
                                    tablero.vecG[tablero.mago2.posX][tablero.mago2.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.mago2.posX+=1;
                                    tablero.vecLo[tablero.mago2.posX][tablero.mago2.posY]=3;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 2: if (cantidad<=0) {
                               return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.mago2.posX=0;
                                tablero.mago2.posY=0;
                                tablero.vecLo[0][0]=3;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.mago2.posX][tablero.mago2.posY]=0;
                                    tablero.vecG[tablero.mago2.posX][tablero.mago2.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.mago2.posX-=1;
                                    tablero.vecLo[tablero.mago2.posX][tablero.mago2.posY]=3;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }       
                            break;
                    case 3: if (cantidad<=0) {
                                return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.mago2.posY=(tablero.tam/2)+1;
                                tablero.vecLo[0][0]=3;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.mago2.posX][tablero.mago2.posY]=0;
                                    tablero.vecG[tablero.mago2.posX][tablero.mago2.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.mago2.posY-=1;
                                    tablero.vecLo[tablero.mago2.posX][tablero.mago2.posY]=3;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 4:
                        if (cantidad<=0) {
                            return;
                        }
                        if(comprobarfin()){
                            cantidad=0;
                            tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                            tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                            tablero.mago2.posY=0;
                            tablero.vecLo[0][0]=3;
                            tablero.repintar();
                        }
                        else{
                            try {
                                //mover una posicion
                                tablero.vecLo[tablero.mago2.posX][tablero.mago2.posY]=0;
                                tablero.vecG[tablero.mago2.posX][tablero.mago2.posY].setIcon(null);
                                tablero.repintar();
                                tablero.mago2.posY+=1;
                                tablero.vecLo[tablero.mago2.posX][tablero.mago2.posY]=3;
                                tablero.repintar();
                                cantidad--;
                                Thread.sleep(500);
                                moverArriba(cantidad);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                }
                break;
            case 5: switch (numero){
                    case 1: if (cantidad<=0)
                                return;
                            if(comprobarfin()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.princesa1.posX=0;
                                tablero.princesa1.posY=0;
                                tablero.vecLo[0][0]=5;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.princesa1.posX][tablero.princesa1.posY]=0;
                                    tablero.vecG[tablero.princesa1.posX][tablero.princesa1.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.princesa1.posX+=1;
                                    tablero.vecLo[tablero.princesa1.posX][tablero.princesa1.posY]=5;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 2: if (cantidad<=0) {
                               return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.princesa1.posX=0;
                                tablero.princesa1.posY=0;
                                tablero.vecLo[0][0]=5;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.princesa1.posX][tablero.princesa1.posY]=0;
                                    tablero.vecG[tablero.princesa1.posX][tablero.princesa1.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.princesa1.posX-=1;
                                    tablero.vecLo[tablero.princesa1.posX][tablero.princesa1.posY]=5;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }       
                            break;
                    case 3: if (cantidad<=0) {
                                return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.princesa1.posY=(tablero.tam/2)+1;
                                tablero.vecLo[0][0]=5;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.princesa1.posX][tablero.princesa1.posY]=0;
                                    tablero.vecG[tablero.princesa1.posX][tablero.princesa1.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.princesa1.posY-=1;
                                    tablero.vecLo[tablero.princesa1.posX][tablero.princesa1.posY]=5;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 4:
                        if (cantidad<=0) {
                            return;
                        }
                        if(comprobarfin()){
                            cantidad=0;
                            tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                            tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                            tablero.princesa1.posY=0;
                            tablero.vecLo[0][0]=5;
                            tablero.repintar();
                        }
                        else{
                            try {
                                //mover una posicion
                                tablero.vecLo[tablero.princesa1.posX][tablero.princesa1.posY]=0;
                                tablero.vecG[tablero.princesa1.posX][tablero.princesa1.posY].setIcon(null);
                                tablero.repintar();
                                tablero.princesa1.posY+=1;
                                tablero.vecLo[tablero.princesa1.posX][tablero.princesa1.posY]=5;
                                tablero.repintar();
                                cantidad--;
                                Thread.sleep(500);
                                moverArriba(cantidad);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                }
                break;
            case 6:switch (numero){
                    case 1: if (cantidad<=0)
                                return;
                            if(comprobarfin()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.princesa2.posX=0;
                                tablero.princesa2.posY=0;
                                tablero.vecLo[0][0]=6;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.princesa2.posX][tablero.princesa2.posY]=0;
                                    tablero.vecG[tablero.princesa2.posX][tablero.princesa2.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.princesa2.posX+=1;
                                    tablero.vecLo[tablero.princesa2.posX][tablero.princesa2.posY]=6;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 2: if (cantidad<=0) {
                               return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.princesa2.posX=0;
                                tablero.princesa2.posY=0;
                                tablero.vecLo[0][0]=6;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.princesa2.posX][tablero.princesa2.posY]=0;
                                    tablero.vecG[tablero.princesa2.posX][tablero.princesa2.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.princesa2.posX-=1;
                                    tablero.vecLo[tablero.princesa2.posX][tablero.princesa2.posY]=6;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }       
                            break;
                    case 3: if (cantidad<=0) {
                                return;
                            }
                            if(comprobarinicio()){
                                cantidad=0;
                                tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                                tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                                tablero.princesa2.posY=(tablero.tam/2)+1;
                                tablero.vecLo[0][0]=6;
                                tablero.repintar();
                            }
                            else{
                                try {
                                    //mover una posicion
                                    tablero.vecLo[tablero.princesa2.posX][tablero.princesa2.posY]=0;
                                    tablero.vecG[tablero.princesa2.posX][tablero.princesa2.posY].setIcon(null);
                                    tablero.repintar();
                                    tablero.princesa2.posY-=1;
                                    tablero.vecLo[tablero.princesa2.posX][tablero.princesa2.posY]=6;
                                    tablero.repintar();
                                    cantidad--;
                                    Thread.sleep(500);
                                    moverArriba(cantidad);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        break;
                    case 4:
                        if (cantidad<=0) {
                            return;
                        }
                        if(comprobarfin()){
                            cantidad=0;
                            tablero.vecLo[tablero.tam-1][tablero.tam-1]=0;
                            tablero.vecG[tablero.tam-1][tablero.tam-1].setIcon(null);
                            tablero.princesa2.posY=0;
                            tablero.vecLo[0][0]=6;
                            tablero.repintar();
                        }
                        else{
                            try {
                                //mover una posicion
                                tablero.vecLo[tablero.princesa2.posX][tablero.princesa2.posY]=0;
                                tablero.vecG[tablero.princesa2.posX][tablero.princesa2.posY].setIcon(null);
                                tablero.repintar();
                                tablero.princesa2.posY+=1;
                                tablero.vecLo[tablero.princesa2.posX][tablero.princesa2.posY]=6;
                                tablero.repintar();
                                cantidad--;
                                Thread.sleep(500);
                                moverArriba(cantidad);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(MovimientoNaranja.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                }
                break;
        }
    }
    public void run(){
        
        
            moverArriba(cantidad);
        
            //moverAbajo(cantidad);
    }
}
