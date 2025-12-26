public class Cercle extends ObjetGraphique {
    private double rayon;
    
    public Cercle() {
        super();
        this.rayon = 0;
    }
    
    public Cercle(int x, int y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }
    
    public Cercle(Cercle c) {
        super(c.x, c.y);
        this.rayon = c.rayon;
    }
    
    public void setRayon(double rayon) { this.rayon = rayon; }
    public double getRayon() { return rayon; }
    
    @Override
    public void affiche() {
        System.out.println("Cercle - Centre: (" + x + ", " + y + 
                          "), Rayon: " + rayon);
    }
}