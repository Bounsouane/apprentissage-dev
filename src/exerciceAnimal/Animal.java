package exerciceAnimal;

public abstract class Animal {

    private String nom;
    private int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void afficherInfos(){
        System.out.println("C'est un "+ nom + "age de "+ age + " ans !");
    }
}
