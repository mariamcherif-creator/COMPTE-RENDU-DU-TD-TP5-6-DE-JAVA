public class Magasin {
    private double depense;
    private double revenu;
    private ArticleElectromenager[] electromenagers;
    private ArticlePrimeur[] primeurs;
    private int nbElectromenagers;
    private int nbPrimeurs;
    

    public Magasin(int maxElectromenagers, int maxPrimeurs) {
        this.depense = 0;
        this.revenu = 0;
        this.electromenagers = new ArticleElectromenager[maxElectromenagers];
        this.primeurs = new ArticlePrimeur[maxPrimeurs];
        this.nbElectromenagers = 0;
        this.nbPrimeurs = 0;
    }
    

    public void ajouterElectromenager(ArticleElectromenager article) {
        if (nbElectromenagers < electromenagers.length) {
            electromenagers[nbElectromenagers] = article;
            nbElectromenagers++;
            
            depense += article.getPrixVente() * 0; // Prix d'achat, pas de stock initial
        }
    }
    
    public void ajouterPrimeur(ArticlePrimeur article) {
        if (nbPrimeurs < primeurs.length) {
            primeurs[nbPrimeurs] = article;
            nbPrimeurs++;
        }
    }
    
    public double rendement() {
        if (depense == 0) return 0;
        return ((revenu - depense) / depense) * 100;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== ÉTAT DU MAGASIN ===\n");
        sb.append("Dépenses totales: ").append(depense).append(" DH\n");
        sb.append("Revenus totaux: ").append(revenu).append(" DH\n");
        sb.append("Rendement: ").append(String.format("%.2f", rendement())).append("%\n\n");
        
        sb.append("Articles électroménagers:\n");
        for (int i = 0; i < nbElectromenagers; i++) {
            sb.append(electromenagers[i].toString()).append("\n---\n");
        }
        
        sb.append("\nArticles primeurs:\n");
        for (int i = 0; i < nbPrimeurs; i++) {
            sb.append(primeurs[i].toString()).append("\n---\n");
        }
        
        return sb.toString();
    }
    
    public void ajouterDepense(double montant) { depense += montant; }
    public void ajouterRevenu(double montant) { revenu += montant; }
}