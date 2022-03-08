/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Frosz
 */
public class Balok extends variable implements MenghitungRuang{
   
    public Balok(double p, double l, double t, double r){
    super(p,l,t,r);
    }

    @Override
    public void lp() {
         double lb;
         lb = 2*(p*l+p*l+p*t+l*t);
         System.out.println("Luas Permukaan Balok adalah : " + lb);
    }

    @Override
    public void vol() {
        double vb;
         vb = p*l*t;
         System.out.println("Volume Balok adalah : " + vb); 
    }
}
