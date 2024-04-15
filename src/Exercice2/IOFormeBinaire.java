
package Exercice2;

import java.io.*;
import java.util.*;

// Classe IOFormeBinaire
class IOFormeBinaire implements IOForme {
    public Collection<Forme> lire(String filename) throws IOException {
        List<Forme> formes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            while (true) {
                try {
                    Forme forme = (Forme) ois.readObject();
                    formes.add(forme);
                } catch (EOFException e) {
                    break; // Sortir de la boucle lorsqu'on atteint la fin du fichier
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return formes;
    }

    public void sauver(Collection<Forme> formes, String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            for (Forme forme : formes) {
                oos.writeObject(forme);
            }
        }
    }
}