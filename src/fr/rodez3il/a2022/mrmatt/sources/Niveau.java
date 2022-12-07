package fr.rodez3il.a2022.mrmatt.sources;

import fr.rodez3il.a2022.mrmatt.sources.objets.ObjetPlateau;
import fr.rodez3il.a2022.mrmatt.sources.objets.*;

public class Niveau {
	// Les objets sur le plateau du niveau
	private ObjetPlateau[][] plateau;
	// Position du joueur
	private int joueurX;
	private int joueurY;
	
  // Autres attributs que vous jugerez nécessaires...
  	private int totalPomme = 0;

	/**
	 * Constructeur public : crée un niveau depuis un fichier.
	 * @param chemin
	 * @author Nanche Thibaud
	 **/
	public Niveau(String chemin) {

		String StringLeopard = Utils.lireFichier(chemin);
		String[] pseudoTableau = StringLeopard.split("\n");
		System.out.println(pseudoTableau[0]);
		String horizontalString = pseudoTableau[0].charAt(0)+""+pseudoTableau[0].charAt(1);
		String verticalString = pseudoTableau[1].charAt(0)+""+pseudoTableau[1].charAt(1);
		int horizontal = Integer.valueOf(horizontalString);

		int vertical =new Integer(verticalString);
		plateau = new ObjetPlateau[horizontal][vertical];
		/**Ici, On créait un String StringLeopard qui récupère sous forme
		 * de caractères la map indiquer par le chemin en paramètre de notre fonction [lireFichier(chemin)]
		 * qui permet de la 'traduire' en caractères.
		 *
		 * On créait un tableau 'pseudoTableau' qui récupère chaque ligne de mon 'StringLeopard'
		 *
		 * On parcourt le 'pseudoTableau' sa 1ère ligne = [0] et on attribue
		 * à horizontal la première ligne pseudoTableau[0] = (31).
		 *
		 * On parcourt le 'pseudoTableau' sa 2ème ligne = [1] et on attribue
		 * à vertical la deuxième ligne pseudoTableau[1] = (18).
		 *
		 * Enfin, nous créons le tableau plateau étant une matrice qui est un objet de type ObjetPlateau dans lequel
		 * on détermine la limite de notre premier tableau [31] et du deuxième [18].
		 * **/
		for (int pourMaLigne = 2; pourMaLigne < pseudoTableau.length; ++pourMaLigne) {
			for (int pourMaColonne = 0; pourMaColonne < pseudoTableau[0].length(); ++pourMaColonne) {
				ObjetPlateau symbole = ObjetPlateau.depuisCaractere(pseudoTableau[pourMaLigne].charAt(pourMaColonne));
				System.out.println(symbole.afficher());
				this.plateau[pourMaLigne - 2][pourMaColonne] = symbole;

				if (symbole.afficher() == '+') {
					totalPomme+=1;
					System.out.println(totalPomme);
				}
				if (symbole.afficher() == 'H') {
					joueurX = pourMaColonne;
					joueurY = pourMaLigne;
				}
			}
		}
		System.out.println("nikzbi");
		System.out.println(this.plateau[0][0].afficher());

		/**
		 * Dans cette double boucle fort on va chercher à créer une instance de type ObjetPlateau à laquelle on
		 * attribuera une position X(Colonne) et Y(Ligne). Pour se faire on créait une première boucle qui commence
		 * à 2, car les deux premières lignes du tableau ne nous intéresse pas (Cette valeur nous servira dans la
		 * deuxième boucle, je vous expliquerai). Dans la deuxième boucle, on va parcourir chaque symbole de notre ligne
		 * que l'on délimitera par sa longueur. On réutilise d'ailleurs la variable PourMaLigne utilisée précédemment
		 * pour parcourir chaque ligne sauf les deux premières.
		 * En effet, au minimum, on commencera par la 3ème ligne, car pseudoTableau[2] = 3ème ligne ;)
		 * Par la suite on créait l'objet en lui attribuant le caractère parcouru.
		 * Si c'est un char = '+' alors on incrémente le totalPomme par 1.
		 * Si c'est un char = 'H' ainsi on renseigne la position du joueur.
		 * **/
	}

	/**
	 * Cette classe permet d'échanger une position d'un objet sourceX, sourceY
	 * avec un objet en position destinationX, destinationY.
	 * @param (sourceX, sourceY, destinationX, destinationY) --> Integer
	 * @autor Nanche Thibaud
	 */
	private void echanger(int sourceX, int sourceY, int destinationX, int destinationY) {
		ObjetPlateau o = this.plateau[sourceX][sourceY];
		this.plateau[sourceX][sourceY] = this.plateau[destinationX][destinationY];
		this.plateau[destinationX][destinationY] = o;
	}

	/**
	 * Produit une sortie du niveau sur la sortie standard.
	 * ................
	 */
	public void afficher() {
		System.out.println("hey"+plateau[0][3].afficher());
    for (int i = 0; i < plateau.length; i++){
		System.out.print("hey");
		for(int j = 0; j < plateau[i].length; j++){
			System.out.print(plateau[i][j].afficher());
		}
	}
	}

  // TODO : patron visiteur du Rocher...
	public void etatSuivantVisiteur(Rocher r, int x, int y) {
    
	}

	/**
	 * Calcule l'état suivant du niveau.
	 * ........
	 * @author 
	 */
	public void etatSuivant() {
    // TODO
	}


  // Illustrez les Javadocs manquantes lorsque vous coderez ces méthodes !
  
	public boolean enCours() {
		return true;
	}

  // Joue la commande C passée en paramètres
	public boolean jouer(Commande c) {
		return false;
	}

	/**
	 * Affiche l'état final (gagné ou perdu) une fois le jeu terminé.
	 */
	public void afficherEtatFinal() {
	}

	public boolean estIntermediaire() {
		return false;
	}

  // Code pour empêcher la compilation



}
