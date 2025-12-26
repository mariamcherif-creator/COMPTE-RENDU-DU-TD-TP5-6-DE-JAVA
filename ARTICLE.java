public abstract class Article {
    protected double prixAchat;
    protected double prixVente;
    protected String nom;
    protected String fournisseur;
    
    public Article(double prixAchat, double prixVente, String nom, String fournisseur) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.nom = nom;
        this.fournisseur = fournisseur;
    }
    
    public double rendement() {
        if (prixAchat == 0) return 0;
        return ((prixVente - prixAchat) / prixAchat) * 100;
    }
    
    @Override
    public String toString() {
        return "Nom: " + nom + 
               "\nFournisseur: " + fournisseur +
               "\nPrix d'achat: " + prixAchat + " DH" +
               "\nPrix de vente: " + prixVente + " DH" +
               "\nRendement: " + String.format("%.2f", rendement()) + "%";
    }
    
    public double getPrixVente() { return prixVente; }
    public void setPrixVente(double prixVente) { this.prixVente = prixVente; }
}