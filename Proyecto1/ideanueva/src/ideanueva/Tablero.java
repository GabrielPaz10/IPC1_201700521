package ideanueva;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Tablero {
    public int tam=0;
    public JPanel fondo= null;
    public int[][] vecLo ;
    public Barbaro1 personaje;
    public Mago1 mago1;
    public Mago2 mago2;
    public Barbaro2 barbaro2;
    public Princesa1 princesa1;
    public Princesa2 princesa2;
    public JLabel[][]vecG;
    public int tambloquey;
    public int tambloquex;
    public int a,b,c,d,e,f,g,h,k,l,m,n;
    public ImageIcon obtenerImagen(){
        ImageIcon per= new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        Image imagen = per.getImage();
        Image tamImagen = imagen.getScaledInstance(510, 510, Image.SCALE_SMOOTH);
        per = new ImageIcon(tamImagen);
        return per;
    }
    public Random ale = new Random(System.nanoTime());
    public Tablero(int tam, JPanel panel){
        this.tam=tam;
        this.fondo= panel;
        llenar();
    }
    public void llenar(){
        tambloquey = 450/tam;
        tambloquex = 450/tam;
        vecLo= new int[tam][tam];
        vecG= new JLabel[tam][tam];
        //1 personaje, 0 vacío
        a = ale.nextInt(tam);
        b= ale.nextInt(tam);
        c= ale.nextInt(tam);
        d = ale.nextInt(tam);
        e= ale.nextInt(tam);
        f= ale.nextInt(tam);
        g = ale.nextInt(tam);
        h= ale.nextInt(tam);
        k= ale.nextInt(tam);
        l = ale.nextInt(tam);
        m= ale.nextInt(tam);
        n= ale.nextInt(tam);
        vecLo[a][b]=1;
        personaje= new Barbaro1();
        personaje.pospery=a;
        personaje.posperx=b;
        vecLo[c][d]=2;
        mago1= new Mago1();
        mago1.posMagoX=c;
        mago1.posMagoY=d;
        vecLo[e][f]=3;
        mago2= new Mago2();
        mago2.posX=e;
        mago2.posY=f;
        vecLo[g][h]=4;
        barbaro2= new Barbaro2();
        barbaro2.posX=g;
        barbaro2.posY=h;
        vecLo[k][l]=5;
        princesa1= new Princesa1();
        princesa1.posX=k;
        princesa1.posY=l;
        vecLo[m][n]=6;
        princesa2= new Princesa2();
        princesa2.posX=m;
        princesa2.posY=n;
        for (int i =1; i < tam; i++) {
            for (int j = 0; j < 10; j++) {
                if ((vecLo[i][j]!=vecLo[a][b])&&(vecLo[i][j]!=vecLo[c][d])&&(vecLo[i][j]!=vecLo[e][f])&&(vecLo[i][j]!=vecLo[g][h])&&(vecLo[i][j]!=vecLo[k][l])&&(vecLo[i][j]!=vecLo[m][n])) {
                    vecLo[i][j]= 0;
                }
            }
            
        }
        repintar();
    }
    public void repintar(){
        JLabel casilla = null;
        obtenerImagen();
        for (int i = 0; i < tam; i++) {
            //0 casilla vacia
            for (int j = 0; j < 10; j++) {
                if (vecLo[i][j]==0) {
                casilla = new JLabel();
                }//1
                else if(vecLo[i][j]==1){
                    casilla = new JLabel(this.personaje.obtenerImagen(tambloquey,tambloquex));
                }
                else if(vecLo[i][j]==2){
                    casilla = new JLabel(this.mago1.obtenerImagen(tambloquey,tambloquex));
                }
                else if(vecLo[i][j]==3){
                    casilla = new JLabel(this.mago2.obtenerImagen(tambloquey,tambloquex));
                }
                else if(vecLo[i][j]==4){
                    casilla = new JLabel(this.barbaro2.obtenerImagen(tambloquey,tambloquex));
                }
                else if(vecLo[i][j]==5){
                    casilla = new JLabel(this.princesa1.obtenerImagen(tambloquey,tambloquex));
                }
                else if(vecLo[i][j]==6){
                    casilla = new JLabel(this.princesa2.obtenerImagen(tambloquey,tambloquex));
                }
                casilla.setOpaque(false);
                casilla.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                casilla.setBounds(j*tambloquex, i*tambloquey, tambloquex, tambloquey);
                vecG[i][j]= casilla;
                fondo.add(vecG[i][j],BorderLayout.CENTER);
                fondo.repaint();
            }
        }
    }
}