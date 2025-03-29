package hewan;

// subclass
public class Kucing extends Hewan
{
	// Konstruktor
    public Kucing(String nama) {
        super(nama);
    }
    @Override // Mengoverride metode suara kelas induk
    public void suara() {
        System.out.println("Meawww...");
    }
}