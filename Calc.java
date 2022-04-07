/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author alfaa
 */
public class Calc {
    public double sqar(double len, double wid){
        double sqar = len * wid;
        return sqar;
    }
    
    public double sqc(double len, double wid){
        double sqc = (len * 2) + (wid * 2);
        return sqc;
    }
    
    public double cubv(double len, double wid, double hei){
        double cubv = len * wid * hei;
        return cubv;
    }
    
    public double cubsa(double len, double wid, double hei){
        double cubsa = (len * wid * 2) + (len * hei * 2) + (hei * wid * 2);
        return cubsa;
    }
}
