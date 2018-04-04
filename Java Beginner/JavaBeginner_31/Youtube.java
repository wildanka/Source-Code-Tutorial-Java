/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author DAN
 */
public class YouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        int tebal=3;
        int baris = 4;
        int kolom = 5;
        
        int[][][] array3Dimensi = new int[tebal][baris][kolom];
        
        System.out.println(array3Dimensi.length+" "+array3Dimensi[0].length+" "+array3Dimensi[0][0].length);
        
        for (int i = 0; i < array3Dimensi.length; i++) {
            int angka = 1;
            System.out.println("tebal (lapisan) = "+i);
            for (int j = 0; j < array3Dimensi[0].length; j++) {
                for (int k = 0; k < array3Dimensi[0][0].length; k++) {
                    array3Dimensi[i][j][k] = angka++;
                    System.out.print(array3Dimensi[i][j][k]+"\t");
                }
                System.out.println("");
            }            
            System.out.println("");
        }
    }       
}
