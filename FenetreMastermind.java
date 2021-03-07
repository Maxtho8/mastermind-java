import java.awt.GridLayout;

import javax.swing.JFrame;

public class FenetreMastermind extends JFrame {
    /**
     * Construit une FenetreCouleur contenant un PanneauCouleur
     */
    public FenetreMastermind() {
        // associer un titre à la FenetreCouleur
        this.setTitle("Conversions RVB");
        // selectionner le gestionnaire de mise en page de la FenetreCouleur
        this.setLayout(new GridLayout(1, 1));
        // creer une vue couleur et l'ajouter a la FenetreCouleur
        this.add(new VueMastermind());
        // associer une taille à la FenetreCouleur

        // associer un gestionnaire de fenetre a la FenetreCouleur
        // a l'ecoute d'un evenement se produisant sur la fenetre
        // afficher la FenetreCouleur
        this.pack();
        this.setVisible(true);
        this.setSize(300, 700);
    }
}
