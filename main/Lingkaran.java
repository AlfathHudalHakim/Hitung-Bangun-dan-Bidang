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
public class Lingkaran extends variable implements MenghitungBidang{

    public Lingkaran(double p, double l, double t, double r){
    super(p,l,t,r);
    }
    
    @Override
    public void kll() {
        double kll1;
        kll1 = 2*3.14*r;
        System.out.println("Keliling Lingkaran adalah : " + kll1);
    }

    @Override
    public void luas() {
        double lu1;
        lu1 = 3.14*r*r;
        System.out.println("Luas Lingkaran adalah : " + lu1);
    }
    
    
    
}
