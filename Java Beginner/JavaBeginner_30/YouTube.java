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
        int[][] matriksAngka = new int[5][5];
        
        int angka = 1;
        for (int i = 0; i < matriksAngka.length; i++) {
            for (int j = 0; j < matriksAngka[0].length; j++) {
                matriksAngka[i][j] = angka++;
                System.out.print(matriksAngka[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }    
    
}
