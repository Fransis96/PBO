package hewan;

// Subclass
public class Anjing extends Hewan
{
	// Konstruktor
	public Anjing(String nama){
		super(nama);
	}
	@Override // Mengoverride metode suara kelas induk
	public void suara(){
		System.out.println("Guk...");
	}
}