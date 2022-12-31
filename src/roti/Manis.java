/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roti;

import java.util.stream.IntStream;

/**
 *
 * @author BrxxN
 */
public class Manis extends Roti {
    
    // Komposisi roti manis
    private final int[] komposisi = {
        1000, //0.Tepung Terigu
        150,  //1.Gula Pasir
        150,  //2.Butter
        20,   //3.Ragi
        300,  //4.Susu Bubuk
        250,  //5.Susu Cair
        80,   //6.Telur
        400   //7.Es Batu
    };
    
    // Berat dough per pcs
    private final int beratPerPcs = 50;    

    // Constructor
    public Manis() {
        this.jenisRoti = "Roti Manis";
    }

    @Override
    public void pilihVarian(int nomorVarian) {
    }

    @Override
    protected void hitungVarian() {
    }

    // Method untuk menghitung BERAT per bahan yang diperlukan berdasarkan banyaknya pesanan dan komposisi
    @Override
    protected void hitungTotalBahan() {
        double beratDough = IntStream.of(this.komposisi).sum();
        
        double beratTotal = this.beratPerPcs * this.jumPesanan;
        
        this.totalDough = beratTotal;
        this.tepungTerigu = beratTotal / beratDough * this.komposisi[0];
        this.gulaPasir = beratTotal / beratDough * this.komposisi[1];
        this.butter = beratTotal / beratDough * this.komposisi[2];
        this.ragi = beratTotal / beratDough * this.komposisi[3];
        this.susuBubuk = beratTotal / beratDough * this.komposisi[4];
        this.susuCair = beratTotal / beratDough * this.komposisi[5];
        this.telur = beratTotal / beratDough * this.komposisi[6];
        this.esBatu = beratTotal / beratDough * this.komposisi[7];
    }
}
