package RPG.src;

import java.util.Random;

public class Explorador  extends Regras{

	public Explorador(int hp, int atq) {
		super(hp, atq);
		// TODO Auto-generated constructor stub
	}
	public int EXafiar(Regras p, Regras mob, int ataque, int dmg) {
		Random rd = new Random(); // creating Random object
		
		if (rd.nextInt(21) <= 3) {
			System.out.println("falhou em afiar a espada");
			
		}else if(rd.nextInt(21) >= 5){
		mob.hp -= ataque + rd.nextInt(4);
		p.hp -= dmg ;
		System.out.println("");
		
		
		}
		return ataque + 25;
		
	}


boolean EXatacar(Regras p, Regras mob, int ataque, int dmg) {
	Random rd = new Random(); // creating Random object
	
	if (rd.nextInt(21) <= 5) {
		System.out.println("falhou em atacar ");
		return false;
	}
	int hit =  rd.nextInt(15)+ rd.nextInt(15);
	mob.hp -= ataque +  hit ;
	p.hp -= dmg ;
	System.out.println("dano aplicado  " + hit);

	return true;
}
 
}
