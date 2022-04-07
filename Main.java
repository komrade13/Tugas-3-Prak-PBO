/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author alfaa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        GUI gui = new GUI();
        
        gui.bsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double len, wid, hei;
                    len = Double.parseDouble(gui.getfLen());
                    wid = Double.parseDouble(gui.getfWid());
                    hei = Double.parseDouble(gui.getfHei());
                    
                    Calc sq = new Calc();
                    JOptionPane.showMessageDialog(null, "Calculation complete!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    gui.ansSqAr.setText("" + sq.sqar(len, wid));
                    gui.ansSqCir.setText("" + sq.sqc(len, wid));
                    gui.ansCubVol.setText("" + sq.cubv(len, wid, hei));
                    gui.ansCubSA.setText("" + sq.cubsa(len, wid, hei));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields with postive integers only", "Error", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        
        gui.breset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.fLen.setText("");
                gui.fWid.setText("");
                gui.fHei.setText("");
                gui.ansCubSA.setText("");
                gui.ansCubVol.setText("");
                gui.ansSqAr.setText("");
                gui.ansSqCir.setText("");
            }
            
        });
        
        /*gui.rmen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(gui.getRmen() +" selected");
        }*/
    };
 }    