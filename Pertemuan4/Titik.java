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

} 