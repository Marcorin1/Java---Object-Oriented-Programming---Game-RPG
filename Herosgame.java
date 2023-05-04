package RPG.src;

import java.util.Random;
import java.util.Scanner;

public class Herosgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Random rd = new Random(); // creating Random object
	    int d = 0;
	    int arranhar = 0;
	    int pnt = 0;
		int hp = 50;
		int mhp = 50;
		int contp = 0;
		int c,cc ,ccc,cccc;
		int chose;
		int op;
		boolean  end = true;
		String b;
        String next = null;
		Regras player = new Regras(hp, d);
		Explorador playerex = new Explorador(hp,d);
		Regras monstro = new Regras(mhp, arranhar);
		 System.out.println("\n>< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< ><");
		 System.out.println("\n __| |____________________________________________| |__\r\n"
		 		+ "(__   ____________________________________________   __)\r\n"
		 		+ "   | |                                            | |\r\n"
		 		+ "   | |                                            | |\r\n"
		 		+ "   | |                                            | |\r\n"
		 		+ "   | |              CASTLE QUEST                  | |\r\n"
		 		+ "   | |                                            | |\r\n"
		 		+ "   | |                                            | |\r\n"
		 		+ " __| |____________________________________________| |__\r\n"
		 		+ "(__   ____________________________________________   __)\r\n"
		 		+ "   | |                                            | |");
		 System.out.println("\n>< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< ><");
		 System.out.println("\n");
		 System.out.println("Bem vindo ao jogo, suas teclas de ação são 1,2,3,4,5,6 ");
		 System.out.println("\n");
		 System.out.println(" 1 para digitar sim ");
		 System.out.println("2 para digitar não ");
		 System.out.println("\n");
		 System.out.println("\n");
		 System.out.println("escolha sua classe");
		 System.out.println("");
		 System.out.println("Para jogar com a classe  escolhida digite a letra do inicio  da info");
		 System.out.println("DIGITO '1' Classe: Explorador, ' o explorador contem uma espada classica, faca de eldir, bomba de mineração; resumo da classe:  "
		 		+ " uma classe para jogadores iniciantes com sede de vitoria um grande explorador sabe quando deve se arriscar, sua chance de vitoria é pode aumentar quando "
		 		+ " quando estiver perdendo e decidir usar a bomba porém cuidado ela vai pode tanto derrotar como acabar explodindo você   "
		 		+ " Nivel de experiencia da classe media com grande chances de empatar o combate");
		  System.out.println("\n>< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< ><");
			 System.out.println("DIGITO '2' Classe: Espadachim, ' o espadachim contem uma espada ariete , joelherias marciais,além de pó de distração; resumo da classe:  "
				 		+ " uma classe para jogadores intermediarios o espadachim é um grande duelista de mão cheia utiliza de artes do duelo para ter vantagem no combate "
				 		+ " Nivel de experiencia da classe media com grande chances de empatar o combate");
				  System.out.println("\n>< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< ><");
		 System.out.println("");
		 chose = entrada.nextInt();
		 System.out.println("aperte qualquer tecla citada acima para proseguir a historia ou começar o jogo ");
		  cc = entrada.nextInt();
		  System.out.println("\n");
		  System.out.println("\n>< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< >< ><");
		System.out.println("Era uma vez um reino bem distante ques estava passando por serios problemas");
		 System.out.println("\n");
	     c = entrada.nextInt();
	     
         System.out.println("                        ____                                         \r\n"
         		+ "                              .-\"    `-.      ,                               \r\n"
         		+ "                            .'          '.   /j\\                              \r\n"
         		+ "                           /              \\,/:/#\\                /\\           \r\n"
         		+ "                          ;              ,//' '/#\\              //#\\          \r\n"
         		+ "                          |             /' :   '/#\\            /  /#\\         \r\n"
         		+ "                          :         ,  /' /'    '/#\\__..--\"\"\"\"/    /#\\__      \r\n"
         		+ "                           \\       /'\\'-._:__    '/#\\        ;      /#, \"\"\"---\r\n"
         		+ "                            `-.   / ;#\\']\" ; \"\"\"--./#J       ':____...!       \r\n"
         		+ "                               `-/   /#\\  J  [;[;[;Y]         |      ;        \r\n"
         		+ "\"\"\"\"\"\"---....             __.--\"/    '/#\\ ;   \" \"  |     !    |   #! |        \r\n"
         		+ "             \"\"--.. _.--\"\"     /      ,/#\\'-..____.;_,   |    |   '  |        \r\n"
         		+ "                   \"-.        :_....___,/#} \"####\" | '_.-\",   | #['  |        \r\n"
         		+ "                      '-._      |[;[;[;[;|         |.;'  /;\\  |      |        \r\n"
         		+ "                      ,   `-.   |        :     _   .;'    /;\\ |   #\" |        \r\n"
         		+ "                      !      `._:      _  ;   ##' .;'      /;\\|  _,  |        \r\n"
         		+ "                     .#\\\"\"\"---..._    ';, |      .;{___     /;\\  ]#' |__....--\r\n"
         		+ "          .--.      ;'/#\\         \\    ]! |       \"| , \"\"\"--./_J    /         \r\n"
         		+ "         /  '%;    /  '/#\\         \\   !' :        |!# #! #! #|    :`.__      \r\n"
         		+ "        i__..'%] _:_   ;##J         \\      :\"#...._!   '  \"  \"|__  |    `--.._\r\n"
         		+ "         | .--\"\"\" !|\"\"\"\"  |\"\"\"----...J     | '##\"\" `-._       |  \"\"\"---.._    \r\n"
         		+ "     ____: |      #|      |         #|     |          \"]      ;   ___...-\"T,  \r\n"
         		+ "    /   :  :      !|      |   _______!_    |           |__..--;\"\"\"     ,;MM;  \r\n"
         		+ "   :____| :    .-.#|      |  /\\      /#\\   |          /'               ''MM;  \r\n"
         		+ "    |\"\"\": |   /   \\|   .----+  ;      /#\\  :___..--\"\";                  ,'MM; \r\n"
         		+ "   _Y--:  |  ;     ;.-'      ;  \\______/#: /         ;                  ''MM; \r\n"
         		+ "  /    |  | ;_______;     ____!  |\"##\"\"\"MM!         ;                    ,'MM;\r\n"
         		+ " !_____|  |  |\"#\"#\"|____.'\"\"##\"  |       :         ;                     ''MM  \r\n"
         		+ "  | \"\"\"\"--!._|     |##\"\"         !       !         :____.....-------\"\"\"\"\"\" |'\r\n"
         		+ "  |          :     |______                        ___!_ \"#\"\"#\"\"#\"\"\"#\"\"\"#\"\"\"|  \r\n"
         		+ "__|          ;     |MM\"MM\"\"\"\"\"---..._______...--\"\"MM\"MM]                   |   \r\n"
         		+ "  \"\\-.      :      |#                                  :                   |  \r\n"
         		+ "    /#'.    |      /##,                                !                   |  \r\n"
         		+ "   .',/'\\   |       #:#,                                ;       .==.       |  \r\n"
         		+ "  /\"\\'#\"\\',.|       ##;#,                               !     ,'||||',     |  \r\n"
         		+ "        /;/`:       ######,          ____             _ :     M||||||M     |  \r\n"
         		+ "       ###          /;\"\\.__\"-._   \"\"\"                   |===..M!!!!!!M_____|  \r\n"
         		+ "                           `--..`--.._____             _!_                    \r\n"
         		+ "                                          `--...____,=\"_.'`-.____        fsc");
         System.out.println("\n");
         System.out.println("Este Reino esta tendo serios problemas a noite uma orda de esqueletos ataca ");  
         System.out.println("\n");
         
         System.out.println("Você aventureiro estara responsavel para cuidar do portão a noite, não tem escolha");
         ccc = entrada.nextInt();
         System.out.println("\n");
         System.out.println("\n");
         System.out.println("AH NÃO UM ESQUELETO");
         System.out.println("\n");
         System.out.println("\n");
         System.out.println("\n");
         System.out.println("\n");
         
         cccc = entrada.nextInt();
         System.out.println("\n");
         System.out.println("\n");
		do {
			
			System.out.println("\n.......................monstro hp's: " + monstro.getHp());
			
			player.SD(player,monstro,end,next);
		     int pontos = 0;
		     pontos++;
		     Regras.exibeMenuEXP();
			 d = 0;
			arranhar = rd.nextInt(21);
			 pnt = rd.nextInt(6)+1;
			
			
			
			op = entrada.nextInt();
			if (op == 5) {
				
			}
			switch (op) {
			case 1:
				
				
				System.out.println("");
				System.out.println("Atacando");
				player.SD(player,monstro,end,next);
				playerex.EXatacar(player, monstro, d, arranhar);
			
				System.out.println("dano recebido do monstro:  " + arranhar);
				player.info();
				
				break;

			case 2:
				
				
				System.out.println("dano recebido do monstro:  " + arranhar);
				System.out.println("");
				System.out.println("esquivando");
				player.SD(player,monstro,end,next);
				playerex.EXafiar(player, monstro, d, arranhar);
				player.info();
				break;

			case 3:
				System.out.println("");
				player.SD(player,monstro,end,next);
				 next = entrada.toString();
				boolean used = player.potion(player, pnt );
				if (used) {
				System.out.println(" com a poção foi curado:  " + pnt);
				}
				player.info();
				break;

			case 4:
				System.out.println("        _-_.\r\n"
						+ "     _-',^. `-_.\r\n"
						+ " ._-' ,'   `.   `-_ \r\n"
						+ "!`-_._________`-':::\r\n"
						+ "!   /\\        /\\::::\r\n"
						+ ";  /  \\  "+d+"  /..\\:::\r\n"
						+ "! /    \\    /....\\::\r\n"
						+ "!/      \\  /......\\:\r\n"
						+ ";--.___. \\/_.__.--;; \r\n"
						+ " '-_    `:!;;;;;;;'\r\n"
						+ "    `-_, :!;;;''\r\n"
						+ "        `-!'      ");
				System.out.println("");
				player.SD(player,monstro,end,next);
				 next = entrada.toString();
				player.kamikaze(player, monstro, d, arranhar);
				player.info();
				break;
			case 5:
				
			
				break;
			case 9:
				System.out.println("        _-_.\r\n"
						+ "     _-',^. `-_.\r\n"
						+ " ._-' ,'   `.   `-_ \r\n"
						+ "!`-_._________`-':::\r\n"
						+ "!   /\\        /\\::::\r\n"
						+ ";  /  \\  "+d+"  /..\\:::\r\n"
						+ "! /    \\    /....\\::\r\n"
						+ "!/      \\  /......\\:\r\n"
						+ ";--.___. \\/_.__.--;; \r\n"
						+ " '-_    `:!;;;;;;;'\r\n"
						+ "    `-_, :!;;;''\r\n"
						+ "        `-!'      ");

			case 7:
			
				System.out.println("você fugiu da morte");
				end = true;
			default:
				if (player.isDead()) {
					System.out.print("---você morreu !!!---");
					continue;
				} else if (monstro.isDead()) {
					System.out.print("---você DERROTOU O INIMIGO !!!---");
					continue;
				}
				System.out.println("opção invalida");
				break;

			}
		} while (end == true);
		System.out.println("   !  ");

	}
}
