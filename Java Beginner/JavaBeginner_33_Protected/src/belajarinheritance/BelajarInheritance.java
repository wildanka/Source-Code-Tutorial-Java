/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarinheritance;

import belajarinheritance.sepeda.Sepeda;
import belajarinheritance.sepeda.SepedaTandem;
import belajarinheritance.sepeda.SepedaFixie;
import belajarinheritance.sepeda.SepedaGunung;

/**
 *
 * @author DAN
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
