package Exercice2;

class Cercle extends Forme {
    int Rayon;

    public Cercle(int x, int y, int rayon) {
        super(x, y);
        Rayon = rayon;
    }

    public String toString() {
        return "Cercle [x=" + x + ", y=" + y + ", Rayon=" + Rayon + "]";
    }

    public String getType() {
        return "cercle";
    }

    public String getAttributes() {
        return x + " " + y + " " + Rayon;
    }
}
