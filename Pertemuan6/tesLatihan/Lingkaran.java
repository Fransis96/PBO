class Lingkaran{

	// variabel global (atribut class)
	private final double phi;
	private double r;

	// Konstruktor default
	public Lingkaran(){
		phi = 3.14;
		r = 0.0;
	}

	// Metode setter (Mutator)
	protected void setJari(double r){ this.r = r; }
	// Metode getter (acessor)
	protected double getJari(){ return r; }
	protected double getPhi(){ return phi; }

	// Metode luas
	protected double luas(){
		return phi * getJari() * getJari();
	}
	// Metode keliling
	protected double keliling(){
		return 2 * phi * getJari();
	}
}