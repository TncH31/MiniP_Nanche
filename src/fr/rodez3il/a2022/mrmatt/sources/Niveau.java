package fr.rodez3il.a2022.mrmatt.sources;

import fr.rodez3il.a2022.mrmatt.sources.objets.ObjetPlateau;
import fr.rodez3il.a2022.mrmatt.sources.objets.*;

public class Niveau {

	private ObjetPlateau[][] plateau;
	private int joueurX;
	private int joueurY;
	private int tailleVerticale;
	private int tailleHorizontale;
	private int totalPomme = 0;
	private int totalDeplacement = 0;
	private boolean finito;



	/**
	 * Constructeur public : crée un niveau depuis un fichier, ici, french-garden.
	 * Tout cela se fera grâce à la méthode chargerNiveau().
	 * @param chemin
	 * @author Nanche Thibaud
	 **/
	public Niveau(String chemin) {
		this.chargerNiveau(chemin);
	}

	private void chargerNiveau(String chemin) {

		String StringLeopard = Utils.lireFichier(chemin);
		String[] pseudoTableau = StringLeopard.split("\n");
		tailleVerticale = Integer.valueOf(pseudoTableau[0].trim());
		tailleHorizontale = Integer.valueOf(pseudoTableau[1].trim());
		this.plateau = new ObjetPlateau[this.tailleVerticale][this.tailleHorizontale];
		String[] tableauFinal = new String[this.tailleHorizontale];
		/**Ici, On créait un String StringLeopard qui récupère sous forme
		 * de caractères la map indiquer par le chemin en paramètre de notre fonction [lireFichier(chemin)]
		 * qui permet de la 'traduire' en caractères.
		 *
		 * On créait un tableau 'pseudoTableau' qui récupère chaque ligne de mon 'StringLeopard'
		 * La fonction trim() nous est très importante, car elle nous permet d'enlever les espaces des deux côtés
		 * de notre String (def) !
		 *
		 * On parcourt le 'pseudoTableau', sa 1ère colonne = [0] et on attribue
		 * à tailleVerticale la première colonne pseudoTableau[0] = 31.
		 *
		 * On parcourt le 'pseudoTableau', sa 2ème ligne = [1] et on attribue
		 * à tailleHorizontale la deuxième ligne pseudoTableau[1] = 18.
		 *
		 * Enfin, nous créons le tableau plateau étant une matrice qui est un objet de type ObjetPlateau dans lequel
		 * on détermine la limite de notre premier tableau [31] et du deuxième [18] récupérés ultérieurement grâce
		 * aux variables tailleVerticale et tailleHorizontale.
		 * **/
		int compteur =0;
		int x=0;
		for(String charactGame : pseudoTableau){
			if (compteur>1 && !charactGame.startsWith(" ")){
				tableauFinal[x]=charactGame;
				x++;
			}
			compteur++;
		}
		/** Ce bout de code ci-dessus permet d'enlever la ligne 1 et 2 du niveau avec un fort simplifier.
		 * D'Où notre tableauFinal qui n'est rien d'autre que notre tableau sans les deux premières lignes.
		 * @autor Julien Adami
		 * */
		for(int pourMaLigne = 0; pourMaLigne < this.tailleHorizontale; ++pourMaLigne) { 
			for(int pourMaColonne = 0; pourMaColonne < this.tailleVerticale; ++pourMaColonne) {
				ObjetPlateau symbole = ObjetPlateau.depuisCaractere(tableauFinal[pourMaLigne].charAt(pourMaColonne));
				this.plateau[pourMaColonne][pourMaLigne] = symbole;
				if (symbole.afficher() == '+') {
					++this.totalPomme;
				}
				if (symbole.afficher() == 'H') {
					this.joueurX = pourMaColonne;
					this.joueurY = pourMaLigne;
				}
			}
		}
		/**
		 * Dans cette double boucle for, on va chercher à créer une instance de type ObjetPlateau à laquelle on
		 * attribuera une position X(Ligne) et Y(Colonne) --> Pas dans notre schéma habituel, enfin bon..
		 * On créait l'objet symbole en lui attribuant le caractère parcouru.
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
		ObjetPlateau unObjetPlateau = this.plateau[sourceX][sourceY];
		this.plateau[sourceX][sourceY] = this.plateau[destinationX][destinationY];
		this.plateau[destinationX][destinationY] = unObjetPlateau;
	}

	/**
	 * Produit une sortie du niveau sur la sortie standard.
	 * @autor Nanche Thibaud
	 */
	public void afficher() {
		for(int numeroLigne = 0; numeroLigne < this.tailleHorizontale; ++numeroLigne) {
			for (int numeroColonne = 0; numeroColonne < this.tailleVerticale; ++numeroColonne) {
				System.out.print(this.plateau[numeroColonne][numeroLigne].afficher());
			}
			System.out.print("\n");
		}System.out.println("\nVous avez effectué " + this.totalDeplacement + " déplacements !" + "\n"
						+ "Il reste " + this.totalPomme + " Pommes !");
	/**
	 * Cette methode afficher() est inspiré de notre méthode chargerNiveau(). On voit , ici, que l'on reprend
	 * les deux boucles for vu précédemment.
	 * Cela nous sert, de nouveau, à parcourir notre niveau. Mais cette fois à chaque passage, on affiche le symbole
	 * récupéré.
	 * Ensuite, on se sert de nos méthodes codées plus en aval. Celles-ci nous permettent d'afficher le nombre
	 * de déplacements effectués par notre joueur ainsi que le nombre de pommes à récolter.
	 * **/

	}
	/**
	 * Je ne l'ai pas fini :(
	 * @autor Nanche Thibaud
	 **/
	// TODO : patron visiteur du Rocher...
	public void etatSuivantVisiteur(Rocher r, int x, int y) {
		System.out.println("not finish yet !");
	}
	/**
	 * Je ne l'ai pas fini :(
	 * @autor Nanche Thibaud
	 **/
	public void etatSuivantVisiteur(Pomme r, int x, int y) {
		System.out.println("not finish yet !");
	}

	/**
	 * Calcule l'état suivant du niveau.
	 * Je ne l'ai pas fini :(
	 * @autor Nanche Thibaud
	 **/
	public void etatSuivant() {
	}

	/**
	 * Cette methode est initialisé à false pour permettre la compilation
	 * je ne l'ai pas fini :(
	 * @autor Nanche Thibaud
	 */
	public boolean enCours() {
		return false;
	}

	/**
	 * Cette methode permet d'effectuer un déplacement en fonction
	 * de l'entré clavier du joueur en vérifiant si le déplacement est réalisable.
	 * @param c de type Commande de type enum
	 * @autor Nanche Thibaud
	 */
	public boolean jouer(Commande c) {
		switch(c) {
			case HAUT:
				if(deplacementPossible(this.joueurX - 1, this.joueurY)) {
					this.deplacer(this.joueurX - 1, this.joueurY);
					this.totalDeplacement++;
				}
				break;
				/**Ici, on veut aller vers le haut soit notre X - 1
				 * Incrémentation de totalDeplacement
				 * **/
			case GAUCHE:
				if(deplacementPossible(this.joueurX, this.joueurY - 1)) {
					this.deplacer(this.joueurX, this.joueurY - 1);
					this.totalDeplacement++;
				}
				break;
			    /**Ici, on veut aller vers la gauche soit notre Y - 1
				 * Incrémentation de totalDeplacement
				 *  **/
			case BAS:
				if(deplacementPossible(this.joueurX + 1, this.joueurY)) {
					this.deplacer(this.joueurX + 1, this.joueurY);
					this.totalDeplacement++;
				}
				break;
				/**Ici, on veut aller vers le bas soit notre X + 1
				 * Incrémentation de totalDeplacement
				 * **/
			case DROITE:
				if(deplacementPossible(this.joueurX, this.joueurY + 1)) {
					this.deplacer(this.joueurX, this.joueurY + 1);
					this.totalDeplacement++;
				}
				break;
			    /**Ici, on veut aller vers la gauche soit notre Y + 1
				 * Incrémentation de totalDeplacement
				 * **/
			case ANNULER:
				// TODO
				break;

			case QUITTER:
				this.finito = true;
				break;
			    /**Ici, on met fin à la partie ! **/
		}

		return true;
	}

	/**
	 * Cette methode permet de savoir le joueur a gagné ou perdu
	 * @autor Nanche Thibaud
	 */
	public void afficherEtatFinal() {
		if (totalPomme == 0) {
			System.out.println("Let's gooooo, vous gagnez une coiffe pioupiou et un magret royal !");
		} else if (this.finito) {
			System.out.println("La lose,vous êtes condamné à airer dans les rues de CanardCity ..");
		}
	}

	/**
	 * Cette methode est initialisé à false pour permettre la compilation
	 * je ne l'ai pas fini :(
	 * @autor Nanche Thibaud
	 */
	public boolean estIntermediaire() {
		return false;
	}
	/**
	 * je ne l'ai pas fini :(
	 * @param (dx, dy) (int)
	 * @autor Nanche Thibaud
	 */
	private void deplacer(int dx, int dy) {
		System.out.println("not finish yet !");
	}
	/**
	 * Cette methode permet de regarder si le déplacement demandé est possible
	 * @param (dx, dy) (int)
	 * @autor Nanche Thibaud
	 */
	public boolean deplacementPossible(int dx, int dy) {
		return true;
	}
}