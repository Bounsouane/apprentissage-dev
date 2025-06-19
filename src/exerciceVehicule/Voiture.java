package exerciceVehicule;

public class Voiture extends Vehicule{

    private int nombreDePortes;

    public Voiture( String marque,int vitesseMax, int nombreDePortes) {
        super(vitesseMax, marque);
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public String toString() {
        return "Voiture{" + super.toString() +
                "nombreDePortes=" + nombreDePortes +
                '}';
    }
}
