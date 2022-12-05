package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Pomme extends ObjetPlateau {

    public Pomme(){

    }
    /**
     * Cette methode sert à afficher
     * l'élément graphique + qui
     * le représente dans le jeu
     * @autor Nanche Thibaud
     * **/
    @Override
    public char afficher (){

        return '+';
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Pomme
     * n'est pas vide !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estVide(){

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Pomme
     * est Marchable !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estMarchable() {

        return true;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Pomme
     * n'est pas Poussable !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estPoussable() {

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Pomme
     * n'est pas Glissant !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estGlissant() {

        return false;
    }
}