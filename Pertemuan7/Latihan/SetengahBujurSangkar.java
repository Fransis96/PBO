/* 
	Jalankan dari program utama (Main)
	Tidak dapat dijalankan dari sini
*/


// Kelas Turunan dari BujurSangkar
public class SetengahBujurSangkar extends BujurSangkar{
	
	public SetengahBujurSangkar(double sisi){
		super(sisi);
	}

	@Override
	public double luas(){
		return 0.5 * sisi * sisi;
	}

	@Override
	public double keliling(){
		return 2 * sisi;
	}

	@Override
	public void cetak(){
		System.out.print("\033[7;93;1m");
		System.out.println("SETENGAH BUJUR SANGKAR"+"\033[0m");
        System.out.println("Setengah Luas = "+luas());
        System.out.println("Setengah Keliling = "+keliling());
    }
}