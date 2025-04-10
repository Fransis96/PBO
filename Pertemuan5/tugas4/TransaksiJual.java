import java.util.ArrayList;

public class TransaksiJual {

    private Pembeli pembeli;
    private ArrayList<Product> produk;

    // Constructor default
    TransaksiJual() {
        pembeli = new Pembeli();
        produk = new ArrayList<>();
    }

    // Constructor dengan parameter
    TransaksiJual(Pembeli pembeli, ArrayList<Product> produk) {
        this.pembeli = pembeli;
        this.produk = produk;
        pembeli.info();
    }

    // Setter dan Getter
    public void setProduk(String nama_produk, int harga_produk) {
        produk.add(new Product(nama_produk, harga_produk));
    }
    public void setPembeli(Pembeli pembeli){
        this.pembeli = pembeli;
    }
    public Pembeli getPembeli() {
        return pembeli;
    }
    public ArrayList<Product> getProduk() {
        return produk;
    }
    // Hitung total harga
    private int hitungTotal() {
        int total = 0;
        for (Product p : produk) {
            total += p.getHarga();
        }
        return total;
    }
    public void cetak(){
        int n = 0;
        // Tampilkan produk
        System.out.println("Produk yang dibeli:");
        for (Product p : getProduk()) {
            System.out.println((++n)+". "+p.getNama()+" (Rp "+p.getHarga()+")");
        }
        System.out.println("------------------------");
        System.out.println("Total Harga = Rp "+hitungTotal());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Buat objek transaksi
        TransaksiJual transaksi = new TransaksiJual();

        // Tambahkan produk
        transaksi.setProduk("Baju", 10000);
        transaksi.setProduk("Celana", 30000);
        transaksi.setProduk("Sepatu", 50000);

        transaksi.cetak();  
    }
}