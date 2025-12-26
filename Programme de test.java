public class TestMagasin {
    public static void main(String[] args) {
        // Création du magasin
        Magasin magasin = new Magasin(10, 10);
        
        // Création des articles
        ArticleElectromenager frigo = new ArticleElectromenager(2500, 3000, "Réfrigérateur", "Samsung");
        ArticleElectromenager tv = new ArticleElectromenager(4000, 5000, "Télévision 55\"", "LG");
        ArticlePrimeur pommes = new ArticlePrimeur(8, 12, "Pommes Golden", "Ferme du Val");
        ArticlePrimeur tomates = new ArticlePrimeur(5, 9, "Tomates", "Maraîcher Bio");
        
        // Ajout au magasin
        magasin.ajouterElectromenager(frigo);
        magasin.ajouterElectromenager(tv);
        magasin.ajouterPrimeur(pommes);
        magasin.ajouterPrimeur(tomates);
        
        // Remplissage du stock
        System.out.println("=== REMPLISSAGE DU STOCK ===");
        frigo.remplirStock(10);
        tv.remplirStock(5);
        pommes.remplirStock(100);
        tomates.remplirStock(50);
        
        // Lancement d'une promotion
        System.out.println("\n=== PROMOTIONS ===");
        frigo.lanceSolde(10); // 10% de réduction
        
        // Ventes
        System.out.println("\n=== VENTES ===");
        double revenu1 = frigo.vendre(3);
        magasin.ajouterRevenu(revenu1);
        
        double revenu2 = tv.vendre(2);
        magasin.ajouterRevenu(revenu2);
        
        double revenu3 = pommes.vendre(25.5);
        magasin.ajouterRevenu(revenu3);
        
        double revenu4 = tomates.vendre(15.2);
        magasin.ajouterRevenu(revenu4);
        
        // Fin de la promotion
        System.out.println("\n=== FIN DE PROMOTION ===");
        frigo.termineSolde(11.11); // Retour au prix initial
        
        // Vente supplémentaire
        System.out.println("\n=== VENTE SUPPLEMENTAIRE ===");
        double revenu5 = frigo.vendre(2);
        magasin.ajouterRevenu(revenu5);
        
        // État du magasin
        System.out.println("\n=== ÉTAT FINAL DU MAGASIN ===");
        System.out.println(magasin);
        
        // Affichage détaillé des articles
        System.out.println("\n=== DÉTAIL DES ARTICLES ===");
        System.out.println(frigo);
        System.out.println("\n---\n");
        System.out.println(tv);
        System.out.println("\n---\n");
        System.out.println(pommes);
        System.out.println("\n---\n");
        System.out.println(tomates);
    }
}