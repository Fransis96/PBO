public class Product{
	
	private String nama;
	private int harga;

	public Product(){
		this("Pensil",3500);
	}
	public Product(String nama, int harga){
		this.nama = nama;
		this.harga = harga;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}
	public void setHarga(int harga){
		this.harga = harga;
	}
	public int getHarga(){
		return harga;
	}
}