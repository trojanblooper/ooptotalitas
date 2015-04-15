import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        Character ducun = new Character();
        
        // Consumable (nama, harga, HP, MP) 
        Consumable potion = new Consumable("Potion", 30,20,0);
        Consumable ether = new Consumable("Ether", 70,0,20);
        Consumable bomb = new Consumable("Bomb",500,-200,0);
        
        // Equipment(nama, harga, ATK, VIT, INT, STR)
        Equipment sword = new Equipment("Sword", 100, 120 , 7, 0, 0);
        Equipment axe = new Equipment("Axe", 120, 130, 5, 0, 0);
        Equipment magicWand = new Equipment("Magic wand", 125, 110, 0, 5, 0);
        Equipment bow = new Equipment("Bow", 115, 120, 0, 0, 5);
        Equipment shield = new Equipment("Shield", 150, 15, 5, 0, 0);
        Equipment magicCloak = new Equipment("Magic cloak", 185, 10, 0, 5, 0);
        Equipment dragonArmor = new Equipment("Dragon armor", 200, 30, 0, 0, 9);
        
        
        potion.printDesc();
        ether.printDesc();
        bomb.printDesc();
        
        sword.printDesc();
        axe.printDesc();
        magicWand.printDesc();
        bow.printDesc();
        shield.printDesc();
        magicCloak.printDesc();
        dragonArmor.printDesc();
        
        //KARAKTER
        System.out.println("karakter ducun ini memiliki karakteristik awal : ")
        System.out.println("HP : "+ducun.getHP());
        System.out.println("MP : "+ducun.getMP());
        System.out.println("ATK : "+ducun.getATK());
        System.out.println("STR : "+ducun.getSTR());
        System.out.println("INT : "+ducun.getINT());
        System.out.println("VIT : "+ducun.getVIT());
        
        //CONSUMABLE
        System.out.println("Efek potion ke Character");
        potion.effectCharacter(ducun);
        System.out.println("HP menjadi: "+ducun.getHP());
        System.out.println("Efek ether ke Character");
        ether.effectCharacter(ducun);
        System.out.println("MP menjadi : "+ducun.getMP());
        
        //EQUIPMENT    
        System.out.println("Efek sword ke Character");
        sword.effectCharacter(ducun);
        System.out.println("ATK : "+ducun.getATK());
        System.out.println("STR : "+ducun.getSTR());
        System.out.println("INT : "+ducun.getINT());
        System.out.println("VIT : "+ducun.getVIT());
        
        System.out.println("Efek axe ke Character");
        axe.effectCharacter(ducun);
        System.out.println("ATK : "+ducun.getATK());
        System.out.println("STR : "+ducun.getSTR());
        System.out.println("INT : "+ducun.getINT());
        System.out.println("VIT : "+ducun.getVIT());
        
        System.out.println("Efek magic wand ke Character");
        magicWand.effectCharacter(ducun);
        System.out.println("ATK : "+ducun.getATK());
        System.out.println("STR : "+ducun.getSTR());
        System.out.println("INT : "+ducun.getINT());
        System.out.println("VIT : "+ducun.getVIT());
        
        System.out.println("Efek bow ke Character");
        bow.effectCharacter(ducun);
        System.out.println("ATK : "+ducun.getATK());
        System.out.println("STR : "+ducun.getSTR());
        System.out.println("INT : "+ducun.getINT());
        System.out.println("VIT : "+ducun.getVIT());
        
        System.out.println("Efek shield ke Character");
        shield.effectCharacter(ducun);
        System.out.println("ATK : "+ducun.getATK());
        System.out.println("STR : "+ducun.getSTR());
        System.out.println("INT : "+ducun.getINT());
        System.out.println("VIT : "+ducun.getVIT());
        
        System.out.println("Efek magic cloak ke Character");
        magicCloak.effectCharacter(ducun);
        System.out.println("ATK : "+ducun.getATK());
        System.out.println("STR : "+ducun.getSTR());
        System.out.println("INT : "+ducun.getINT());
        System.out.println("VIT : "+ducun.getVIT());
        
    }
    
}
