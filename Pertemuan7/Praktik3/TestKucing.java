// Praktik 3

class Hewan {

	public void move() {
		System.out.println("Hewans dapat move");
	}
}

class Kucing extends Hewan {

	public void move() {
		super.move();
		System.out.println("Kucings dapat walk dan run");
	}
}

public class TestKucing{

	public static void main(String args[]){

		Hewan b = new Kucing();
		b.move();
	}
}