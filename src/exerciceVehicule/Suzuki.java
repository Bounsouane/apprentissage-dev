package exerciceVehicule;

public class Suzuki extends Moto{

    public Suzuki(String marque, int vitesseMax, int cylindre) {
        super(marque, vitesseMax, cylindre);
    }

    @Override
    public String toString() {
        return "Suzuki{"+ super.toString() +"}";
    }
}
