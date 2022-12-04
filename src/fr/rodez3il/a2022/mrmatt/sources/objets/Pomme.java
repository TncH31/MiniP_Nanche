package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Pomme extends ObjetPlateau {

    public Pomme(){

    }
    /**
     * Cette methode sert à afficher
     * l'élément graphique + qui
     * le représente dans le jeu
     * **/
    @Override
    public char afficher (){

        return '+';
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Pomme
     * n'est pas vide !
     * **/
    @Override
    public boolean estVide(){

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Pomme
     * est Marchable !
     * **/
    @Override
    public boolean estMarchable() {

        return true;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Pomme
     * n'est pas Poussable !
     * **/
    @Override
    public boolean estPoussable() {

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Pomme
     * n'est pas Glissant !
     * **/
    @Override
    public boolean estGlissant() {

        return false;
    }
}