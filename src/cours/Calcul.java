package cours;

import java.util.Scanner;

public class Calcul {
	private String[] errors;
	private String error;
	private boolean stopOperation;
	private int nb1;
	private int nb2;
	private int resultat;
	private int index;
	
	Calcul() {
		this.errors = Constants.ERRORS;
		this.intialize();
		this.start();
	}
	
	private void intialize() {
		this.error = "";
		this.stopOperation = false;
		this.nb1 = 0;
		this.nb2 = 0;
		this.index = 0;
		this.resultat = 0;
	}
	
	public void start() {
		// initialisation
		final String TITRE_APPLICATION[] = Constants.TITRE_APPLICATION;
		final String FIN_APPLICATION = Constants.FIN_APPLICATION;
		
		boolean nouveauCalcul = true;
		Scanner sc = new Scanner(System.in);
		
		String reponse = "";
		String operation = "";
		
		// affichage titre
		System.out.println(TITRE_APPLICATION[0] + "\n" + TITRE_APPLICATION[1] + "\n" + TITRE_APPLICATION[2]);
		
		// boucle principale
		while(nouveauCalcul) {
			System.out.println("attention operation a deux entier SEULEMENT...");
			System.out.print("Ton operation :  ");
			operation = sc.nextLine();
			
			String tab[] = operation.split(" ");
			
			this.calculate(tab, operation);
			
			System.out.println("Veux-tu effectuer une nouvelle opération ? [On]");
			reponse = sc.nextLine();
			
			if(reponse.equals("n")) {
				nouveauCalcul = false;
			}
			
			operation = "";
		}
		
		System.out.println(FIN_APPLICATION);
		sc.close();
	}
	
	public void calculate(String tab[], String operation) {

 		if (tab.length == 3) {
			for (String item : tab) {
				
				try {
					if (nb1 == 0) {
						nb1 = Integer.parseInt(item);
					} else {
						nb2 = Integer.parseInt(item);
						stopOperation = true;
					} 
				} catch (NumberFormatException e) {
					if (index % 2 == 1) {
						operation = item;
					} else {
						error = errors[0];
					}
				}
				
				if (nb1 != 0 && nb2 != 0) {
					switch (operation) {
						case "+" : resultat = nb1 + nb2; break;
						case "x" : resultat = nb1 * nb2; break;
						case "*" : resultat = nb1 * nb2; break;
						case "/" : resultat = nb1 / nb2; break;
						case ":" : resultat = nb1 / nb2; break;
						case "%" : resultat = nb1 % nb2; break;
						case "-" : resultat = nb1 - nb2; break;
						default : error = errors[1];
					}
				}
				
				if (stopOperation) {
					break;
				}

				index++;
			}	
		} else if (tab.length > 3) {
			error = errors[2];
		} else {
			error = errors[3];
		}

		System.out.println((error.equals("")) ? "Résultat de l'operation : " + resultat : error );
		
		this.intialize();
	}
	
}
