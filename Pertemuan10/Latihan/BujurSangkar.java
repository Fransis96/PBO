public class BujurSangkar{

	private double sisi;

	BujurSangkar(double sisi){

	}
	double luas(){
		return sisi * sisi;
	}
	double keliling(){
		return 4*sisi;
	}
}

public class SetengahBujurSangkar extends BujurSangkar{

	private double s;

	SetengahBujurSangkar(double s){
		super(s);
	}
	double luas(){
		return 0.5 * sisi * sisi;
	}
	double keliling(){
		return 2 * (s + s/2);
	}
}