import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueMastermind extends JPanel{
	

	
	public VueMastermind() {
		// panel principal
		this.setLayout(new BorderLayout());
		
		//panel couleur
		JPanel p_couleur = new JPanel();
		p_couleur.setLayout(new FlowLayout());
		JLabel p_couleur_label = new JLabel();
		p_couleur_label.setText("Couleurs : ");
		JPanel p_couleur_grille = new JPanel();
		p_couleur_grille.setLayout(new GridLayout(1,6));
		JButton[] p_couleur_couleurs = new JButton[6];
		for(int i =0; i < 6 ; i++) {
			p_couleur_couleurs[i] = new JButton();
			p_couleur_grille.add(p_couleur_couleurs[i]);
		}
		p_couleur_couleurs[0].setBackground(Color.blue);
		p_couleur_couleurs[1].setBackground(Color.red);
		p_couleur_couleurs[2].setBackground(Color.green);
		p_couleur_couleurs[3].setBackground(Color.yellow);
		p_couleur_couleurs[4].setBackground(Color.cyan);
		p_couleur_couleurs[5].setBackground(Color.magenta);

		p_couleur.add(p_couleur_label);
		p_couleur.add(p_couleur_grille);
		this.add(p_couleur,BorderLayout.NORTH);
		
		
		
		//panel grille
		JPanel p_grille = new JPanel();
		p_grille.setLayout(new GridLayout(10,2));
		JPanel[] p_grille_lignes = new JPanel[10];
		JButton[][] p_grille_lignes_boutons = new JButton[10][4];
		
		JPanel[] p_grille_indices = new JPanel[10];
		JTextField[][] p_grille_indices_textfield = new JTextField[10][2];
		JLabel[][] p_grille_indices_label = new JLabel[10][2];
		
		for(int i = 0; i < 10 ; i++) {
			p_grille_lignes[i] = new JPanel();
			p_grille_lignes[i].setLayout(new GridLayout(1,4));
			for(int z =0; z < 4;z++) {
				p_grille_lignes_boutons[i][z] = new JButton();
				p_grille_lignes[i].add(p_grille_lignes_boutons[i][z]);
			}
			p_grille.add(p_grille_lignes[i]);
			
			// panel d'indice
			p_grille_indices[i] = new JPanel();
			
			p_grille_indices_label[i][0] = new JLabel();
			p_grille_indices_label[i][1] = new JLabel();
			p_grille_indices_label[i][0].setText("BP");
			p_grille_indices_label[i][1].setText("MP");
			p_grille_indices[i].add(p_grille_indices_label[i][0]);
			p_grille_indices[i].add(p_grille_indices_label[i][1]);
			
			p_grille_indices[i].setLayout(new GridLayout(2,2));
			p_grille_indices_textfield[i][0] = new JTextField();
			p_grille_indices_textfield[i][1] = new JTextField();
			p_grille_indices[i].add(p_grille_indices_textfield[i][0]);
			p_grille_indices[i].add(p_grille_indices_textfield[i][1]);
			
			p_grille.add(p_grille_indices[i]);
			
			
			
		}
		this.add(p_grille,BorderLayout.CENTER);
		
		// panel combinaison 
		
		JPanel p_combi = new JPanel();
		p_combi.setLayout(new GridLayout(1,2));
		
		JPanel p_combi_couleurs = new JPanel();
		p_combi_couleurs.setLayout(new GridLayout(1,4));
		JTextField[] p_combi_couleurs_textfield = new JTextField[4];
		
		for(int i =0; i < 4 ; i++) {
			p_combi_couleurs_textfield[i] = new JTextField();
			p_combi_couleurs.add(p_combi_couleurs_textfield[i]);
		}
		p_combi.add(p_combi_couleurs);
		
		JButton p_combi_valider = new JButton();
		p_combi_valider.setText("Valider");
		p_combi.add(p_combi_valider);
		
		
		this.add(p_combi,BorderLayout.SOUTH);
		
		
		
		
	}
}
