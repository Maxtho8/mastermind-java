public class ModeleMastermind {

    /**
     * combinaison ordinateur
     */
    private int combinaison[];

    /**
     * nombre de valeurs entieres differentes pouvant etre generees
     */
    public static final int NB_COULEURS = 6;

    /**
     * taille de la combinaison
     */
    public static final int TAILLE_COMBINAISON = 4;

    /**
     * cree une instance ModeleMastermind
     */
    public ModeleMastermind() {
        this.combinaison = new int[TAILLE_COMBINAISON];
    }

    /**
     * genere aleatoirement une combinaison de taille taille dont les valeurs
     * sont comprises entre 0 et nbValeurs-1
     */
    public void genererCombinaison() {
        for (int i = 0; i < TAILLE_COMBINAISON; i++) {
            this.combinaison[i] = (int) (NB_COULEURS * Math.random());
        }
    }

    /**
     * renvoie la combinaison de l'ordinateur
     * 
     * @return tableau representant la combinaison
     */
    public int[] getCombinaison() {
        return (this.combinaison);
    }

    /**
     * indique le nombre de chiffres bien places dans le tableau passe en
     * parametre
     * 
     * @param tableau
     *            contenant la combinaison a verifier
     * @return nombre de chiffres bien places
     */
    public int nbCouleurBienPlaces(int tabChiffres[]) {
        int nbBienPlace = 0;
        for (int i = 0; i < TAILLE_COMBINAISON; i++) {
            if (this.combinaison[i] == tabChiffres[i]) {
                nbBienPlace++;
            }
        }
        return nbBienPlace;
    }

    /**
     * indique le nombre de chiffres mal places dans le tableau passe en
     * parametre
     * 
     * @param tableau
     *            contenant la combinaison a verifier
     * @return nombre de chiffres mal places
     */
    public int nbCouleurMalPlaces(int combinaisonJoueur[]) {
        int v = 0;
        int combinaisonAux[] = new int[TAILLE_COMBINAISON];
        int cloneCombinaisaisonJoueur[] = new int[TAILLE_COMBINAISON];
        for (int i = 0; i < TAILLE_COMBINAISON; i++) {
            combinaisonAux[i] = this.combinaison[i];
            cloneCombinaisaisonJoueur[i] = combinaisonJoueur[i];
            if (cloneCombinaisaisonJoueur[i] == combinaisonAux[i]) {
                combinaisonAux[i] = -1;
                cloneCombinaisaisonJoueur[i] = -2;
            }
        }
        for (int i = 0; i < TAILLE_COMBINAISON; i++) {
            boolean trouve = false;
            for (int j = 0; j < TAILLE_COMBINAISON && !trouve; j++) {
                if (cloneCombinaisaisonJoueur[i] == combinaisonAux[j]) {
                    v++;
                    combinaisonAux[j] = -1;
                    cloneCombinaisaisonJoueur[i] = -2;
                    trouve = true;
                }
            }
        }
        return v;
    }

    /**
     * produit une version unicode de la combinaison
     * 
     * @return la combinaison
     */
    public String toString() {
        String c = "( ";
        for (int i = 0; i < TAILLE_COMBINAISON; i++) {
            c = c + this.combinaison[i] + " ";
        }
        c = c + ")";
        return c;
    }
}
