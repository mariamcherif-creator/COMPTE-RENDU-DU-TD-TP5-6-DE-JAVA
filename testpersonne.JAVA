public class TestPersonne {
    public static void main(String[] args) {
        
        Secretaire s = new Secretaire("Said", "Abidi", "Rue Elamal", "Casablanca", "A123");
        s.ecrirePersonne();
        
        Enseignant e = new Enseignant("Ahmed", "Shihi", "Rue Bel Air", "Fès", "Informatique");
        e.ecrirePersonne();
        
        Etudiant e1 = new Etudiant("Samir", "Merras", "rue saules", "Oujda", "licence informatique");
        Etudiant e2 = new Etudiant("Hamid", "Nissani", "rue d'olivier", "Taza", "DUT informatique");
        e2.ecrirePersonne();
        
        System.out.println("\n--- Modification des adresses ---");
        e.modifierPersonne("rue du grenadier", "Rabat");
        s.modifierPersonne("rue Taounat", "Safi");
        
        
        System.out.println("\n--- Statistiques ---");
        Personne.nbPersonne();
        
        System.out.println("\n--- Après modification ---");
        e.ecrirePersonne();
        s.ecrirePersonne();
        
        System.out.println("\n--- Création d'autres objets ---");
        Secretaire s2 = new Secretaire("Fatima", "Zohra", "Rue Atlas", "Marrakech", "B456");
        Enseignant e3 = new Enseignant("Karim", "Alami", "Rue Medina", "Tanger", "Mathématiques");
        Etudiant e4 = new Etudiant("Leila", "Mansouri", "Avenue Hassan II", "Rabat", "Master en Physique");
        
        s2.ecrirePersonne();
        e3.ecrirePersonne();
        e4.ecrirePersonne();
        
        System.out.println("\n--- Statistiques finales ---");
        Personne.nbPersonne();
    }
}