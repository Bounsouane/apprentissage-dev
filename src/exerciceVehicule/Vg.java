package exerciceVehicule;

public class Vg extends Bateau{

    public Vg(String marque, int vitesseMax, double longueur) {
        super(marque, vitesseMax, longueur);
    }

    public String livrer(){
        String merch = "Marchandise sécurisée";
        return merch;
    }

    @Override
    public String toString() {
        return "Vg{"+ super.toString() +"}";
    }
}
