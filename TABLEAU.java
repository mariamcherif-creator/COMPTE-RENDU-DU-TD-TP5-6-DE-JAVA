public class TestObjetGraphique {
    public static void main(String[] args) {
        
        ObjetGraphique[] objets = new ObjetGraphique[5];
        
        objets[0] = new Cercle(10, 20, 5.5);
        objets[1] = new Rectangle(30, 40, 15.0, 10.0);
        objets[2] = new Bouton(50, 60, 20.0, 10.0, "Cliquez ici");
        objets[3] = new Cercle(100, 100, 8.0);
        objets[4] = new Rectangle(200, 200, 25.0, 15.0);
        
        System.out.println("=== Affichage des objets graphiques ===");
        for (ObjetGraphique og : objets) {
            og.affiche();
        }
        
        System.out.println("\n=== Test de ListeObjetGraphique ===");
        ListeObjetGraphique liste = new ListeObjetGraphique(10);
        
        liste.ajouter(new Cercle(5, 5, 3.0));
        liste.ajouter(new Rectangle(10, 10, 8.0, 4.0));
        liste.ajouter(new Bouton(15, 15, 12.0, 6.0, "OK"));
        liste.ajouter(new Cercle(20, 20, 4.0));
        
        liste.afficheObjetsGraphique();
        
        System.out.println("\n=== Test avec ArrayList ===");
        java.util.ArrayList<ObjetGraphique> arrayList = new java.util.ArrayList<>();
        
        arrayList.add(new Cercle(1, 1, 2.0));
        arrayList.add(new Rectangle(2, 2, 4.0, 3.0));
        arrayList.add(new Bouton(3, 3, 6.0, 4.0, "Annuler"));
        arrayList.add(new Cercle(4, 4, 3.0));
        arrayList.add(new Rectangle(5, 5, 7.0, 5.0));
        
        java.util.ListIterator<ObjetGraphique> iterator = arrayList.listIterator();
        while (iterator.hasNext()) {
            iterator.next().affiche();
        }
    }
}