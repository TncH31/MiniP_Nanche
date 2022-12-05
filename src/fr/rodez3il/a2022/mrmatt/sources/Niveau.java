package fr.rodez3il.a2022.mrmatt.sources;

import fr.rodez3il.a2022.mrmatt.sources.objets.ObjetPlateau;
import fr.rodez3il.a2022.mrmatt.sources.objets.Rocher;

public class Niveau {
	// Les objets sur le plateau du niveau
	private ObjetPlateau[][] plateau;
	// Position du joueur
	private int joueurX;
	private int joueurY;
	
  // Autres attributs que vous jugerez nécessaires...
  
	/**
	 * Constructeur public : crée un niveau depuis un fichier.
	 * @param chemin
	 * @author Nanche Thibaud
	 **/
	public Niveau(String chemin) {
		chargerNiveau(chemin);
	}

	private void chargerNiveau(String chemin) {
	}

	/**
	 * Cette classe permet d'échanger une position d'un objet sourceX, sourceY
	 * avec un objet en position destinationX, destinationY.
	 * @param (int sourceX, int sourceY, int destinationX, int destinationY)
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
    // TODO
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
		return false;
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
