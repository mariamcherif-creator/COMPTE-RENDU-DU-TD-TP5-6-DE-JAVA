public class ArticleElectromenager extends Article implements VendablePiece, Solde {
    private int stock;
    
   
    public ArticleElectromenager(double prixAchat, double prixVente, 
                                 String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }
    
    public void remplirStock(int quantite) {
        this.stock += quantite;
        System.out.println("Stock rempli de " + quantite + " pièces. Stock total: " + stock);
    }
    
    @Override
    public double vendre(double quantite) {
        int quantiteInt = (int) quantite;
        if (quantiteInt <= stock) {
            stock -= quantiteInt;
            double revenu = quantiteInt * prixVente;
            System.out.println("Vente de " + quantiteInt + " " + nom + ". Revenu: " + revenu + " DH");
            return revenu;
        } else {
            System.out.println("Stock insuffisant pour " + nom + ". Stock disponible: " + stock);
            return 0;
        }
    }
    
    @Override
    public void lanceSolde(double pourcentage) {
        double reduction = prixVente * (pourcentage / 100);
        prixVente -= reduction;
        System.out.println(nom + " en solde: -" + pourcentage + "%. Nouveau prix: " + prixVente + " DH");
    }
    
    @Override
    public void termineSolde(double pourcentage) {
        double augmentation = prixVente * (pourcentage / 100);
        prixVente += augmentation;
        System.out.println("Fin de solde pour " + nom + ". Nouveau prix: " + prixVente + " DH");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nStock: " + stock + " pièces\nType: Électroménager";
    }
    
    public int getStock() { return stock; }
}