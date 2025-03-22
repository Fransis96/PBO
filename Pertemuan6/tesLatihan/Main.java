public class Main{

	public static void main(String[] args){

		Lingkaran a;

        a = new Lingkaran(4);
        System.out.println("Luas Lingkaran = " + a.luas());
        System.out.println("Keliling Lingkaran = " + a.keliling());

        a = new SetengahLingkaran(4); // Polimorfis
        System.out.println("Luas Setengah Lingkaran = " + a.luas());
        System.out.println("Keliling Setengah Lingkaran = " + a.keliling());
    }
}