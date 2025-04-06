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
	public Titik(int t){
		this.x = (2*t) / (t != 0 ? t : 1);
		this.y = (2+t) - y;
		System.out.println("Konstruktor titik ke-3!");
	}
	// 4
	public Titik(Titik t1){
		this.x = t1.x + 2;
		this.y = t1.y + 2;
		System.out.println("Konstruktor titik ke-4!");
	}
	// 5
	public Titik(Titik t1, Titik t2){
		this.x = t1.x + t2.x;
		this.y = t1.y + t2.y;
		System.out.println("Konstruktor titik ke-5!");
	}

	// Metode untuk menampilkan titik koordinat
	public void show(){
		System.out.println("Titik koordinat ("+x+","+y+")");
	}
}