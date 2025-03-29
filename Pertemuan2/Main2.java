public class Main2{

	public static void main(String[] args) {

		Lingkaran[] a;
		a = new Lingkaran[5];

		for(int i = 0; i < 5; i++){
			a[i] = new Lingkaran();
			a[i].setJari(i*10);
		}

		for(int i = 0; i < 5; i++){
			a[i].tampil();
		}
	}
}