package latihan;

public class Matakuliah{

	private String kode_mk, nama_mk;
	private Dosen dosen;

	public Matakuliah(){
		kode_mk = "I41910G";
		nama_mk = "PBO";
		dosen = new Dosen();
	}

	public void setKode(String kode){
		kode_mk = kode;
	}
	public String getKode(){
		return kode_mk;
	}
	public void setNama(String nama){
		nama_mk = nama;
	}
	public String getNama(){
		return nama_mk;
	}
	public void info(){
		System.out.println();
		System.out.println("Kode Matakuliah : "+getKode());
		System.out.println("Nama Matakuliah : "+getNama());
		dosen.info();
	}
}