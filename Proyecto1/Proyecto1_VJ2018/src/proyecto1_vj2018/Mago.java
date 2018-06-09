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
    public int posMago;
    public ImageIcon obtenerImagen(int tamuy){
        ImageIcon per= new ImageIcon(getClass().getResource("/imagenes/mago.png"));
        Image imagen = per.getImage();
        Image tamImagen = imagen.getScaledInstance(150, tamuy, Image.SCALE_SMOOTH);
        per = new ImageIcon(tamImagen);
        return per;
    }
    
}
