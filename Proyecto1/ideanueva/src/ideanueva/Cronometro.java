/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ideanueva;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Ludwing_98
 */
public class Cronometro extends Thread{
    HolaPerros hola= new HolaPerros();
    int segundos = 120;
    JLabel label;

    public Cronometro(JLabel label) {
        this.label = label;
    }
    
    public void disminuir(JLabel label){
        for (;;) {
            try {
                int segs=120;
                label.setText(" "+(segundos-1));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HolaPerros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void run(){
        disminuir(label);
    }
    
}
