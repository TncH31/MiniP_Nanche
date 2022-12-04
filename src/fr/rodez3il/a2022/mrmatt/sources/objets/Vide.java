package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Vide extends ObjetPlateau {

    public Vide(){

    }
    /**
     * Cette methode sert à afficher
     * l'élément graphique 'espace' qui
     * le représente dans le jeu
     * **/
    @Override
    public char afficher (){

        return ' ';
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Vide
     * est vide !
     * **/
    @Override
    public boolean estVide(){

        return true;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Vide
     * est Marchable !
     * **/
    @Override
    public boolean estMarchable() {

        return true;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Vide
     * n'est pas Poussable !
     * **/
    @Override
    public boolean estPoussable() {

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Vide
     * n'est pas Glissant !
     * **/
    @Override
    public boolean estGlissant() {

        return false;
    }
}
