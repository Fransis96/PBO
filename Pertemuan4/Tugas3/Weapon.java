public class Weapon{

	private String name;
	private double power;

	public Weapon(){
		this("Unknow",0.0);
	}
	public Weapon(String name){
		this(name,0.0);
	}
	public Weapon(double power){
		this("Unknow",power);
	}
	public Weapon(String name, double power){
		this.name = name;
		this.power = power;
	}
	public Weapon(double power, String name){
		this.power = power;
		this.name = name;
	}

	public String getName(){
		return name;
	}
	public double getPower(){
		return power;
	}
}