package youtube;



/**
 *
 * @author DAN
 */
public class Pen {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); //memanggil objek Scanner untuk input
		String nama = input.nextLine(); //memasukkan hasil inputan kedalam variabel nama
		
		//method Apple.b menggunakan parameter input (yaitu: "nama")
		//method static bisa dippanggil langsung tanpa instansiasi objek(tidak seperti yang dibawah)
        Apple.b(nama); 
        
        Apple apel = new Apple(); //instansiasi objek
		apel.a(); //method non-static membutuhkan instansiasi objek
        
    }        
}
