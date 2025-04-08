public class Player{

	private String nama = "Unknow";
	private double hp = 10.0;
	private double power = 5.0;
	private int level = 1;

	// Objek
	private Weapon weapon;
	private Armor armor;

	// Overload Konstruktor
	public Player(String nama){
		this.nama = nama;
	}
	public Player(double hp){
		this.hp = hp;
	}
	public Player(int level){
		this.level = level;
	}
	public Player(String nama, double hp){
		this.nama = nama;
		this.hp = hp;
	}
	public Player(double hp, String nama){
		this.hp = hp;
		this.nama = nama;
	}
	public Player(String nama, double hp, int level){
		this.nama = nama;
		this.hp = hp;
		this.level = level;
	}

	// Overload metode equip
	public void equip(Armor armor){
		this.armor = armor;
	}
	public void equip(Weapon weapon){
		this.weapon = weapon;
	}
	public void equip(Armor armor, Weapon weapon){
		this.armor = armor;
		this.weapon = weapon;
	}
	public void equip(Weapon weapon, Armor armor){
		this.weapon = weapon;
		this.armor = armor;
	}

	public void display(){

		System.out.println("Nama   : " + nama);
		System.out.println("Level  : " + level);
		showHealth();
		showDamage();
		System.out.println("Equipment:");
		cekArmor();
		cekWeapon();
		
		System.out.println();
	}
	private void cekArmor(){
		// Armor check
		if (armor != null && armor.getName() != null) {
			System.out.println("Armor -> " + armor.getName());
		} else if (armor != null && armor.getDeff() != 0) {
			System.out.println("Unknown Armor");
		} else {
			System.out.println("Tidak equip Armor!");
		}
	}
	private void cekWeapon(){
		// Weapon check
		if (weapon != null && weapon.getName() != null) {
			System.out.println("Weapon -> " + weapon.getName());
		} else if (weapon != null && weapon.getPower() != 0) {
			System.out.println("Unknown Weapon");
		} else {
			System.out.println("Tidak equip Weapon!");
		}
	}
	private void showHealth() {
		if (armor != null && armor.getDeff() != 0) {
			System.out.println("Health : " + (hp + armor.getDeff()));
		} else {
			System.out.println("Health : " + hp);
		}
	}
	private void showDamage() {
		if (weapon != null && weapon.getPower() != 0) {
			System.out.println("Damage : " + (power + weapon.getPower()));
		} else {
			System.out.println("Damage : " + power);
		}
	}
}