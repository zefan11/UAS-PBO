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

}
