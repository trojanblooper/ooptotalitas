/* item */

public abstract class Item{
	//atribut
	private int harga;
	private String nama;
	
	//constructor
	public Item (String n,int h) {
		nama=n;
		harga = h;
	}
	
	//getter
	public int getHarga () {
		return harga;
	} 
	public String getNama () {
        return nama;
    }
	
	//setter	
	public void setHarga (int harga) {
		this.harga = harga;
	}
	public void setNama (String nama) {
        this.nama = nama;
    }

	public void printDesc(){
		System.out.println ("Harga " + nama + " ini adalah " + harga);
	}
	public abstract void effectCharacter(Character c);
}
