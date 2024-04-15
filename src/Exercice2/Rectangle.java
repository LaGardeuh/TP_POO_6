package Exercice2;

class Rectangle extends Forme {
    int longueur, largeur;

    public Rectangle(int x, int y, int longueur, int largeur) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public String toString() {
        return "Rectangle [x=" + x + ", y=" + y + ", longueur=" + longueur + ", largeur=" + largeur + "]";
    }

    public String getType() {
        return "rectangle";
    }

    public String getAttributes() {
        return x + " " + y + " " + longueur + " " + largeur;
    }

}
