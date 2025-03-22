class SetengahLingkaran extends Lingkaran {

    public SetengahLingkaran(double r) {
        super(r);
    }

    @Override
    protected double luas() {
        return 0.5 * super.luas();
    }
    @Override
    protected double keliling(){
	return phi * r + diameter();
    }
}
