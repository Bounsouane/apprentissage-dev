package exerciceVehicule;

public class Vehicule {

    private String marque;
    private int vitesseMax;
    private String pImmatriculation;

    public Vehicule(int vitesseMax,String marque) {
        this.vitesseMax = vitesseMax;
        this.pImmatriculation = pImmatriculation;
        this.marque = marque;
    }

    public String classerVitesse() {
        if(vitesseMax < 100) {
            return "Véhicule lent";
        }else if(vitesseMax >= 100 && vitesseMax <= 180) {
            return "Véhicule moyen";
        }else {
            return "Véhicule rapide";
        }
    }

    public void setPlaque(String saisie){
        saisie = saisie.toUpperCase();
        saisie = saisie.substring(0,8);
        StringBuilder formattee = new StringBuilder();
        for (int i = 0; i < saisie.length(); i++) {
            if (i > 0 && i % 2 == 0) {
                formattee.append("-");
            }
            formattee.append(saisie.charAt(i));
        }
        this.pImmatriculation = formattee.toString();
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "vitesseMax=" + vitesseMax +
                ", pImmatriculation='" + pImmatriculation + '\'' +
                ", marque='" + marque + '\'' +
                '}';
    }
}
