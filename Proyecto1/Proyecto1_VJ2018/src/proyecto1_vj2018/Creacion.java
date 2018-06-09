/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_vj2018;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ludwing_98
 */
public class Creacion extends JFrame{
    JLabel[][]bMatriz;
    JPanel panel;
    JLabel texto;
    public int tamMatriz(){
        int tam=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Tamaño", JOptionPane.CANCEL_OPTION)) ;
        return tam;
    }
    public JPanel getjpanel(){
        int tam = tamMatriz();
        panel= new JPanel();
        bMatriz= new JLabel[tam][tam];
        panel.setBounds(100,100,300,300);
        int numr= (int)Math.random()*10;
        panel.setLayout(new GridLayout(tam,tam));
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                bMatriz[i][j]= new JLabel(String.valueOf(numr));
                panel.add(bMatriz[i][j]);
            }
        }
        return panel;
    }
    public JLabel getTexto(){
        texto= new JLabel("Matriz");
        texto.setBounds(10, 10, 70, 80);
        return texto;
    
    }

    public Creacion() {
        add(getjpanel());
        add(getTexto());
        inicializar();
    }
    
    public void inicializar(){
        setLayout(null);
        setSize(600,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
