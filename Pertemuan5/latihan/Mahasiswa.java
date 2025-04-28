package latihan;

public class Mahasiswa{
	private String nama, nim;
	private Jurusan jrs;
	private Matakuliah[] mk;

	public Mahasiswa(){
		nama = "Fransis";
		nim = "10072";
		jrs = new Jurusan();
		mk = new Matakuliah[2];
	}
	public void setNama(String nama_baru){
		nama = nama_baru;
	}
	public String getNama(){ 
		return nama; 
	}
	public void setNim(String nim_baru){
		nim = nim_baru;
	}
	public String getNim(){ 
		return nim; 
	}
	public void defaultMK(){
		for(int i = 0; i<mk.length; i++){
			mk[i] = new Matakuliah();
		}
		// mk untuk indeks ke-1 hanya mengganti kode dan nama matkul
		mk[1].setKode("I41910P");
		mk[1].setNama("Praktikum PBO");

		// bisa tambahkan ke-n dengan info lainnya
	}
	public void info(){
		System.out.println("Nama  : "+getNama());
		System.out.println("NIM   : "+getNim());
		jrs.info();
		try{
			defaultMK();
			for(int i = 0; i<mk.length; i++) mk[i].info();
		}catch(Exception e){
			System.out.println("Matakuliah belum diset!");
		}
	}
}