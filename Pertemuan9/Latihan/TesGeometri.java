class Persegi extends Geometri{

	private double s;

	public Persegi(double s){
		this.s = s;
	}
	public double luas(){
		return s*s;
	}
	public String str(){
		return "Persegi";
	}
}

class Lingkaran extends Geometri{

	private double r;

	public Lingkaran(double r){
		this.r = r;
	}
	public double luas(){
		return phi()*r*r;
	}
	public String str(){
		return "Lingkaran";
	}
}

public class TesGeometri{

	public static void main(String[] args){
		Geometri g;

		g = new Persegi(5.5);
		g.display();

		g = new Lingkaran(5.5);
		g.display();
	}
}