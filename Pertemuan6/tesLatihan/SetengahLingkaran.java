class StengahLingkaran extends Lingkaran{

	Lingkaran circle;

	public StengahLingkaran(Lingkaran circle){
		this.circle = circle;
	}
	double setengahLuas(){
		return 0.5 * circle.getPhi() * circle.getJari() * circle.getJari();
	}
	double setengahKeliling(){
		return circle.getPhi() * circle.getJari() + 2 * circle.getJari();
	}
}