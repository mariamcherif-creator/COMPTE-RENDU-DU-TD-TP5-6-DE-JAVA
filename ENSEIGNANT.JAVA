public class Enseignant extends Personne {
    private String specialite;
    private static int nbEnseignants = 0;
    
    public Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
        super(nom, prenom, rue, ville);
        this.specialite = specialite;
        nbEnseignants++;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Spécialité: " + specialite;
    }
    
    @Override
    public void ecrirePersonne() {
        System.out.println("Enseignant : " + this.toString());
    }
    
    public static int nbEnseignants() {
        return nbEnseignants;
    }
}