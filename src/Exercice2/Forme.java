package Exercice2;

import java.io.Serializable;

abstract class Forme implements Serializable {
    int x, y;

    public Forme(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected abstract String getType();

    protected abstract String getAttributes();

}
