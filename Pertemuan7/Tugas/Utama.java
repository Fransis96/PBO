public class Utama{

	public static void main(String[] args){
		Buah buah; // variabel buah dengan referensi induk bertipe Buah;

		buah = new Apel(); // Polimorfisme
		buah.info();

		buah = new Jeruk(); // Polimorfisme
		buah.info();

		buah = new Lemon(); // Polimorfisme
		buah.info();
	}
}