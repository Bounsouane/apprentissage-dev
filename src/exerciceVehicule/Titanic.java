package exerciceVehicule;

public class Titanic extends Bateau{
    public Titanic(String marque, int vitesseMax, double longueur) {
        super(marque, vitesseMax,longueur);
    }

    public String couler(){
        String diCaprio = "La porte du bateau ne m'empêchera pas de couler.";
        return diCaprio;
    }

    @Override
    public String toString() {
        return "Titanic{"+ super.toString() +"}";
    }
}
