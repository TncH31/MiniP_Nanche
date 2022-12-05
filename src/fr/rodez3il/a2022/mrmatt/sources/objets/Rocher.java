package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Rocher extends ObjetPlateau {

    public Rocher(){

    }
    /**
     * Cette methode sert à afficher
     * l'élément graphique * qui
     * le représente dans le jeu
     * @autor Nanche Thibaud
     * **/
    @Override
    public char afficher (){

        return '*';
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Rocher
     * n'est pas vide !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estVide(){

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Rocher
     * n'est pas Marchable !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estMarchable() {

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Rocher
     * est Poussable !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estPoussable() {

        return true;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Rocher
     * est Glissant !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estGlissant() {

        return true;
    }
}
