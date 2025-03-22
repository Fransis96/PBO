class Lingkaran {

    protected double phi = 3.14;
    protected double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    protected double luas() {
        return phi * r * r;
    }

    protected double keliling(){
		return 2 * phi * r;
	}
	protected double diameter(){
		return 2 * r;
	}
}
