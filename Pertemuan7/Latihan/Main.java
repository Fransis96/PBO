public class Main{
	
	public static void main(String[] args) {
		BujurSangkar bs;

		bs = new BujurSangkar(5.0);
		bs.cetak();

		bs = new SetengahBujurSangkar(5.0); // Polimorfisme
		bs.cetak(); 
	}
}