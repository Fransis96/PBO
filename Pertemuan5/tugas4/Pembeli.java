public class Pembeli{

	private String nama = "Fransis";

	public Pembeli(){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Nama Pembeli : "+nama);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public Pembeli(String nama){
		this.nama = nama;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}
	public void info(){
		System.out.println("------------------------");
		System.out.println("Nama Pembeli : "+getNama());
		System.out.println("------------------------");
	}
}