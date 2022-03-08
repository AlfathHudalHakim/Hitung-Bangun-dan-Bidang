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
public class PersegiPanjang extends variable implements MenghitungBidang{
    
    public PersegiPanjang(double p, double l, double t, double r) {
        super(p,l,t,r);
    }

    @Override
    public void kll() {
        double kll2;
        kll2 = 2*(p+l);
        System.out.println("Keliling Persegi Panjang adalah : " + kll2);
    }

    @Override
    public void luas() {
        double lu2;
        lu2 = p*l;
        System.out.println("Luas Persegi Panjang adalah : " + lu2);
        
    }
}
