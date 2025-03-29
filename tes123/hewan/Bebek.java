package hewan;

// Subclass
public class Bebek extends Hewan
{
	// Konstruktor
	public Bebek(String nama){
		super(nama);
	}

	@Override // Mengoverride metode suara kelas induk
	public void suara(){
		System.out.println("Kwek...");
	}
}