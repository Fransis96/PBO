// Praktik 1. Membuat konstruktor
public class Garis{

	Titik t1, t2;

	public Garis(Titik t1, Titik t2) {
		this.t1 = t1;
		this.t2 = t2;
		System.out.println("Konstruktor Garis dijalankan!");
	}
	// Mencari gradien
	public int gradien(){
		if(t2.x - t1.x == 0){
			throw new ArithmeticException("Ada kesalahan!");
		}
		return (t2.y - t1.y) / (t2.x - t1.x);
	}
	// Metode show
	public void show(){
		System.out.println("---------------------------------");
		System.out.print("# Awal  "); t1.show();
		System.out.print("# Akhir "); t2.show();
		System.out.println("Kemiringan garis (Gradien): "+gradien());
		System.out.println("---------------------------------");
	}
	// Metode utama (main method)
	public static void main(String[] args) {

		Titik titik1 = new Titik(5, 10);
        Titik titik2 = new Titik(15, 30);

        Garis garis1 = new Garis(titik1, titik2);

        garis1.show();
	}
}