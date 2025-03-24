public class Tugas{

	// Overload main method
	public static void main(){
		System.out.println("Tanpa parameter\n");
	}
	// Overload main method
	public static void main(char[] args){

		for(int arg : args){
			System.out.println(arg+". Dengan 1 parameter array char");
		}

	}
	// Main method
	public static void main(String[] args){

		char[] arg = { 1, 2, 3 };

		System.out.println("----------------------------");
		System.out.println("Metode main pada kelas Tugas");
		System.out.println("----------------------------");
		Tugas.main();
		Tugas.main(arg);

		System.out.println("-----------------------------");
		System.out.println("Metode data pada kelas Tugas1");
		System.out.println("-----------------------------");
		Tugas1.data();
		Tugas1.data("Fransis");

		System.out.println("-------------------------------------");
		System.out.println("Metode hitungMundur pada kelas Tugas2");
		System.out.println("-------------------------------------");
		Tugas2.hitungMundur();
		Tugas2.hitungMundur(3);
	}
}