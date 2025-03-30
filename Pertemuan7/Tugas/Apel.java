public class Apel extends Buah{

	public Apel(){
		setUsia("Matang");
		setWarna("Hijau terang");
		setRasa("Manis");
	}
	@Override
	public void info(){
		System.out.println("Apel ke-"+acak());
		super.info();
		System.out.println();
	}
}