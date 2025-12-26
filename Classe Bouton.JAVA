public class Bouton extends Rectangle {
    private String text;
    
    
    public Bouton() {
        super();
        this.text = "";
    }
    
    public Bouton(int x, int y, double largeur, double hauteur, String text) {
        super(x, y, largeur, hauteur);
        this.text = text;
    }
    
    public Bouton(Bouton b) {
        super(b.x, b.y, b.largeur, b.hauteur);
        this.text = b.text;
    }
    
    public void setText(String text) { this.text = text; }
    public String getText() { return text; }
    
    @Override
    public void affiche() {
        System.out.println("Bouton - Position: (" + x + ", " + y + 
                          "), Largeur: " + largeur + ", Hauteur: " + hauteur +
                          ", Texte: \"" + text + "\"");
    }
}