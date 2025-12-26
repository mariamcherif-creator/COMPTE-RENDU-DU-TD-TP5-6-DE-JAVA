public class Etudiant extends Personne {
    private String diplomeEnCours;
    private static int nbEtudiants = 0;
    
    public Etudiant(String nom, String prenom, String rue, String ville, String diplomeEnCours) {
        super(nom, prenom, rue, ville);
        this.diplomeEnCours = diplomeEnCours;
        nbEtudiants++;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Diplôme en cours: " + diplomeEnCours;
    }
    
    @Override
    public void ecrirePersonne() {
        System.out.println("Étudiant : " + this.toString());
    }
    
    public static int nbEtudiants() {
        return nbEtudiants;
    }
}