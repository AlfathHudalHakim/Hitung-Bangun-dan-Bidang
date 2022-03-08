/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Frosz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int temp = 1;
        int temp1;
        
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("|           MENU UTAMA         |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" 1.Persegi Panjang dan Balok");
            System.out.println(" 2.Lingkaran dan Tabung");
            System.out.println(" 3.Exit");
            System.out.print("Input Menu  : ");
            int pil = Input.nextInt();
        
         switch (pil){
              case 1 : 
                  do{
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|  Persegi Panjang Dan Balok   |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("Input Panjang : "); double p = Input.nextDouble();
                    System.out.print("Input Lebar   : "); double l = Input.nextDouble();
                    System.out.print("Input Tinggi  : "); double t = Input.nextDouble();
                    PersegiPanjang persegipanjang = new PersegiPanjang (p, l, t, 0);
                    Balok balok = new Balok (p, l, t, 0);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|       Persegi Panjang        |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    persegipanjang.kll();
                    persegipanjang.luas();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|            Balok             |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    balok.lp();
                    balok.vol();
                    System.out.print("Ulang ?? Ya:1 Tidak:0 : ");
                    int pil2 = Input.nextInt();
                    temp1=pil2;
                    }while( temp1 != 0);
                    break;
                case 2 : 
                    do{
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|    Lingkaran Dan Tabung      |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("Input Jari-Jari : "); double r = Input.nextDouble();
                    System.out.print("Input Tinggi  : "); double t1 = Input.nextDouble();
                    Tabung tabung = new Tabung (0, 0, t1, r);
                    Lingkaran lingkaran = new Lingkaran (0, 0,t1 ,r);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|          Lingkaran           |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    lingkaran.kll();
                    lingkaran.luas();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|            Tabung            |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    tabung.lp();
                    tabung.vol();
                    System.out.print("Ulang ?? Ya:1 Tidak:0 : ");
                    int pil2 = Input.nextInt();
                    temp1=pil2;
                    }while( temp1 != 0);
                    break;
                case 3 : System.out.println("\nProgram Selesai ! "); System.exit(0);
                    break;
                default : System.out.print("Masukkan Pilihan Dengan Benar !! \n"); 
            }
    }
        while(temp!=3);
    }  
}
