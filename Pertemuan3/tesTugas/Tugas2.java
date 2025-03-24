class Tugas2{

	public static void hitungMundur(){
		for(int i = 1; i<=4; i++){ // Forloop
			System.out.println(i+". Tanpa parameter");
		}
		System.out.println();
	}
	public static void hitungMundur(int n){

		if(n == 0) return; // Membatasi pemanggilan;

		System.out.println(n+". Dengan satu parameter");
		hitungMundur(n - 1);
	}
}