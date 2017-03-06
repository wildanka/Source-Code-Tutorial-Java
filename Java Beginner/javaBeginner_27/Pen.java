package youtube;


/**
 *
 * @author DAN
 */
public class Pen {
    public static void main(String args[]){
        //deklarasi variabel
        double totalUsia; 
        double rata2;        
        int usiaMin;
        
        //inisialisasi variabel
        usiaMin = 999;
        totalUsia = 0;
        
        //pembuatan array
        int usia[] = new int[5];
        
        //input elemen array
        usia[0] = 5;
        usia[1] = 17; 
        usia[2] = 25;
        usia[3] = 65;
        usia[4] = 22;        
        
        // rata = total Nilai / n (banyaknya data)
        for (int i = 0; i < usia.length; i++) {
            totalUsia = totalUsia + usia[i];
        }       
        rata2 = totalUsia / usia.length;        
        //tampilkan nilai usia rata2
        System.out.println(String.valueOf(rata2));
        
        
        //mencari nilai minimum
        for (int i = 0; i < usia.length; i++) {
            if (usia[i] < usiaMin) {
                usiaMin = usia[i];
            }
        }
        //tampilkan nilai usia minimum
        System.out.println(String.valueOf(usiaMin));
    }        
}
