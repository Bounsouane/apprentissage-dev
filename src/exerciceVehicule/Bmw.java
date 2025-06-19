package exerciceVehicule;

public class Bmw extends Voiture {

    public Bmw( String marque,int vitesseMax, int nombreDePortes) {
        super(marque, vitesseMax, nombreDePortes);
    }

    @Override
    public String toString() {
        return "Bmw{"+ super.toString() +"}";
    }
}
