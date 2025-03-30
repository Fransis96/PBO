public class Jeruk extends Buah{

	public Jeruk(){
		setUsia("Matang");
		setWarna("Orange");
		setRasa("Manis");
	}
	@Override
	public void info(){
		System.out.println("Jeruk ke-"+acak());
		super.info();
		System.out.println();
	}
}