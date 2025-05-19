class Titik {
  int x;
  int y;

  public Titik() {
    x = 0;
    y = 0;
  }

  public Titik(int x1, int y1) {
    x = x1;
    y = y1;
  }

  public void info() {
    System.out.println("titik ( " + x + " , " + y + " )");
  }
}

class Garis extends Titik {
  Titik t1;
  Titik t2;

  public Garis() {
    t1 = new Titik(0, 0);
    t2 = new Titik(0, 0);
  }

  public Garis(Titik t01, Titik t02) {
    t1 = new Titik(t01.x, t01.y);
    t2 = new Titik(t02.x, t02.y);
  }

  public void info() {
    System.out.println("Garis menghubungkan");
    t1.info();
    System.out.println("dan");
    t2.info();
  }
}

public class Utama {
  public static void main(String[] args) {
    Titik titik1 = new Titik(1, 2);
    Titik titik2 = new Titik(4, 5);
    titik1.info();
    titik2.info();
    Garis g = new Garis(titik1, titik2);
    g.info();
  }
}
