public class Rectangle extends ObjetGraphique {
    protected double largeur;
    protected double hauteur;
    
    public Rectangle() {
        super();
        this.largeur = 0;
        this.hauteur = 0;
    }
    
    public Rectangle(int x, int y, double largeur, double hauteur) {
        super(x, y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    public Rectangle(Rectangle r) {
        super(r.x, r.y);
        this.largeur = r.largeur;
        this.hauteur = r.hauteur;
    }
    
    public double getHauteur() { return hauteur; }
    public double getLargeur() { return largeur; }
    
    public void setObjetGraphique(int x, int y, double largeur, double hauteur) {
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    public void setTaille(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    @Override
    public void affiche() {
        System.out.println("Rectangle - Position: (" + x + ", " + y + 
                          "), Largeur: " + largeur + ", Hauteur: " + hauteur);
    }
}