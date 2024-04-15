package Exercice1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        try {
            // System.out.print("Ecrire un nom de fichier : ");
            // String NameFile = scanner.nextLine();
            File file = new File("src");
            if (file.isFile() || file.isDirectory()) {
                if (file.isFile()) {
                    System.out.println("Type : Fichier");
                    System.out.println("Chemin d'origine : " + file.getPath());
                    System.out.println("Chemin absolu : " + file.getAbsolutePath());
                    System.out.println("Taille : " + file.length() + " octets");
                } else {
                    System.out.println("Type : Répertoire");
                    System.out.println("Chemin d'origine : " + file.getPath());
                    System.out.println("Liste des fichiers et répertoires du dossier " + file.getPath() + " :");
                    String[] Files = file.list();
                    for (String fichier : Files) {
                        System.out.println("  " + fichier);
                    }
                }
            } else {
                System.out.print("Ce n'est ni un nom de fichier ni un nom de répertoire");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}