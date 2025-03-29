class BelahDiagonal extends BujurSangkar{

	// Konstruktor
	BelahDiagonal(double s){
		super(s);
	}
	@Override
	double luas(){
		return 0.5 * (s*s);
	}
	@Override
	double keliling(){
		return (2*s) + (s*Math.sqrt(2));
	}
	@Override
	public void show(){
		System.out.println("Belah Diagonal: ");
		System.out.println("Luas     = "+luas());
		System.out.println("Keliling = "+keliling());
		System.out.println();
	}
}