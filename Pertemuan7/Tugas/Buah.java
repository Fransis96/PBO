import java.util.Random;

public class Buah{

	private String nama, warna, rasa, usia;

	public Buah(){
		this.nama  = "";
		this.usia  = "";
		this.warna = "";
		this.rasa  = "";
		System.out.print("Buah ");
	}

	public void setNama(String nama){this.nama = nama;}
	public void setWarna(String warna){this.warna = warna;}
	public void setRasa(String rasa){this.rasa = rasa;}
	public void setUsia(String usia){this.usia = usia;}

	public String getNama(){return nama;}
	public String getWarna(){return warna;}
	public String getRasa(){return rasa;}
	public String getUsia(){return usia;}

	protected int acak(){
		Random rand = new Random();
		int randomInt = rand.nextInt(100);
		return randomInt;
	}

	public void info(){
		System.out.println("Usia  : "+getUsia());
		System.out.println("Warna : "+getWarna());
		System.out.println("Rasa  : "+getRasa());
		System.out.println();
	}
}