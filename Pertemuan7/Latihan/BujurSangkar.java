/* 
    Jalankan dari program utama (Main)
    Disini hanya mendefinisikan atribut dan metode
    Tidak bisa langsung dijalankan!
*/

public class BujurSangkar{

    // Atribut sisi (variabel global)
    protected double sisi;

    // Konstruktor
    public BujurSangkar(double sisi){
        this.sisi = sisi;
    }

    // Metode menghitung luas
    public double luas(){
        return sisi*sisi;
    }
    // Metode menghitung keliling
    public double keliling(){
        return 4*sisi;
    }
    // Metode cetak
    public void cetak(){
        System.out.print("\033[7;93;1m");
        System.out.println("BUJUR SANGKAR"+"\033[0m");
        System.out.println("Luas = "+luas());
        System.out.println("Keliling = "+keliling());
    }
}