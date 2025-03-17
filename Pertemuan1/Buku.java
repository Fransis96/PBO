public class Buku{

	private String judul;

	// Metode setter (Mutator)
	public void setJudul(String judul){
		this.judul = judul;
	}

	// Metode getter (Accessor)
	public String getJudul(){
		return judul;
	}

	// Menampilkan info buku;
	public void display(){
		System.out.println("Judul buku : "+getJudul());
	}
}
