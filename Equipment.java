/* Equipment */

public class Equipment extends Item{

	//atribute
	private int atk;
	private int addVIT;
	private int addINT;
	private int addSTR;
	
	//constructor
	public Equipment(String n, int h, int atk, int addVIT, int addINT, int addSTR){
		super(n, h);
		this.atk = atk;
		this.addVIT = addVIT;
		this.addINT = addINT;
		this.addSTR = addSTR;
	}
	
	//getter
	public int getVIT () {
		return addVIT;
	}
	public int getINT () {
		return addINT;
	}
	public int getSTR () {
		return addSTR;
	}
	public int getATK () {
		return atk;
	}
	
	//setter
	public void setVIT (int addVIT) {
		this.addVIT = addVIT;
	}
	public void setINT (int addINT) {
		this.addINT = addINT;
	} 
	public void setSTR (int addSTR) {
		this.addSTR = addSTR;
	}
	public void setATK (int atk) {
		this.atk = atk;
	}

    @Override
	public void printDesc(){
		super.printDesc();
		if ((addVIT!= 0) && (addINT == 0) && (addSTR == 0)) {
			System.out.println(getNama() +" menambah VIT sebesar " + addVIT);
		}
		else if ((addVIT == 0) && (addINT != 0) && (addSTR == 0)) {
			System.out.println(getNama() +" menambah INT sebesar " + addINT);
		}
                else if ((addVIT == 0) && (addINT == 0) && (addSTR != 0)) {
			System.out.println(getNama() +" menambah STR sebesar " + addSTR);
		}
                else if ((addVIT != 0) && (addINT != 0) && (addSTR == 0)) {
			System.out.println(getNama() +" menambah VIT sebesar " + addVIT + " dan INT sebesar " + addINT);
		}
                else if ((addVIT != 0) && (addINT == 0) && (addSTR != 0)) {
			System.out.println(getNama() +" menambah VIT sebesar " + addVIT + " dan STR sebesar " + addSTR);
		}
                else if ((addVIT == 0) && (addINT != 0) && (addSTR != 0)) {
			System.out.println(getNama() +" menambah INT sebesar " + addINT + " dan STR sebesar " + addSTR);
		}
		else  {
			System.out.println(getNama() +" menambah VIT sebesar " + addVIT + ", INT sebesar " + addINT + " dan STR sebesar");
		}
	}
        
    @Override
    public void effectCharacter(Character c) {
        int w,x,y,z;
      	
      	w=c.getATK()+atk;
	        c.setATK(w);
        x=c.getVIT()+addVIT;
	        c.setVIT(x);
        y=c.getINT()+addINT;
	        c.setINT(y);
        z=c.getSTR()+addSTR;
        	c.setSTR(z);
    }
}
