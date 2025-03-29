import hewan.*;

//  Class Utama
public class Utama2{

	public static void main(String args[]){
		Hewan a;

		a = new Kucing("Kucing"); // Polimorfisme
		a.suara();

		a = new Anjing("Anjing"); // Polimorfisme
		a.suara();

		a = new Bebek("Bebek");   // Polimorfisme
		a.suara();
	}
}