package youtube;

import java.util.Scanner;



/**
 *
 * @author DAN
 */
public class Pen {
    public static void main(String args[]){
        System.out.println("method Static :");
        //Jika method static maka memanggil method cukup dengan "namaClass.methodStatic"
        Apple.hitung(); //"ada yang bisa saya hitung?"
        Apple.hitung(5); //menghitung luas persegi
        Apple.hitung(10,7); //menghitung luas persegi panjang
        System.out.println("\n"); //memberikan jarak 1 baris
    
        System.out.println("method non-static : ");
        //jika method bukan static maka kita harus membuat instansiasi objek
        Apple a = new Apple();//instansiasi objek
        
        /*pemanggilan method (method static tetap bisa dijalankan 
        *lewat instansiasi objek
        */        
        a.hitung();
        a.hitung(10);
        a.hitung(8, 5);
    }        
}
