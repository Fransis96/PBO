public class Master{

	private static double n = 5.5;

	public static void main(String[] args){

		BujurSangkar bs; // Deklarasi variabel referensi BujurSangkar

		bs = new BujurSangkar(n); // Membuat objek BujurSarkar dari variabel referensi BujurSangkar
		bs.show();

		bs = new BelahDiagonal(n); // Membuat objek BelahDiagonal dari variabel referensi BujurSangkar
		bs.show(); // Polimorfisme

		bs = new BelahTengah(n); // Membuat objek BelahTengah dari variabel referensi BujurSangkar
		bs.show(); // Polimorfisme
	}
}