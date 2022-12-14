package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Mur extends ObjetPlateau {

    public Mur(){
    super();
    }
    /**
     * Cette methode sert à afficher
     * l'élément graphique # qui
     * le représente dans le jeu
     * @autor Nanche Thibaud
     * **/
    @Override
    public char afficher(){

        return '#';
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Mur
     * n'est pas vide !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estVide(){

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Mur
     * n'est pas Marchable !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estMarchable() {

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Mur
     * n'est pas Poussable !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estPoussable() {

        return false;
    }
    /**
     * Cette methode sert indiquer
     * que tout objet de type Mur
     * n'est pas Glissant !
     * @autor Nanche Thibaud
     * **/
    @Override
    public boolean estGlissant() {

        return false;
    }
}