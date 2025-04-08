public class Komposisi{

	public static void main(String[] args) {
		
		// Player
		Player player1 = new Player("Thomas");
		Player player2 = new Player("Thanos");

		// Weapon
		Weapon bazoka = new Weapon("Bazoka",75.5);
		Weapon kapak = new Weapon("Kapak",45.5);

		// Armor
		Armor kaos = new Armor("Kaos",5);
		Armor zirah = new Armor("Zirah",55);

		// Melengkapi Equipment
		player1.equip(kaos,bazoka);

		// Menampilkan player
		player1.display();
	}
}