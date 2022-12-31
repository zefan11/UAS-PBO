/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roti;

import java.util.HashMap;

/**
 *
 * @author BrxxN
 */
public abstract class Roti {
    
    // Attribute untuk menyimpan nama Jenis Roti
    protected String jenisRoti;
    
    // Bahan Yang diperlukan
    protected double tepungTerigu;
    protected double gulaPasir;
    protected double butter;
    protected double ragi;
    protected double susuBubuk;
    protected double susuCair;
    protected double telur;
    protected double esBatu;
    protected double totalDough;
    
    // Jumlah Pesananan
    protected int jumPesanan;
    
    // Banyaknya Beli Kemasan per Bahan
    protected double modalBahan[] = new double[8];
    
    // Harga Beli Total Kemasan per Bahan
    protected double modalHarga[] = new double[8];
    
    // Total modal yang diperlukan
    protected double totalModal;
    
    // Attribute untuk menyimpan pilihan varian
    protected int nomorVarian;
    
    // Attribute untuk menyimpan Filling, Topping, Varian
    protected HashMap<String, Integer> filling = new HashMap<String, Integer>();
    protected HashMap<String, Integer> topping = new HashMap<String, Integer>();
    protected HashMap<String, Integer> varian = new HashMap<String, Integer>();
    
    // Validasi Jumlah Pesanan supaya tidak minus
    public void inputPesanan(int jum){
        if (jum > 0){
            this.jumPesanan = jum;
        } else {
            System.out.println("Pesanan tidak boleh minus");
            System.exit(0);
        }
    };
    
    // Abstract Method untuk memilih varian sekaligus validasi
    public abstract void pilihVarian(int nomorVarian);
    
    // Absrtract Method untuk menghitung total bahan per varian
    protected abstract void hitungVarian();
    
    // Entahlah tapi ini abstract method untuk menghitung total BERAT bahan yang diperlukan sesuai komposisi dan jumlah pesanan
    protected abstract void hitungTotalBahan();
    
    // Method untuk menampilkan BERAT bahan yang diperlukan berdasarkan banyaknya pesanan dan komposisi
    public void tampilTotalBahan(){
        hitungVarian();
        hitungTotalBahan();
        System.out.println("=============================================================================");
        System.out.println("=============================================================================");
        System.out.println("Total bahan yang diperlukan untuk membuat " + this.jumPesanan + " pcs " + this.jenisRoti);
        System.out.println("Varian : " + this.nomorVarian);
        System.out.println("============================================================================");
        System.out.printf("Tepung Terigu = %.2f gr \n", this.tepungTerigu);
        System.out.printf("Gula Pasir    = %.2f gr \n", this.gulaPasir);
        System.out.printf("Butter        = %.2f gr \n", this.butter);
        System.out.printf("Ragi          = %.2f gr \n", this.ragi);
        System.out.printf("Susu Bubuk    = %.2f gr \n", this.susuBubuk);
        System.out.printf("Susu Cair     = %.2f gr \n", this.susuCair);
        System.out.printf("Telur         = %.2f gr \n", this.telur);
        System.out.printf("Es Batu       = %.2f gr \n", this.esBatu);
        System.out.println("============================================================================");
        
        System.out.println("Isian :\n");
        
        for (String k : this.varian.keySet()){
            System.out.println( k + " = " + this.varian.get(k) + " gr");
        }
        
        System.out.println("============================================================================");
        System.out.printf("Berat Total Bahan  Roti  = %.2f gr \n", this.totalDough);        
        System.out.println("============================================================================");
        System.out.println("============================================================================");
    };

}
