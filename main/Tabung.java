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
public class Tabung extends variable implements MenghitungRuang {
    
    public Tabung(double p, double l, double t, double r){
    super(p,l,t,r);
    }

    @Override
    public void lp() {
        double lt;
         lt = 2*3.14*r*(r+t);
         System.out.println("Luas Permukaan Tabung adalah : " + lt);
         
    }

    @Override
    public void vol() {
        double vt;
         vt = 3.14*r*r*t;
         System.out.println("Volume Tabung adalah : " + vt);
    }
    
}
