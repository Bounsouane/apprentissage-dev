package exerciceVehicule;

public class Moto extends Vehicule{

    private int cylindre;

    public Moto( String marque, int vitesseMax, int cylindre) {
        super(vitesseMax, marque);
        this.cylindre = cylindre;
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString() +
                "cylindre=" + cylindre +
                '}';
    }
}
