/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.belajarinheritance.sepeda;

/**
 *
 * @author hp
 */
public class SepedaTandem extends Sepeda {

    private int jok = 2; 

    protected static String tampilkanJumlahJok(String merkJok, int hargaJok){
        return "Jumlah Jok Sepeda Tandem : "+hargaJok;
    }
    
    public void gunakanSepedaTandem(String namaSepeda) {
        System.out.println(String.valueOf(jok));
        tampilkanJumlahJok();
        
        //memanggil variable dan method di supreclass (Sepeda.java)
        System.out.println(String.valueOf(super.jok));
        super.tampilkanJumlahJok();
    }
}
