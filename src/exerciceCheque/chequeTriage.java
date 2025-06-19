package exerciceCheque;

import java.util.Arrays;
import java.util.Scanner;

public class chequeTriage {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Entrez le nombre de cheques a introduire");
        int nbCheques = s.nextInt();
        int[] numero = new int[nbCheques];
        int[] montant = new int[nbCheques];
        int montantTotal = 0;

        for(int i=0; i < numero.length; i++) {
            System.out.println("Entrez le numéro du chèque :");
            numero[i] = s.nextInt();
            System.out.println("Entrez le montant associé au chèque :");
            montant[i] = s.nextInt();
            montantTotal += montant[i];
        }

        System.out.println("Vous avez entré : "+nbCheques+" chèques");
        System.out.println("Le montant total des chèques est de  "+montantTotal+" €");
        System.out.println("La moyenne des chèques est de  "+montantTotal / nbCheques +" €");
    }
}
