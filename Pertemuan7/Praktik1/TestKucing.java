// Praktik 1
class Hewan {

	public void move() {
		System.out.println("Hewans dapat move");
	}
}

class Kucing extends Hewan {

	public void move() {
		System.out.println("Kucings dapat walk dan run");
	}
}

public class TestKucing{

	public static void main(String args[]){

		Hewan a = new Hewan();
		Hewan b = new Kucing();

		a.move();
		b.move();
	}
}