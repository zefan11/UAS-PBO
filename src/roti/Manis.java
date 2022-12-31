/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roti;

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

    @Override
    protected void hitungTotalBahan() {
    }
}
