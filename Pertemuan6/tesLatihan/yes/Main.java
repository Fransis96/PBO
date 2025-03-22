class Lingkaran {
    protected double phi = 3.14;
    protected double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    protected double luas() {
        return phi * r * r;
    }
}

class SetengahLingkaran extends Lingkaran {
    public SetengahLingkaran(double r) {
        super(r);
    }

    @Override
    protected double luas() {
        return 0.5 * super.luas(); // Menggunakan metode dari induk
    }
}

public class Main {
    public static void main(String[] args) {
        Lingkaran a1 = new Lingkaran(5);
        Lingkaran a2 = new SetengahLingkaran(5); // Polimorfisme

        System.out.println("Luas Lingkaran: " + a1.luas());
        System.out.println("Luas Setengah Lingkaran: " + a2.luas());
    }
}
