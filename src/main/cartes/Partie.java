package main.cartes;

import java.util.ArrayList;

public class Partie {
    ArrayList<Integer> combinaison;
    Partie gagner1;
    Partie gagner2;

    static ArrayList<ArrayList<Integer>> listCombinaisons = new ArrayList<>();

    public Partie(int point, ArrayList<Integer> points) {
        this.combinaison = new ArrayList<>(points);

        this.combinaison.add(point);

        int total = point;
        for (int item : this.combinaison) { // on evalue la valueur de la combinaison
            total += item;
        }

        if (26 - total > 0) // On pet rajouter un 1 a la combinaison
            this.gagner1 = new Partie(1, this.combinaison);
        else { // fin de la combinaisaon
            this.gagner1 = null;
        }

        if (26 - total > 1)// On pet rajouter un 2 a la combinaison
            this.gagner2 = new Partie(2, this.combinaison);
        else { // fin de la combinaisaon
            this.gagner2 = null;
        }

        if (total == 26) { // le compte est bon
            this.combinaison.remove(0);
            listCombinaisons.add(this.combinaison);
        }
    }


    public static ArrayList<ArrayList<Integer>> getListCombinaisons() {
        if (listCombinaisons.isEmpty())
            new Partie(0, new ArrayList<>());
        return listCombinaisons;
    }

    public static void showAllCombinaison() {
        if (listCombinaisons.isEmpty())
            new Partie(0, new ArrayList<>());
        for (ArrayList<Integer> combinaison : listCombinaisons) {
            combinaison.forEach(item -> System.out.print(item + " "));
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Affichage de toutes les combinaison");

        Partie.showAllCombinaison();
        Partie.showAllCombinaison();

        System.out.println("Nombre de combinaison : " + Partie.getListCombinaisons().size());

    }
}
