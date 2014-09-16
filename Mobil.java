class Mobil{
	String warna;
	int tahunproduksi;
	
	public Mobil(String warna, int tahunproduksi){
		this.warna=warna;
		this.tahunproduksi=tahunproduksi;
	}
	
	public Mobil(){
	}
	
	void info(){
	System.out.println("Warna : "+this.warna);
	System.out.println("Tahun : "+this.tahunproduksi);
	}
}