public class Main {
    public static void main(String[] args) {
        // Instanciation de trois objets de la classe Cercle
        Cercle cercle1 = new Cercle();
        cercle1.setRayon(5.0);
        cercle1.setCentre(0.0, 0.0);

        Cercle cercle2 = new Cercle();
        cercle2.setRayon(3.0);
        cercle2.setCentre(2.0, 3.0);

        Cercle cercle3 = new Cercle();
        cercle3.setRayon(7.0);
        cercle3.setCentre(-1.0, -2.0);

        // Tests des méthodes
        System.out.println("Surface cercle 1 : " + cercle1.surface());
        System.out.println("Est (1, 1) à l'intérieur du cercle 2 : " + cercle2.estInterieur(1.0, 1.0));
        System.out.println("Est (3, 4) à l'intérieur du cercle 3 : " + cercle3.estInterieur(3.0, 4.0));
    }
}

class Cercle {
    private double rayon;
    private double centreX;
    private double centreY;

    public void setCentre(double x, double y) {
        centreX = x;
        centreY = y;
    }

    public void setRayon(double r) {
        rayon = r;
    }

    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    public boolean estInterieur(double x, double y) {
        // Utilise la formule de distance pour vérifier si le point est à l'intérieur du cercle
        double distanceAuCarre = Math.pow(x - centreX, 2) + Math.pow(y - centreY, 2);
        return distanceAuCarre <= Math.pow(rayon, 2);
    }
}
