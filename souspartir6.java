public class ListeObjetGraphique {
    private ObjetGraphique[] liste;
    private int taille;
    private int index;
    
    public ListeObjetGraphique(int taille) {
        this.taille = taille;
        this.liste = new ObjetGraphique[taille];
        this.index = 0;
    }
    
    public void ajouter(ObjetGraphique f) {
        if (index < taille) {
            liste[index] = f;
            index++;
        } else {
            System.out.println("Liste pleine !");
        }
    }
    
    public void afficheObjetsGraphique() {
        for (int i = 0; i < index; i++) {
            liste[i].affiche();
        }
    }
}