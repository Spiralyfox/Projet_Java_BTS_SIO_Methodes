public class Voiture {

    String marque;
    String modele;
    int annee;
    String carburant;
    double prix;

    public void afficherDescription() {
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Année : " + annee);
        System.out.println("Prix : " + prix + " €");
    }

    public void appliquerReduction10() {
        prix = prix * 0.90;
        afficherDescription();
    }



    public Voiture(String marque, String modele, int annee, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
    }
}