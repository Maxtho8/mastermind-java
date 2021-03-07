import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		new FenetreMastermind();
		
		/*ModeleMastermind modele = new ModeleMastermind();
		modele.genererCombinaison();
		System.out.println(modele.toString());
		System.out.println("Entrez votre combinaison");
		Scanner sc = new Scanner(System.in);
		int combinaison[] = new int[modele.TAILLE_COMBINAISON];
		String input1;
		while(modele.nbCouleurBienPlaces(combinaison) != modele.TAILLE_COMBINAISON) {
			 input1 = sc.nextLine();
			if(input1.length() == modele.TAILLE_COMBINAISON) {
				for(int i = 0; i< modele.TAILLE_COMBINAISON;i++) {
					combinaison[i] = Character.getNumericValue(input1.charAt(i));
				}
				System.out.println("Couleur bien placées : " + modele.nbCouleurBienPlaces(combinaison));
				System.out.println("Couleur mal placées : " + modele.nbCouleurMalPlaces(combinaison));
			}else {
				System.out.println("Nombre invalide");
			}
			
		}*/
	}

}
