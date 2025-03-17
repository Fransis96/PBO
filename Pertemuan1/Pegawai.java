public class Pegawai{
	String namaPegawai;
	int idPegawai;
	String posisiPegawai;

	Pegawai(String nama, int id, String posisi){
		this.namaPegawai = nama;
		this.idPegawai = id;
		this.posisiPegawai = posisi;
	}
	Pegawai(){
		namaPegawai = "Azkiya";
		idPegawai = 2514;
		posisiPegawai = "Staff Pengajar";
	}
	void show(){
		System.out.println("Informasi Pegawai");
		System.out.println("Nama   : "+namaPegawai);
		System.out.println("Id     : "+idPegawai);
		System.out.println("Posisi : "+posisiPegawai);
	}

	public static void main(String[] args) {
		Pegawai pegawai1 = new Pegawai();
		Pegawai pegawai2 = new Pegawai("Zahwa",331,"Staff Akademik");

		pegawai1.show();
		pegawai2.show();
	}
}