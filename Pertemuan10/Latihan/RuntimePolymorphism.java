class BujurSangkar{

	private double sisi;

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

class SetengahBujurSangkar extends BujurSangkar{

	private double s;

	SetengahBujurSangkar(double s){
		super(s);
	}
	double luas(){
		return 0.5 * s * s;
	}
	double keliling(){
		return 2 * (s + s/2);
	}
}

public class RuntimePolymorphism{

	public static void main(String[] args){
		SetengahBujurSangkar bs = new SetengahBujurSangkar(5);
		BujurSangkar bj = new BujurSangkar(5.5);
	}
}