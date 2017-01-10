package youtube;

/**
 *
 * @author HP
 */
public class Manusia {
    private String nama;
    private int umur;
    
    public Manusia(String namaOrang, int umurOrang){
        nama = namaOrang;
        umur = umurOrang;
    }
    
    public void perkenalan(){
        System.out.println("Hai, Nama saya : "+nama+", Umur saya : "+umur);
    }
    
}
