import java.util.Scanner;

public class Utama{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		Teks teks = new Teks();

		System.out.print("Input teks  : ");
		teks.setTxt(in.nextLine());

		// Menampilkan informasi warna
		teks.infoWarna();

		System.out.print("Input warna : ");
		teks.setWarna(in.nextLine());

		teks.show();
	}
}