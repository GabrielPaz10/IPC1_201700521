/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ideanueva;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Ludwing_98
 */
public class Mago2 extends Thread{
    public int posX;
    public int posY;
    public int feurza=1;
    public Tablero tablero=null;
    public ImageIcon obtenerImagen(int tamuy,int tamux){
        ImageIcon per= new ImageIcon(getClass().getResource("/imagenes/maguito.png"));
        Image imagen = per.getImage();
        Image tamImagen = imagen.getScaledInstance(tamux, tamuy, Image.SCALE_SMOOTH);
        per = new ImageIcon(tamImagen);
        return per;
    }
    public void atacar(){
        
    }
}
