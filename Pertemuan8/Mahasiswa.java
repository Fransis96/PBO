public class Mahasiswa{
	
	public int Nim;
	protected String Nama;
	private String Jurusan;

	// Membuata metode dengan access modifier yang berbeda

	private int getNim(){
		return Nim;
	}
	public void setNim(int nim){
		Nim = nim;
	}
	public String getNama(){
		return Nama;
	}
	public void setNama(String nama){
		Nama = nama;
	}
	protected String getJurusan(){
		return Jurusan;
	}
	public void setJurusan(String jurursan){
		Jurusan = jurursan;
	}

	void Tampil(){
		System.out.println(getNim());
		System.out.println(getNama());
		System.out.println(getJurusan());
	}

	public static void main(String[] args) {
		
		// Membuat object
		Mahasiswa mhs1 = new Mahasiswa();

		// Mengakses method yg memiliki tipe public
		mhs1.setNama("Yudi");
		mhs1.setNim(115410025);
		mhs1.setJurusan("Teknik Informatika");

		// Mengakses method Tampil()
		mhs1.Tampil();
	}
}