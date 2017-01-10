package youtube;

/**
 *
 * @author DAN
 */

public class Apple { 
    //contoh overloading method
    public static void hitung(){
        System.out.println("Ada yang bisa saya hitung?");
    }
    
    public static void hitung(int sisi){        
        double luas = Math.pow(sisi,2);
        System.out.println("Bangun Persegi, Luasnya = "+luas);
    }
    
    public static void hitung(int panjang,int lebar){        
        double luas = panjang * lebar;
        System.out.println("Bangun Persegi Panjang, Luasnya = "+luas);
    }
    
}
