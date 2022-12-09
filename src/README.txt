Création du jeu Mr. Matt

Première question :

Cette classe est abstraite, car le concept même d'objetPlateau
est abstrait et englobe un ensemble d'au moins 6 objetPlateau
qui n'ont pas tous les mêmes caractéristiques.
De ce fait, comme une classe figure en géométrie serait abstraite,
ObjetPlateau est abstrait.
De plus même si une classe peut être abstraite sans posséder
de méthodes abstraites. Ici, ObjetPlateau possédera des méthodes
abstraites.

Deuxième question :

La méthode est privée, car elle fait appel à deux Attributs privés
de cette même classe et échangera l’objet en position (sourceX, sourceY)
avec celui en position (destinationX, destinationY).
En effet, si cette Méthode peut être appelée en dehors de sa classe alors
on pourrait voir des petits malins l'utiliser pour corrompre notre jeu.
Il n'y a pas de sens à ce que cette méthode soit utilisée en dehors de la classe.
Il est préférable de la mettre en privée.

Troisième question :

Les méthodes deplacer et deplacementPossible sont utilisées uniquement dans la methode jouer(Commande c).
De ce fait, il n'y a aucune raison pour que l'on mette ces deux dernières 'public'.
Cela ne serait pas un choix raisonnable et cohérent.

Quatrième question :

Bien que n'ayant pas était aussi loin, on remarquera asser facilement que instanceof est utilisé. Néanmoins,
cette methode est fortement déconseillé d'utilisation hors de la méthode egals().

IMPRESSION :

Projet intéressant et factuel ! Néanmoins n'étant que novice en java, j'ai éprouvé beaucoup de difficulté
à la réalisation du projet.
Je n'ai d'ailleurs pas fini le jeu même si l'aide de mes camarades n'a pas manqué.
Je déteste être dans l'incompréhension et j'ai appris beaucoup de choses.
Je n'ai pas décidé de finir le projet sans le comprendre, même avec votre correction, cela ne m'intéresse pas.

Ce fût une bonne expérience !!!