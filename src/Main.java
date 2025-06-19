import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercice1();
        exercice2();
        exercice3();
        exercice4();
        exercice5();
    }

    private static void exercice1() {
        /*
         * facile
         * Créez une fonction qui prend deux entiers en paramètre
         * et restitue leur somme
         */
        System.out.println("Somme :");
        System.out.println(somme(5, 2));
        System.out.println(somme(128, 13));
        System.out.println(somme(-2, -4));
    }

    private static int somme(int a, int b) {

        return a + b;
    }

    private static void exercice2() {
        /*
         * moyen
         * créez une fonction qui prend un tableau en paramètre
         * et qui affiche chacun de ses éléments à la ligne
         */
        System.out.println("Tableau à la ligne :");
        int[] ptnDeTableau = {5,4,8,7,6,5,4,3};
        tableauLigne(ptnDeTableau);
    }

    private static void tableauLigne(int[] monTableau) {
        for (int element : monTableau) {
            System.out.println(element);
        }
    }



    private static void exercice3() {
        /*
         * moyen
         * créez une fonction qui prend un tableau en paramètre
         * et qui double toutes les valeurs de ce tableau
         * Vous pouvez utiliser la fonction créée à l'exercice 2
         * pour consulter les valeurs
         */
        System.out.println("Valeurs doublées :");
        int[] ptnDeTableau2 = {5,4,8,7,6,5,4,3};
        tableauDouble(ptnDeTableau2);
    }

    private static void tableauDouble(int[] monTableau2) {
        for (int element : monTableau2) {
            System.out.println(element * 2);
        }
    }


    private static void exercice4() {
        /*
         * corsé
         * Créez une fonction qui prend deux entiers en paramètre
         * et restitue la puissance de l'un par rapport à l'autre
         * Par exemple : puissance(5, 2) --> 5² = 25
         */
        System.out.println("Puissances :");
        System.out.println(puissance(5,3));
    }

    private static double puissance(double a, double b) {

        return Math.pow(a,b);
    }

    private static void exercice5() {

        /*
         * L'exercice ici consiste à créer un jeu de
         * Poule - Renard - Vipère
         *
         * Le programme tire au hasard la valeur "Poule",
         * "Renard" ou "Vipère" sans l'indiquer au joueur
         *
         * Le programme demande ensuite au joueur si il veut
         * jouer "Poule", "Renard" ou "Vipère"
         *
         * Le programme indique ensuite au joueur si
         * il a gagné, perdu ou bien égalité
         *
         * Pour rappel :
         *  - La Poule bat la Vipère
         *  - La Vipère bat le renard
         *  - Le Renard bat la Poule
         *
         *  (oui, ça fait beaucoup de "if" !)
         *
         *  Pour aller encore plus loin : proposez au joueur un petit menu pour rejouer !
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Veuillez choisir 1 pour commencer une partie, sinon entrez n'importe quel chiffre");
        int rejouer = s.nextInt();

        while (rejouer == 1) {
            comparerSaisies();
            System.out.println("Rechoisir 1 pour recommencer, choisissez un autre chiffre pour quitter...");
            rejouer = s.nextInt();

        }

        System.out.println("Mrc d'avoir joue");
        s.close();

    }

    //Permet de comparer les saisies pour déterminer un vainqueur
    private static void comparerSaisies(){
        int animalBot = demanderBot();
        int saisieUtilisateur = demanderSaisie();
        if (animalBot == saisieUtilisateur) {
            System.out.println("Egalite, va falloir recommencer !");
        } else if (saisieUtilisateur == 0) {
            if (animalBot == 2) {
                System.out.println("Vous avez perdu !");
            } else {
                System.out.println("Vous avez gagne !");
            }
        } else if (saisieUtilisateur == 1) {
            if (animalBot == 0) {
                System.out.println("Vous avez perdu !");
            } else {
                System.out.println("Vous avez gagne !");
            }
        } else if (saisieUtilisateur == 2) {
            if (animalBot == 1) {
                System.out.println("Vous avez perdu !");
            } else {
                System.out.println("Vous avez gagne !");
            }
        }
    }

    //Demander à l'ordi de generer un nombre entre 0 et 2
    private static int demanderBot() {
        Random random = new Random();
        int saiseBot = random.nextInt(1, 3) - 1;
        return saiseBot;
    }
    /**
     * Permet de demander à l'utilisateur de choisir entre la poule, le renard et la vipere
     * @return
     */
    private static int demanderSaisie() {
        Scanner s = new Scanner(System.in);
        System.out.println("Voulez-vous jouer poule, renard ou vipere ?");
        System.out.println("1 correspond à poule, 2 à renard et 3 à vipere");
        int saisie = s.nextInt();
        saisie--;
        if(saisie == 0) {
            System.out.println("Vous avez choisi poule");
        } else if (saisie == 1) {
            System.out.println("Vous avez choisi renard");
        } else if (saisie == 2) {
            System.out.println("Vous avez choisi vipere");
        } else {
            System.err.println("Pas le bon chiffre");
        }

        return saisie;
    }

}
