
class Turunan extends Induk{

	void info(){
		System.out.println("Ini kelas turunan");
	}
}

public class Main2{

	public static void main(String[] args){
		Turunan a;

		a = new Turunan(); // Polimorfis
		a.info();

		a = new Induk();
		a.info();
	}
}