/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_vj2018;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ludwing_98
 */
public class Tablero1 {
    public int tam=0;
    public JPanel fondo= null;
    public int[][] vecLo ;
    public Mago personaje;
    public JLabel[][]vecG;
    public int tambloquey;
    public int tambloquex;
    public Tablero1(int tam, JPanel panel){
        this.tam=tam;
        this.fondo= panel;
        llenar();
    }
    public void llenar(){
        tambloquey = 450/tam;
        tambloquex= 450/tam;
        vecLo= new int[tam][tam];
        vecG= new JLabel[tam][tam];
        //1 personaje, 0 vacío
        vecLo[0][0]=1;
        personaje= new Mago();
        personaje.posMagoY=0;
        for (int i =1; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                vecLo[i][j]= 0;
            }
            
        }
        repintar();
    }
    public void repintar(){
        JLabel casilla = null;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++){
            //0 casilla vacia
                if (vecLo[i][j]==0) {
                    casilla = new JLabel();
                }//1
                else{
                    casilla = new JLabel(this.personaje.obtenerImagen(tambloquey,tambloquex));
                }
                //casilla.setBounds(j, j, i, i);
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
