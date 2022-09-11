package com.example.test;

import javafx.stage.Stage;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Nomor3TokoGudang {
    public void start(Stage stage) throws IOException {


    }

    public static void main(String[] args) {
        app();
    }

    private static void app() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Masukan Nama Anda : ");
        String name = sc.nextLine();

        System.out.println("     Stock Gudang Input Barang");
        System.out.println("=====================================");
        System.out.println("       SELAMAT DATANG "+ name.toUpperCase());
        System.out.println("--------------------------------------");

        System.out.print("Masukan Nama Barang Baru: ");
        String barang = sc.nextLine();
        System.out.print("Masukan Jumlah Barang Baru : ");
        int jumlah = sc.nextInt();
        System.out.print("Masukan Harga Beli Barang Tersebut : ");
        double hb = sc.nextDouble();
        System.out.print("Masukan Harga Jual Barang Tersebut : ");
        double hj = sc.nextDouble();

        System.out.println("     Stok Gudang Rincian Barang");
        System.out.println("=====================================");
        System.out.println("Nama Barang   : "+barang);
        System.out.println("Jumlah Barang : "+jumlah);
        System.out.println("Harga Beli    : Rp."+df.format(hb));
        System.out.println("Harga Jual    : Rp."+df.format(hj));

    }

}
