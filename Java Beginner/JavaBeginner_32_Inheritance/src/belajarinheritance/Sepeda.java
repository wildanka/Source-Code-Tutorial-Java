/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarinheritance;

/**
 *
 * @author DAN
 */
public class Sepeda {
    int roda = 2;
    int rantai = 1;
    
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
