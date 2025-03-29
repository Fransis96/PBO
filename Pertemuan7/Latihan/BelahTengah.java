class BelahTengah extends BujurSangkar{

	// Konstruktor
	BelahTengah(double s){
		super(s);
	}
	@Override
	double luas(){
		return (s*s) / 2;
	}
	@Override
	double keliling(){
		return 3 * s;
	}
	@Override
	public void show(){
		System.out.println("Belah Tengah :");
		System.out.println("Luas     = "+luas());
		System.out.println("Keliling = "+keliling());
		System.out.println();
	}
}