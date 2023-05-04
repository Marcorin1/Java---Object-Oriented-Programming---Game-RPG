package RPG.src;

import java.util.Random;

public class Regras {
	int qtdPotion = 3;
	int hp = 0;
	int atq = 0;
    int co =  0;
	public Regras(int hp, int atq) {
		super();
		this.hp = hp;
		this.atq = atq;
		this.qtdPotion = qtdPotion;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtq() {
		return atq;
	}

	public void setAtq(int atq) {
		this.atq = atq;
	}

	public void kamikaze(Regras p, Regras mob, int ataque, int dmg) {
		Random rd = new Random(); // creating Random object
		if (isDead()) {
			System.out.println("-  you died  -");
			System.out.println("-  voc� se explodiu  -");
			System.out.println("-  BANZAI  -");

		} else if (rd.nextInt(10) >= 6) {
			mob.hp -= ataque + 14;
			p.hp -= dmg + 14;
			System.out.println("-  BANZAI  -");
			System.out.println("            ____                    \r\n"
					+ "                 ____ \\__ \\\r\n"
					+ "                 \\__ \\__/ / __\r\n"
					+ "                 __/ ____ \\ \\ \\    ____\r\n"
					+ "                / __ \\__ \\ \\/ / __ \\__ \\\r\n"
					+ "           ____ \\ \\ \\__/ / __ \\/ / __/ / __\r\n"
					+ "      ____ \\__ \\ \\/ ____ \\/ / __/ / __ \\ \\ \\\r\n"
					+ "      \\__ \\__/ / __ \\__ \\__/ / __ \\ \\ \\ \\/\r\n"
					+ "      __/ ____ \\ \\ \\__/ ____ \\ \\ \\ \\/ / __\r\n"
					+ "     / __ \\__ \\ \\/ ____ \\__ \\ \\/ / __ \\/ /\r\n"
					+ "     \\ \\ \\__/ / __ \\__ \\__/ / __ \\ \\ \\__/\r\n"
					+ "      \\/ ____ \\/ / __/ ____ \\ \\ \\ \\/ ____\r\n"
					+ "         \\__ \\__/ / __ \\__ \\ \\/ / __ \\__ \\\r\n"
					+ "         __/ ____ \\ \\ \\__/ / __ \\/ / __/ / __\r\n"
					+ "        / __ \\__ \\ \\/ ____ \\/ / __/ / __ \\/ /\r\n"
					+ "        \\/ / __/ / __ \\__ \\__/ / __ \\/ / __/\r\n"
					+ "        __/ / __ \\ \\ \\__/ ____ \\ \\ \\__/ / __\r\n"
					+ "       / __ \\ \\ \\ \\/ ____ \\__ \\ \\/ ____ \\/ /\r\n"
					+ "       \\ \\ \\ \\/ / __ \\__ \\__/ / __ \\__ \\__/\r\n"
					+ "        \\/ / __ \\/ / __/ ____ \\ \\ \\__/\r\n"
					+ "           \\ \\ \\__/ / __ \\__ \\ \\/\r\n"
					+ "            \\/      \\ \\ \\__/ / __\r\n"
					+ "                     \\/ ____ \\/ /\r\n"
					+ "                        \\__ \\__/\r\n"
					+ "                        __/");
			
			

		} else {
			mob.hp -= ataque + 15;
			p.hp -= dmg;
			System.out.print("");
		}
	}

	boolean potion(Regras p, int pnt ) {
		Random rd = new Random(); // creating Random object
		
		if (this.qtdPotion == 0) {
			System.out.println("acabou suas poções");
			return false;
		}
		this.qtdPotion--;
		if (rd.nextInt(11) >= 7) {
			System.out.println("falhou em usar sua poção");
			return false;
		}

		p.hp += pnt;
	   co = 1;
		
	
		return true;

	}

	void info() {
		System.out.println("hp: " + hp);
		System.out.println("poções no inventario: " + qtdPotion);
	}

	// ataque direto
	boolean ataque(Regras p, Regras mob, int ataque, int dmg) {
		Random rd = new Random(); // creating Random object
		
		if (rd.nextInt(21) <= 5) {
			System.out.println("falhou em atacar");
			return false;
		}
		mob.hp -= ataque;
		p.hp -= dmg;
		System.out.println("");
		return true;
	}

	public void esquiva(Regras p, Regras mob, int ataque, int dmg) {
		Random rd = new Random(); // creating Random object

		if (rd.nextInt(10) >= 7) {
			mob.hp -= ataque + rd.nextInt(5);
			p.hp -= dmg - 5;
			System.out.println(" - você esquivou!!!  - ");

		} else {
			System.out.println(" você falhou ");
			mob.hp -= ataque;
			p.hp -= dmg + 2;
			System.out.print("");

		}
	}                      
	

	boolean isDead() {
		return !(this.hp > 0);
	}
	boolean alive() {
		return (this.hp > 0);
	}
 public int limpani() {
	 co = 0;
	return co;
 }
	
  public   boolean SD(Regras p, Regras mob, boolean end , String next){
	  if(p.isDead()) {
			System.out.print("               ,--.\r\n"
					+ "                          {    }\r\n"
					+ "                          K,   }\r\n"
					+ "                         /  `Y`\r\n"
					+ "                    _   /   /\r\n"
					+ "                   {_'-K.__/\r\n"
					+ "                     `/-.__L._\r\n"
					+ "                     /  ' /`\\_}\r\n"
					+ "                    /  ' /     -ART BY ZEUS-\r\n"
					+ "            ____   /  ' /\r\n"
					+ "     ,-'~~~~    ~~/  ' /_\r\n"
					+ "   ,'             ``~~~%%',\r\n"
					+ "  (                     %  Y\r\n"
					+ " {                      %% I\r\n"
					+ "{      -                 %  `.\r\n"
					+ "|       ',                %  )\r\n"
					+ "|        |   ,..__      __. Y\r\n"
					+ "|    .,_./  Y ' / ^Y   J   )|\r\n"
					+ "\\           |' /   |   |   ||\r\n"
					+ " \\          L_/    . _ (_,.'(\r\n"
					+ "  \\,   ,      ^^\"\"' / |      )\r\n"
					+ "    \\_  \\          /,L]     /\r\n"
					+ "      '-_`-,       ` `   ./`\r\n"
					+ "         `-(_            )\r\n"
					+ "             ^^\\..___,.--`");
		  System.out.println("-you died thanks for play try again-");
		  System.out.println(p.getHp() +"-digite: sim -");


		  end = true;
		  
	  }else {
		  BT(p, mob, end, co);

		
		       }
			
	return end;
	
  }
	public   boolean BT(Regras p, Regras mob, boolean end , int co){
		
		
		
		 if(p.alive()){
			 System.out.println("você esta vivo");
			
		 }
		 System.out.print(" M.HP / BARRA DE VIDA INIMIGO: ");
		 if(mob.hp >= 50) {
			 System.out.println("\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"); 
		 }
		  if(mob.hp <= 49 && mob.hp >= 36 ) {
			 System.out.println("\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n");
		 }
		 if(mob.hp <= 35 && mob.hp >= 31 ) {
			 System.out.println("\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n");
		 }
		 if(mob.hp <= 30 && mob.hp >= 21) {
			 System.out.println("\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡜⣿⣿⣿⣿⣿⣿⣿⣿\r\n");
		 }
		 if(mob.hp <= 20 && mob.hp >= 6 ) { 
			 System.out.println("\n⣿⣿⣿⣿⡜⣿⣿⣿⣿⣿⣿\r\n");
		 }
		 if(mob.hp < 5 && mob.hp >= 1) {
			 System.out.println("\n⣿⣿⡜⣿\r\n");
		 }
		 
		 else {
			 System.out.println("\n\r\n");
		 }
		 if (co == 1) {	System.out.println("usando poção");
		 
			System.out.println("");
			System.out.println(".'.         .'.\r\n" + "|  \\       /  |\r\n" + "'.  \\  |  /  .'\r\n"
					+ "  '. \\\\|// .'\r\n" + "    '-- --'\r\n" + "    .'/|\\'.\r\n" + "   '..'|'..'");
			System.out.println("");
			System.out.println("curando... ");
			System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r");
			 
			 
			 
		 }
		 
		  if(mob.alive()) {
			
				System.out.println("                             _.--\"\"-._\r\n"
						+ "  .                         .\"         \".\r\n"
						+ " / \\    ,^.         /(     Y             |      )\\\r\n"
						+ "/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )\r\n"
						+ "|        :|    `>   '.     l_..-------.._l      .'\r\n"
						+ "|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"\r\n"
						+ " \\  .-' | |  `              l._       _.'\r\n"
						+ "  \\/    | |                   l`^^'^^'j\r\n"
						+ "        | |                _   \\_____/     _\r\n"
						+ "        j |               l `--__)-'(__.--' |\r\n"
						+ "        | |               | /`---``-----'\"1 |  ,-----.\r\n"
						+ "        | |               )/  `--' '---'   \\'-'  ___  `-.\r\n"
						+ "        | |              //  `-'  '`----'  /  ,-'   I`.  \\\r\n"
						+ "      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\\r\n"
						+ "     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :\r\n"
						+ "      `._;/7(-.......'  /        ) (     |  |            | |\r\n"
						+ "      `._;l _'--------_/        )-'/     :  |___.    _._./ ;\r\n"
						+ "        | |                 .__ )-'\\  __  \\  \\  I   1   / /\r\n"
						+ "        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /\r\n");
				System.out.println("\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r");
				    
			  end = false;
			 
		  }
		if ( mob.isDead()) {
			
			System.out.println(" ");
			System.out.println(" -------------------------------------");
			System.out.println(" -------VOCÊ DERROTOU O MONSTRO-------");
			System.out.println(" -------------------------------------");
			System.out.println(" -------------------------------------");
			System.out.println(" __\r\n"
					+ "/_/\\/\\\r\n"
					+ "\\_\\  /\r\n"
					+ "/_/  \\\r\n"
					+ "\\_\\/\\ \\\r\n"
					+ "   \\_\\/");
			System.out.println(" --------- vida do monstro: 0 ----------");
			System.out.println(" -------------------------------------");
			System.out.println(" -------------------------------------");
			System.out.println(" -------------------------------------");
			end = true;
		
	
	
	
		}
		{
			limpani();
		}
		return end;
	}
	
	
	//public void score(){
		//int sco = pontos + player.hp + pnt;
		
	//Menu Explorador

public static void exibeMenuEXP() {
           System.out.print("aperte as teclas para fazer ações");
       	String menu = "\n Menu de opções: \n";
		System.out.print(menu);
	System.out.print(".-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-.\r\n"
			+ "|     ARMA PRIMARIA                  HABILIDADE                         |\r\n"
			+ "|    1- atacar com espada     2-  afiar espada                          |\r\n"
			+ "|                                                                       |\r\n"
			+ "|         ITEM 1                   ITEM 2                               |\r\n"
			+ "|    3- USAR  POTION          4- USAR BOMBA   X-------------------------|\r\n"
			+ "|                                             | Classe Explorador LV:1  |\r\n"
			+ "|             ARMA SECUNDARIA                 | (armas)espada: classica |\r\n"
			+ "|           5-   faca curta                   |   faca curta:  eldir    |\r\n"
			+ "|                                             |   Bomba de mineração    |\r\n"
			+ "|           6-       sair                     |   3 poções de cura;     |\r\n"
			+ "`-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-etf-'");

 }
//Menu Explorador

	public static void exibeMenuESP() {
             System.out.print("aperte as teclas para fazer ações");
         	String menu = "\n Menu de opções: \n";
  		

  		System.out.println(menu);
  		System.out.print((".-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-.\r\n"
  				+ "|     ARMA PRIMARIA                  HABILIDADE                         |\r\n"
  				+ "|    1- estocada dupla     2- esquivar  e contra atacar                 |\r\n"
  				+ "|                                                                       |\r\n"
  				+ "|         ITEM 1                   ITEM 2                               |\r\n"
  				+ "|    3- USAR  POTION          4- jogar areia  X-------------------------|\r\n"
  				+ "|                                             | Classe Explorador LV:1  |\r\n"
  				+ "|             ARMA SECUNDARIA                 | (armas)espada: ariete |\r\n"
  				+ "|           5- chute/ataque marcial           |   faca curta:  eldir    |\r\n"
  				+ "|                                             |   Bomba de mineração    |\r\n"
  				+ "|           6-       sair                     |   3 poções de cura;     |\r\n"
  				+ "`-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-etf-'"));


	}
	
	public static void exibeMenuPAL() {
        System.out.print("aperte as teclas para fazer ações");
    	String menu = "\n Menu de opções: \n";
		

		System.out.println(menu);
		System.out.print((".-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-.\r\n"
				+ "|     ARMA PRIMARIA                  HABILIDADE                         |\r\n"
				+ "|    1- estocada dupla     2- esquivar  e contra atacar                 |\r\n"
				+ "|                                                                       |\r\n"
				+ "|         ITEM 1                   ITEM 2                               |\r\n"
				+ "|    3- USAR  POTION          4- jogar areia  X-------------------------|\r\n"
				+ "|                                             | Classe Explorador LV:1  |\r\n"
				+ "|             ARMA SECUNDARIA                 | (armas)espada: classica |\r\n"
				+ "|           5- chute/ataque marcial           |   faca curta:  eldir    |\r\n"
				+ "|                                             |   Bomba de mineração    |\r\n"
				+ "|           6-       sair                     |   3 poções de cura;     |\r\n"
				+ "`-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-etf-'"));


}
}

