package exerciceTempsCuisson;

public interface InterfaceCuisson {

    /**
     * Méthode permettant de demander le poids de la viande en grammes
     * @return
     */
    public int demanderPoids();

    /**
     * Méthode permettant de demander le type de viande entre le boeuf, le porc et le canard
     * @return
     */
    public int demanderType();
}
