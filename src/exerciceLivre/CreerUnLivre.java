package exerciceLivre;

public class CreerUnLivre {
    public static void main(String[] args) {
        /*
         * Créez la classe Livre. Un Livre est caractérisé par :
         *  - un titre (String)
         *  - un nombre de page (int)
         *  - un tableau de pages (String[])
         *
         * Lors de l'instanciation, le tableau de page doit être créé avec le bon nombre de page (!)
         *
         * Un Livre dispose des méthodes suivantes :
         *  - ajouterPage(String) : void --> ajoute une page au Livre (vous pouvez vous inspirer des ajouterCreneau, en plus facile)
         *  - consulterPage(int) : String --> retourne le texte de la page d'index passé en paramètre
         *  - toString() --> retourne l'intégralité des informations du livre
         *
         *  Instanciez ensuite un livre, ajoutez-y des pages avant de le lire
         *  (si vous n'avez pas d'inspiration pour le texte, je vous invite à regarder ce qu'est un lorem ipsum)
         */

        Livre biographie = new Livre("La vie d'arthur", 4);

        biographie.ajouterPage("Arthur,\noui on parle du même...");
        biographie.ajouterPage("Cet homme, qui fait transparaitre une tonne de qualités et de défauts");
        biographie.ajouterPage("que l'on considère parfois comme \"beau\" malgré des irrégularitées fortement présentes");
        biographie.ajouterPage("\net qui possède une musculature pouvant faire des envieux, a décidé de passer ses journées sur Assassin's Creed alors qu'il est nul au jeu..." + System.lineSeparator()+ "En plus d'avoir obtenu le jeu à l'aide méthodes ne se conformant pas à tt ce qui est lié à quoi que ce soit de religieux");

        System.out.println(biographie.toString());
    }
}
