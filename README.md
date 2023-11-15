Environement : IntelliJ IDE
Langage : Java 


Exercice 1 : Cercle
Le but de cet exercice est d'écrire une classe représentant les cercles.
Écrivez un programme TestCercle.java dans lequel vous définissez une classe Cercle ayant comme attributs privés le rayon du cercle
(de type double), et la position de son centre (les deux coordonnées en «x» et «y» de type double). Déclarez ensuite des méthodes «set» publiques pour cette classe, par exemple :
void setCentre(double x, double y) void setRayon(double)
Il n'est a priori pas nécessaire de définir de «getters» pour cette classe. Ajoutez ensuite les méthodes (faisant aussi partie de l'interface d'utilisation) :
double surface() qui calcule et retourne la surface du cercle (pi fois le carré du rayon);
boolean estInterieur(double x, double y) qui teste si le point de coordonnées (x,y) passé en paramètre fait ou non partie du cercle (frontière comprise : disque fermé). La méthode retournera true si le test est positif, et false dans le cas contraire.
Dans le programme principal, instanciez trois objets de la classe Cercle, affectez des valeurs de votre choix à leur attributs et testez vos méthodes surface et estInterieur.
Remarque : la constante pi est donnée par Math.PI.
