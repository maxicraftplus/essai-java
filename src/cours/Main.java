package cours;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean leafRepertory = true;
		
		String repertory[][] = {
			{
				"maxime",
				"12",
				"maxitrompette@ymail.com",
				"0769317415",
				"true"
			},
			{
				"dwaps",
				"36",
				"contact@dwaps.fr",
				"0651279211",
				"true"
			},
			{
				"schtroumpfette",
				"15",
				"schtroupfette@gmail.com",
				"0000000000",
				"false"
			}
		};
		
		while (leafRepertory) {
			System.out.println("Qui cherchez-vous ?");
			String prenom = sc.nextLine();
			boolean found = false;
			
			for (String[] contact : repertory) {
				for (String detail : contact) {
					if (detail.equals(prenom)) {
						found = true;
						for (int i = 0; i < contact.length; i++) {
							System.out.println(contact[i]);
						}
					}
				}
			}
			
			if (!found) {
				System.out.println("désolé cette personne ne fait pas partie des contacts");
			}
			
			System.out.println("souhaitez vous faire une autre recherche? [On]");
			String reponse = sc.nextLine();
			
			if (reponse.equals("n")) {
				leafRepertory = false;
				System.out.println("fermez avec succès. à bientôt.");
			}
		}
		
		sc.close();
	}
}