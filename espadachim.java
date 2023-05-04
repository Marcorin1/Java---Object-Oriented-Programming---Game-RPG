package RPG.src;

import java.util.Random;

public class espadachim  extends Regras{

	public espadachim(int hp, int atq) {
		super(hp, atq);
		// TODO Auto-generated constructor stub
	}

	
	public void esquivafrontal(Regras p, Regras mob, int ataque, int dmg) {
		Random rd = new Random(); // creating Random object
		if (p.hp == 0) {
			System.out.println("-  you died  -");

		} else if (rd.nextInt(20) >= 7) {
			mob.hp -= ataque + rd.nextInt(6);
			p.hp -= dmg - 5;
			System.out.println(" - voc� esquivou!!!");

		} else {
			mob.hp -= ataque;
			p.hp -= dmg + 3;
			System.out.print("");

		} 
		
		
		
	}
	
	
	
		public void stab(Regras p, Regras mob, int ataque, int dmg) {
			Random rd = new Random(); // creating Random object
			if (p.hp == 0) {
				System.out.println("-  you died  -");
				
			 }else if (mob.hp <= 5 ) {
				mob.hp -= ataque + 20;

			} else if (rd.nextInt(17) >= 7) {
				mob.hp -= ataque + rd.nextInt(6);
				p.hp -= dmg - 5;
				System.out.println(" - voc� esquivou!!!");

			} else {
				mob.hp -= ataque;
				p.hp -= dmg;
				System.out.print("");

			}
		
		
  }




public void host(Regras p, Regras mob, int ataque, int dmg) {
	Random rd = new Random(); // creating Random object
	if (p.hp == 0) {
		System.out.println("-  you died  -");
		

	} else if (rd.nextInt(17) >= 7) {
		mob.hp -= ataque + rd.nextInt(6);
		p.hp += dmg  ;
		System.out.println(" - voc� esquivou!!!");

	} else {
		mob.hp -= ataque;
		p.hp -= dmg;
		System.out.print("");

	}


}
}