package fr.rodez3il.a2022.mrmatt.sources.objets;

import fr.rodez3il.a2022.mrmatt.sources.Niveau;

public abstract class ObjetPlateau {
	/**
	 * Fabrique des objets
	 * @param chr le symbole à produire
	 * @return la classe ObjetPlateau correspondante
	 * @autor nanche thibaud : Ce n'est pas la solution la plus optimale selon moi.
	 * En effet, en java le switch est traduit à la compilation par des if, if else ect...
	 * Pour un code optimal et efficace il faudrait remplacer cela par des if.
	 */
	public static ObjetPlateau depuisCaractere(char chr) {
		ObjetPlateau nouveau = null;
		switch(chr) {
		case '-':
			nouveau = new Herbe();
			break;
		case '+':
			nouveau = new Pomme();
			break;
		case '*':
			nouveau = new Rocher();
			break;
		case ' ':
			nouveau = new Vide();
			break;
		case '#':
			nouveau = new Mur();
			break;
		case 'H':
			nouveau = new Joueur();
			break;
		}
		return nouveau;
	}
	/**
	 * Cette methode sert à afficher
	 * l'élément graphique - qui
	 * le représente dans le jeu
	 * @autor Nanche Thibaud
	 * **/
	public abstract char afficher ();
	/**
	 * Cette methode sert indiquer
	 * que tout objet de type ObjetPlateau
	 * est vide ou ne l'est pas !
	 * @autor Nanche Thibaud
			**/
	public abstract boolean estVide();
	/**
	 * Cette methode sert indiquer
	 * que tout objet de type ObjetPlateau
	 * est Marchable ou ne l'est pas !
	 * @autor Nanche Thibaud
			**/
	public abstract boolean estMarchable();
	/**
	 * Cette methode sert indiquer
	 * que tout objet de type ObjetPlateau
	 * est Poussable ou ne l'est pas !
	 * @autor Nanche Thibaud
			**/
	public abstract boolean estPoussable() ;
	/**
	 * Cette methode sert indiquer
	 * que tout objet de type ObjetPlateau
	 * est Glissant ou ne l'est pas !
	 * @autor Nanche Thibaud
			**/
	public abstract boolean estGlissant();

	/**
	 * ICI, ON TROUVE UNE AUTRE SOLUTION QUI NOUS PERMETTREZ, D'AILLEURS, D'ALLÉGER NOS CLASSES FILLES.
	 * CELA SE FERAIT EN NE REDÉFINISSANT PAS LA METHODE estVide(), PAR EXEMPLE, POUR TOUTES LES CLASSES FILLES
	 * SAUF 'Vide' ET AINSI DE SUITE !
	 * OR, SI CETTE CLASSE EST ABSTRAITE C'EST JUSTEMENT POUR FAIRE UN CODE PROPRE
	 * ET COHERENT. LES OBJETS DU PLATEAU N'ONT PAS TOUS LES MEMES CARACTERISTIQUES DONC NOUS CREONS
	 * DES METHODES ABSTRAITES POUR CELLES-CI (BOOLEAN).
	 *@autor Nanche Thibaud
	 * -----------------------------------------------------
	 * Cette methode sert indiquer
	 * que tout objet de type ObjetPlateau
	 * est vide ou ne l'est pas !
	 * @autor Nanche Thibaud
	 *
	public boolean estVide(){

		return false;
	}

	 * Cette methode sert indiquer
	 * que tout objet de type ObjetPlateau
	 * est Marchable ou ne l'est pas !
	 * @autor Nanche Thibaud
	 *
	public boolean estMarchable() {

		return true;
	}

	 * Cette methode sert indiquer
	 * que tout objet de type ObjetPlateau
	 * est Poussable ou ne l'est pas !
	 * @autor Nanche Thibaud
	 *
	public boolean estPoussable() {

		return false;
	}

	 * Cette methode sert indiquer
	 * que tout objet de type ObjetPlateau
	 * est Glissant ou ne l'est pas !
	 * @autor Nanche Thibaud
	 *
	public boolean estGlissant() {

		return false;
	}
	 **/
}
