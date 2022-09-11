package com.example.test;

import javafx.scene.input.DataFormat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Nomor4Peramal {
    public static void main(String[] args) {
        app();
    }

    public static void app(){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("   Selamat Datang Di Program Ramalan Cupu");
        System.out.println("=============================================");

        System.out.println("Data Anda :");
        System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665");

        System.out.print("Masukkan Nama Anda : ");
        String nm_anda = sc.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        int age_anda = sc.nextInt();
        sc.nextLine();

        System.out.println();

        System.out.println("Data Pasangan Anda :");
        System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");

        System.out.print("Masukkan Nama Pasangan Anda : ");
        String nm_pas = sc.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        int age_pas = sc.nextInt();

        System.out.println();
        System.out.println(nm_anda.toUpperCase()+" ["+age_anda+"] tahun");

        int n = Integer.parseInt("5");
        for (int i = -3*n/2; i <= n; i++) {
            for (int j = -3*n/2; j <= 3*n/2; j++) {

                // inside either diamond or two circles
                if ((Math.abs(i) + Math.abs(j) < n)
                        || ((-n/2-i) * (-n/2-i) + ( n/2-j) * ( n/2-j) <= n*n/2)
                        || ((-n/2-i) * (-n/2-i) + (-n/2-j) * (-n/2-j) <= n*n/2)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(nm_pas.toUpperCase()+" ["+age_pas+"] tahun");

        System.out.print("Tekan Enter untuk melihat hasil ramalan ......");
        try{System.in.read();}catch(Exception e){}
        int x = (int) ((Math.random() * (100 - 50)) + 50);
        double hasil = x/1.1;
        System.out.println("Kecocokan anda dengan pasangan anda adalah : "+df.format(hasil)+" %");

    }
}
