
// Interface commune pour tous les vendables
interface Vendable {
    double vendre(double quantite);
}

// Interface pour les produits vendus au kilo
interface VendableKilo extends Vendable {
    // Méthode vendre déjà définie dans Vendable
}

// Interface pour les produits vendus à la pièce
interface VendablePiece extends Vendable {
    // Méthode vendre déjà définie dans Vendable
}

// Interface pour les produits en solde
interface Solde {
    void lanceSolde(double pourcentage);
    void termineSolde(double pourcentage);
}