package latihan;

public class Jurusan{

	private String nama_jurusan;

	public Jurusan(){
		nama_jurusan = "Informatika";
	}

	public void setJurusan(String nama){
		nama_jurusan = nama;
	}
	public String getJurusan(){
		return nama_jurusan;
	}

	public void info(){
		System.out.println("Jurusan: "+getJurusan());
	}
}