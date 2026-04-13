public class Main {
    public static void main(String[] args) {

        /*
        String marque = "Peugeot";
        String modele = "208";
        long  annee = 2021;
        long  prix = 14500;

        System.out.println("Voiture | Marque : " + marque + " Modèle : " + modele + " Année : " + annee + " Prix : " + prix);
         */

        /*
        Voiture v1 = new Voiture();
        Voiture v2 = new Voiture();
        Voiture v3 = new Voiture();

        v1.marque = "Peugeot";
        v2.marque = "Renault";
        v3.marque = "Toyota";

        v1.modele = "208";
        v2.modele = "Clio";
        v3.modele = "Yaris";

        v1.annee = 2021;
        v2.annee = 2000;
        v3.annee = 2015;

        v1.prix = 14500;
        v2.prix = 3500;
        v3.prix = 9800;
         */

        // Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500);

        Pneu p1 = new Pneu(55, 205, 16, "été");
        Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500, p1);

    }
}