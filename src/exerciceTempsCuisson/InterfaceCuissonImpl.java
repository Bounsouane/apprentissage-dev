package exerciceTempsCuisson;


import java.util.Scanner;

public class InterfaceCuissonImpl implements InterfaceCuisson {
    Scanner s = new Scanner(System.in);

    /**
     * @inheritDoc
     * @return
     */
    public int demanderPoids() {
        System.out.println("Saisissez le poids de votre viande en grammes");
        int poidsViandeChoisi = s.nextInt();
        s.nextLine();
        return poidsViandeChoisi;
    }

}

