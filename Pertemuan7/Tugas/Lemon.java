public class Lemon extends Buah{

	public Lemon(){
		setUsia("Matang");
		setWarna("Kuning pudar");
		setRasa("Asam");
	}
	@Override
	public void info(){
		System.out.println("Lemon ke-"+acak());
		super.info();
		System.out.println();
	}
}