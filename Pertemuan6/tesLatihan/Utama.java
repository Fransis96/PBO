public class Utama{

	public static void main(String[] args) {

		Lingkaran c = new Lingkaran();
		c.setJari(5.0);

		StengahLingkaran stl;
		stl = new StengahLingkaran(c);

		System.out.println("=== Lingkaran ====");
		System.out.println("Luas     = "+c.luas());
		System.out.println("Keliling = "+c.keliling());

		System.out.println("\n=== Setengah lingkaran ====");
		System.out.println("Setengah luas     = "+stl.setengahLuas());
		System.out.println("Setengah keliling = "+stl.setengahKeliling());
    }
}