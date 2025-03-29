class BujurSangkar{

	protected double s;

	// Konstruktor
	BujurSangkar(double s){
		this.s = s;
	}
	double luas(){
		return s * s;
	}
	double keliling(){
		return 4 * s;
	}
	public void show(){
		System.out.println("Bujur Sangkar : ");
		System.out.println("Luas     = "+luas());
		System.out.println("Keliling = "+keliling());
		System.out.println();
	}
}