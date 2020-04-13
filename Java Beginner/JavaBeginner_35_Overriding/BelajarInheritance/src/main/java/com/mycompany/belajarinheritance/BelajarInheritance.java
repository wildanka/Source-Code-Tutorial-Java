/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.belajarinheritance;

import com.mycompany.belajarinheritance.sepeda.SepedaTandem;
import com.mycompany.belajarinheritance.sepeda.Sepeda;
import com.mycompany.belajarinheritance.sepeda.SepedaFixie;
import com.mycompany.belajarinheritance.sepeda.SepedaGunung;

/**
 *
 * @author hp
 */
public class BelajarInheritance {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance objek sepeda
       SepedaGunung sGunung = new SepedaGunung();
       SepedaFixie sFixie = new SepedaFixie();
       SepedaTandem sTandem = new SepedaTandem();
     
       Sepeda spd = new Sepeda();
//        System.out.println("ini public : "+spd.rantai);
       sGunung.gunakanSepedaGunung("Polygon");
       sFixie.gunakanSepedaFixie("Fixion");
       sTandem.gunakanSepedaTandem("Wim Cycle"); 
    }
}
