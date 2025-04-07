public class Lingkaran{

	private final double phi = Math.PI;
	private double r;

	public double luas(){
		return phi * r * r;
	}
	public double keliling(){
		return 2 * phi * r;
	}

	Lingkaran(){ // Konstruktor default
		this.r = 2.5;
		System.out.println("# Konstruktor default");
	}

	Lingkaran(double r){ // Konstruktor dengan 1 parameter
		this.r = r;
		System.out.println("# Konstruktor dengan 1 parameter");
	}
	Lingkaran(int r){ //  Variasi 2
		this.r = r;
		System.out.println("# Variasi ke-2 konstruktor dengan 1 parameter");
	}
	Lingkaran(Lingkaran obj){ // Variasi 3
		this.r = obj.r;
		System.out.println("# Variasi ke-3 konstruktor dengan 1 parameter");
	}

	Lingkaran(double n1, double n2){ // Konstruktor dengan 2 parameter
		this.r = n1 + n2;
		System.out.println("# Konstruktor dengan 2 parameter");
	}
	Lingkaran(int n1, int n2){ //  Variasi 2
		this.r = n1 + n2;
		System.out.println("# Variasi ke-2 konstruktor dengan 2 parameter");
	}
	Lingkaran(Lingkaran obj, Lingkaran obj2){ //  Variasi 3
		this.r = obj.r + obj2.r;
		System.out.println("# Variasi ke-3 konstruktor dengan 2 parameter");
	}
	public void show(){
		System.out.printf("Luas Lingkaran = %.2f\n", luas());
		System.out.printf("Keliling Lingkaran = %.2f\n\n", keliling());
	}

	public static void main(String[] args) {

		Lingkaran lingkaran0, lingkaran1, lingkaran2;

		lingkaran0 = new Lingkaran();
		lingkaran0.show();

		lingkaran1 = new Lingkaran(3.5);
		lingkaran1.show();

		lingkaran1 = new Lingkaran(3);
		lingkaran1.show();

		lingkaran1 = new Lingkaran(lingkaran0);
		lingkaran1.show();

		lingkaran2 = new Lingkaran(3.5, 5.5);
		lingkaran2.show();

		lingkaran2 = new Lingkaran(3, 5);
		lingkaran2.show();

		lingkaran2 = new Lingkaran(lingkaran1, lingkaran2);
		lingkaran2.show();
	}
}