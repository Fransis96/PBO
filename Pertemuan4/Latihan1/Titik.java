// Praktik 1. Membuat konstruktor
public class Titik{

	int x;
	int y;

	public Titik() {
		System.out.println("Konstruktor titik dijalankan!");
	}

	// Praktik 3
	// Tambahkan konstruktor baru pada class Titik
	public Titik (int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Konstruktor titik 2 dijalankan!");
	}

	// Contoh Latihan 1
	// 3
	public Titik(int x){
		this.x = 1+x;
		this.y = 2+x;
		System.out.println("Konstruktor titik ke-3!");
	}
	// 4
	public Titik(double x){
		this.x = (int) Math.round(x + 1.5);
		this.y = (int) Math.round(x + 2.5);
		System.out.println("Konstruktor titik ke-4!");
	}
	// 5
	public Titik(Titik t1){
		this.x = t1.x;
		this.y = t1.y;
		System.out.println("Konstruktor titik ke-5!");
	}
}