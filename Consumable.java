/* consumable */

public class Consumable extends Item{
	//atribute
	private int addhp;
	private int addmp;
	private int stock;
	
	//constructor
	public Consumable(String n,int h, int hp, int mp){
		super(n,h);
		addhp=hp;
		addmp=mp;
		stock = 0;
	}
	
	//getter
	public int getHP () {
		return addhp;
	}
	public int getMP () {
		return addmp;
	}
	public int getStock () {
		return stock;
	}
	
	//setter
	public void setHP (int hp) {
		addhp = hp;
	}
	public void setMP (int mp) {
		addmp = mp;
	} 
	public void setStock (int s) {
		stock = s;
	}
	
	@Override
	public void printDesc(){
		super.printDesc();
		if ((addhp != 0) && (addmp == 0)) {
			System.out.println(getNama() +" menambah HP sebesar " + addhp);
		}
		else if ((addhp == 0) && (addmp != 0)) {
			System.out.println(getNama() +" menambah MP sebesar " + addmp);
		}
		else  {
			System.out.println(getNama() +" menambah HP sebesar " + addhp + " dan MP sebesar " + addmp);
		}
	}

    @Override
    public void effectCharacter(Character c){
        int x,y;
	x=c.getHP()+addhp;
	c.setHP(x);
        y=c.getMP()+addmp;
	c.setMP(y);
    }

  

    
		
}
