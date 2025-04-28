package latihan;

public class Dosen{

	private String nama, gelar;
	private Jurusan jrs;

	public Dosen(){
		nama = "Wagito";
		gelar = "S.T., M.T.";
		jrs = new Jurusan();
	}
	public void setNama(String nama_baru){
		nama = nama_baru;
	}
	public void setGelar(String gelar_baru){
		gelar = gelar_baru;
	}
	public String getNama(){
		return nama;
	}
	public String getGelar(){
		return gelar;
	}
	public void info(){
		System.out.print("Nama Dosen: ");
		System.out.println(getNama()+" "+getGelar());
		System.out.println("Jurusan -> "+jrs.getJurusan());
	}
}