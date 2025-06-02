class BujurSangkar{

	protected double sisi;

	BujurSangkar(double sisi){
		this.sisi = sisi;
	}
	double luas(){
		return sisi * sisi;
	}
	double keliling(){
		return 4*sisi;
	}

	void show(){
		System.out.println("Luas = "+luas());
		System.out.println("Keliling = "+keliling());
	}
}