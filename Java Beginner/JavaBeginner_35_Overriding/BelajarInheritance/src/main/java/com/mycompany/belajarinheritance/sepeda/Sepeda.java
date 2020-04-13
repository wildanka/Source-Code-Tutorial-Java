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
public class Sepeda {
    protected int roda = 2;
    protected int rantai = 1;
    protected int jok = 1;
    
    protected static String tampilkanJumlahJok(String merkJok, int hargaJok){
        return "Jumlah Jok Sepeda : "+String.valueOf(hargaJok); 
    }
    
    public void berjalan(String namaSepeda){
        System.out.println("Sepeda "+namaSepeda+" Berjalan...");
    }
    
    public void mengerem(String namaSepeda){
        System.out.println("Sepeda "+namaSepeda+" Mengerem.. ");
    }
    
    public void belokKanan(String namaSepeda){
        System.out.println("Sepeda "+namaSepeda+" berbelok ke Kanan ");
    }
    
    public void belokKiri(String namaSepeda){
        System.out.println("Sepeda "+namaSepeda+" berbelok ke Kiri ");
    }
}
