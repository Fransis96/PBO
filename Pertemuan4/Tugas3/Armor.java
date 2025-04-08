public class Armor{
	
	private String name = "Unknow";
	private double deff = 0;

	public Armor(String name){
		this.name = name;
	}
	public Armor(double deff){
		this.deff = deff;
	}
	public Armor(String name, double deff){
		this.name = name;
		this.deff = deff;
	}
	public Armor(double deff, String name){
		this.deff = deff;
		this.name = name;
	}

	public String getName(){
		return name;
	}
	public double getDeff(){
		return deff;
	}
}