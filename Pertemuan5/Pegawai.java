public class Pegawai {

    private String nama;
    private String jabatan;
    private int gaji;

    public void setJabatan(String jabatan) { 
        this.jabatan = jabatan; 
    }
    public String getJabatan() { return jabatan; }
    
    public void setGaji(int gaji) { 
        this.gaji = gaji; 
    }
    public long getGaji() { return gaji; }
    
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public String getNama() { return nama; }

    public void cetakPegawai() {
        System.out.println("");
        System.out.println("Nama Pegawai: " + this.nama);
        System.out.println("Jabatan: " + this.jabatan);
        System.out.println("Gaji Pokok \t: " + this.gaji);
    }
}
