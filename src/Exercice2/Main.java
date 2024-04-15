package Exercice2;

import java.util.Collection;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<Forme> formes = new ArrayList<>();
        formes.add(new Rectangle(3, 2, 5, 6));
        formes.add(new Cercle(3, 0, 5));
        formes.add(new Cercle(3, 3, 6));

        IOForme ioForme = new IOFormeTexte();

        try {
            ioForme.sauver(formes, "formes.txt");
            System.out.println("Affichage du fichier texte : ");
            Collection<Forme> formesLues = ioForme.lire("formes.txt");
            for (Forme forme : formesLues) {
                System.out.println(forme.getType() + " " + forme.getAttributes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        IOForme ioForme2 = new IOFormeBinaire();

        try {
            ioForme2.sauver(formes, "formes.bin");
            System.out.println("Affichage du fichier binaire : ");
            Collection<Forme> formesLues = ioForme2.lire("formes.bin");
            for (Forme forme : formesLues) {
                System.out.println(forme.getType() + " " + forme.getAttributes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
