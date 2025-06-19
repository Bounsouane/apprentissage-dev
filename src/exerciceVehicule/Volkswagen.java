package exerciceVehicule;

public class Volkswagen extends Voiture{

    public Volkswagen(String marque, int vitesseMax, int nombreDePortes) {
        super(marque, vitesseMax, nombreDePortes);
    }

    @Override
    public String toString() {
        return "Volkswagen{"+ super.toString() +"}";
    }
}
