/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import javax.swing.*;
/**
 *
 * @author alfaa
 */
public class GUI extends JFrame {
    
    JLabel labLen = new JLabel("Length");
    JTextField fLen = new JTextField();
    
    JLabel labWid = new JLabel("Width");
    JTextField fWid = new JTextField();
    
    JLabel labHei = new JLabel("Height");
    JTextField fHei = new JTextField();
    
    JLabel labSqAr = new JLabel("Square Area : ");
    JLabel ansSqAr = new JLabel();
    
    JLabel labSqCir = new JLabel("Square Circumference : ");
    JLabel ansSqCir = new JLabel();
    
    JLabel labCubVol = new JLabel("Cuboid Volume : ");
    JLabel ansCubVol = new JLabel();
    
    JLabel labCubSA = new JLabel("Cuboid Surface Area : ");
    JLabel ansCubSA = new JLabel();
    
    JButton bsave = new JButton("Calculate");
    JButton breset = new JButton("Reset");
    
    public GUI(){
        setTitle("Cuboid Calculator");
        setSize(310,330);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(labLen);
        add(fLen);
        add(labWid);
        add(fWid);
        add(labHei);
        add(fHei);
        add(bsave);
        add(breset);
        
        add(labSqAr);
        add(ansSqAr);
        add(labSqCir);
        add(ansSqCir);
        add(labCubVol);
        add(ansCubVol);
        add(labCubSA);
        add(ansCubSA);
        
        labLen.setBounds(10, 10, 120, 20);
        fLen.setBounds(130, 10, 150, 20);
        
        labWid.setBounds(10, 40, 120, 20);
        fWid.setBounds(130, 40, 150, 20);
        
        labHei.setBounds(10, 70, 120, 20);
        fHei.setBounds(130, 70, 150, 20);
        
        bsave.setBounds(50, 120, 90, 20);
        breset.setBounds(200, 120, 75, 20);
        
        labSqAr.setBounds(10, 170, 150, 20);
        ansSqAr.setBounds(210, 170, 150, 20);
        
        labSqCir.setBounds(10, 200, 150, 20);
        ansSqCir.setBounds(210, 200, 150, 20);
        
        labCubVol.setBounds(10, 230, 150, 20);
        ansCubVol.setBounds(210, 230, 150, 20);
        
        labCubSA.setBounds(10, 260, 150, 20);
        ansCubSA.setBounds(210, 260, 150, 20);
    }
    
    public String getFname() {
        return fLen.getText();
    }

    String getfLen() {
        return fLen.getText();
    }

    String getfWid() {
        return fWid.getText(); 
    }

    String getfHei() {
        return fHei.getText(); 
    }
    
}
