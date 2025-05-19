abstract class Geometri{

	private final double PHI = Math.PI;

	public double phi(){
		return PHI;
	}
	public abstract double luas();
	public abstract String str();

	public void display(){
		if(str().equalsIgnoreCase("Persegi")){
			System.out.println("Luas Persegi = "+luas());
		}else if(str().equalsIgnoreCase("Lingkaran")){
			System.out.println("Luas Lingkaran = "+luas());
		}else{
			System.out.println("Unknown str!");
		}

	}
}