package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Joueur extends ObjetPlateau {
    public Joueur(){

    }
    /**
     * Cette methode sert à afficher
     * l'élément graphique H qui
     * le représente dans le jeu
     * **/
    @Override
    public char afficher (){

        return 'H';
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Joueur
     * n'est pas vide !
     * **/
    @Override
    public boolean estVide(){

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Joueur
     * n'est pas Marchable !
     * **/
    @Override
    public boolean estMarchable() {

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Joueur
     * n'est pas Poussable !
     * **/
    @Override
    public boolean estPoussable() {

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Joueur
     * n'est pas Glissant !
     * **/
    @Override
    public boolean estGlissant() {

        return false;
    }
}
