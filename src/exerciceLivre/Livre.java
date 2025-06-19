package exerciceLivre;

import java.util.Arrays;

public class Livre {

    private String titre;
    private int nbPages;
    private String[] tableauPages;
    private int index = 0;

    //Constructeur, permet d'instancier un livre
    public Livre(String titre, int nbPages) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.tableauPages = new String[nbPages];
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String[] getTableauPages() {
        return tableauPages;
    }

    public void setTableauPages(String[] tableauPages) {
        this.tableauPages = tableauPages;
    }

    public void ajouterPage(String page){
        tableauPages[index] = page;
        index++;
    }

    public String consulterPage(int numero) {
        return this.tableauPages[numero];
    }

    @Override
    public String toString() {
        return  titre +
                "\n" + Arrays.toString(tableauPages);
    }
}
