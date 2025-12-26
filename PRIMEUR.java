public class ArticlePrimeur extends Article implements VendableKilo {
    private double stock; // en kilogrammes
    
    public ArticlePrimeur(double prixAchat, double prixVente, 
                          String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }
    
    public void remplirStock(double quantite) {
        this.stock += quantite;
        System.out.println("Stock rempli de " + quantite + " kg. Stock total: " + stock + " kg");
    }
    
    @Override
    public double vendre(double quantite) {
        if (quantite <= stock) {
            stock -= quantite;
            double revenu = quantite * prixVente;
            System.out.println("Vente de " + quantite + " kg de " + nom + ". Revenu: " + revenu + " DH");
            return revenu;
        } else {
            System.out.println("Stock insuffisant pour " + nom + ". Stock disponible: " + stock + " kg");
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nStock: " + String.format("%.2f", stock) + " kg\nType: Primeur";
    }
    
    public double getStock() { return stock; }
}