package Exercice2;

import java.util.Collection;
import java.io.*;
import java.util.*;

// Classe IOFormeTexte
class IOFormeTexte implements IOForme {
    public Collection<Forme> lire(String filename) throws IOException {
        List<Forme> formes = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            if (parts.length >= 2) {
                String type = parts[0];
                int x = Integer.parseInt(parts[1]);
                int y = Integer.parseInt(parts[2]);
                if (type.equals("rectangle")) {
                    int width = Integer.parseInt(parts[3]);
                    int height = Integer.parseInt(parts[4]);
                    formes.add(new Rectangle(x, y, width, height));
                } else if (type.equals("cercle")) {
                    int radius = Integer.parseInt(parts[3]);
                    formes.add(new Cercle(x, y, radius));
                }

                // if (type.equals("rectangle")) {
                // if (parts.length == 5) {
                // int x = Integer.parseInt(parts[1]);
                // int y = Integer.parseInt(parts[2]);
                // int width = Integer.parseInt(parts[3]);
                // int height = Integer.parseInt(parts[4]);
                // formes.add(new Rectangle(x, y, width, height));
                // }
                // } else if (type.equals("cercle")) {
                // if (parts.length == 4) {
                // int x = Integer.parseInt(parts[1]);
                // int y = Integer.parseInt(parts[2]);
                // int radius = Integer.parseInt(parts[3]);
                // formes.add(new Cercle(x, y, radius));
                // }
                // }
            }
        }
        reader.close();
        return formes;
    }

    public void sauver(Collection<Forme> formes, String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (Forme forme : formes) {
            writer.write(forme.getType() + " " + forme.getAttributes());
            writer.newLine();
        }
        writer.close();
    }
}
