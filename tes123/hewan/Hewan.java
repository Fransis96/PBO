package hewan;

// Superclass
public class Hewan
{
	// Konstruktor
    public Hewan(String namaHewan) {
        System.out.print("Suara " + namaHewan + " : ");
    }
    // Metode yang akan di overriding
    public void suara() {
        System.out.println("Suara hewan");
    }
}
