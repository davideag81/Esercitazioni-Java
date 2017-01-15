package it.unipa.community.davideproietto.prg.n11.es01;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("\nGestione MUSEO -----------------------");
		Scanner scanner = new Scanner(System.in);
		String string = "";
		System.out.println("\nMenu");
		System.out.println("\n1. Crea Museo");
		System.out.println("\n EXIT per uscire");
		while(!(string = scanner.next()).toLowerCase().equals("exit")) {
			System.out.println("Hai digitato " + string.toUpperCase() + "!");
			Museo louvre = new Museo("Louvre", "Champs elysee, Paris");
			System.out.println(louvre.toString());
			System.out.println("\n ------------------------------------------------------------------------\n\n");
			System.out.println("\n --------"
					+ "\n --------"
					+ "\n --------"
					+ "\n\n ");
		}
/*			do{
				switch
				case 1:
				case 2:
				case 3:
				case 4:
					default:x
					Integer.
			}
			}
				while
			menu();
			String stringa = "";
			while(!(stringa = scanner.next()).toLowerCase().equals("exit")) {
				System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
			int ash=0;
				switch(ash){
				case 1:
					System.out.println("Digita 1 per scultura");
					System.out.println("Digita 2 per dipinto");
					System.out.println("\n ------------------------------------------------------------------------\n\n");
					int scelta=0;
					if(scelta == 1){
						OperaDArte opera = new Scultura();
					}
					System.out.println("Hai inserito una scultura");
					//OperaDArte opera = new OperaDArte();
				default:
				//	return -1;
				}	
			}
			System.out.println("Fine programma!");
			{
			System.exit(0);
			
		//exit

		}
*/
	}
	public static final void menu(){
		System.out.println("\n");
		System.out.println("\n ------------------------------------------------------------------------\n\n");
		System.out.println(
				 "\n 1. Inserisci nuova opera d'arte "
				+ "\n 2. Rimuovi opera d'arte "
				+ "\n 3. Stampa inventario opere d'arte "
				+ "\n"
				+ "\n EXIT per uscire"
				+ "\n");
	}
}
