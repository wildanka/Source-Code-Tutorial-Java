/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarinheritance.sepeda;

/**
 *
 * @author DAN
 */
public class SepedaGunung extends Sepeda{
    
    public void gunakanSepedaGunung(String namaSepeda){
        berjalan(namaSepeda);
        mengerem(namaSepeda);
         System.out.println("Saya "+namaSepeda+" memiliki roda sebanyak : "+roda);
    }
}
