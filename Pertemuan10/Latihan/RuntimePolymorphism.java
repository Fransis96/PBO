class SetengahBujurSangkar extends BujurSangkar{

	SetengahBujurSangkar(double sisi){
		super(sisi);
	}
	double luas(){
		return 0.5 * sisi * sisi;
	}
	double keliling(){
		return 2 * (sisi + sisi/2);
	}
	void show(){
		System.out.println("Setengah Luas = "+luas());
		System.out.println("Setengah Keliling = "+keliling());
	}
}

public class RuntimePolymorphism{

	public static void main(String[] args){
		BujurSangkar bs;

		bs = new BujurSangkar(5.5);
		bs.show();

		bs = new SetengahBujurSangkar(3.5);
		bs.show();
	}
}