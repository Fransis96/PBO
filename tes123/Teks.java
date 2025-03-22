class Teks extends Colors{

	private String txt;
	private String warna;

	public Teks(){
		this.txt = "";
		this.warna = "";
	}

	public void setTxt(String txt){
		this.txt = txt;
	}
	public void setWarna(String warna){

		if(warna.equals("red")){
			this.warna = red();
		}else if(warna.equals("yellow")){
			this.warna = yellow();
		}else if(warna.equals("green")){
			this.warna = green();
		}else if(warna.equals("purple")){
			this.warna = purple();
		}else if(warna.equals("cyan")){
			this.warna = cyan();
		}else if(warna.equals("blue")){
			this.warna = blue();
		}else{
			this.warna = reset();
		}
	}
	public String getTxt(){
			return txt;
	}
	public String getWarna(){
		return warna;
	}
	public void infoWarna(){
		info();
		System.out.println();
	}
	public void show(){
		System.out.println("~".repeat(getTxt().length()));
		System.out.println(getWarna()+getTxt()+reset());
		System.out.println("~".repeat(getTxt().length()));
	}
}