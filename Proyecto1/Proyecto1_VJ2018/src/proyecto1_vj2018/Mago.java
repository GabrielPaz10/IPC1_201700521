/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_vj2018;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Ludwing_98
 */
public class Mago {
    public int posMagoX;
    public int posMagoY;
    public ImageIcon obtenerImagen(int tamuy,int tamux){
        ImageIcon per= new ImageIcon(getClass().getResource("/imagenes/mago.png"));
        Image imagen = per.getImage();
        Image tamImagen = imagen.getScaledInstance(tamux, tamuy, Image.SCALE_SMOOTH);
        per = new ImageIcon(tamImagen);
        return per;
    }
    
}
