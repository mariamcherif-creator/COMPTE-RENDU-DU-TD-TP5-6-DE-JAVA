public abstract class ObjetGraphique {
    protected int x;
    protected int y;
    
    
    public ObjetGraphique() {
        this.x = 0;
        this.y = 0;
    }
    
    public ObjetGraphique(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public ObjetGraphique(ObjetGraphique og) {
        this.x = og.x;
        this.y = og.y;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
    
    
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplacer(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public abstract void affiche();
}