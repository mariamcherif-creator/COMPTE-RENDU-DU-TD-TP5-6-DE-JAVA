public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String rue;
    protected String ville;
    protected static int nbPersonnes = 0;
    
    
    public Personne(String nom, String prenom, String rue, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        nbPersonnes++;
    }
    
    
    public String toString() {
        return nom + " " + prenom + " - " + rue + ", " + ville;
    }
    

    public abstract void ecrirePersonne();
    
    public static void nbPersonne() {
        System.out.println("Nombre total de personnes : " + nbPersonnes);
        System.out.println("Nombre de secrétaires : " + Secretaire.nbSecretaires());
        System.out.println("Nombre d'enseignants : " + Enseignant.nbEnseignants());
        System.out.println("Nombre d'étudiants : " + Etudiant.nbEtudiants());
    }
    
    public void modifierPersonne(String rue, String ville) {
        this.rue = rue;
        this.ville = ville;
        System.out.print("Adresse modifiée : ");
        this.ecrirePersonne();
    }
}