
public class Etudiant {

    int numero;
    String nom;

    Cours[] cours;
    int nombreCours;

    public Etudiant(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
        cours = new Cours[5];
        nombreCours = 0;
    }


    boolean inscrire(Cours c) {
        if (c == null) {
            System.out.println("Cours null !");
            return false;
        }

        for (int i = 0; i < nombreCours; i++) {
            if (cours[i] == c) {
                System.out.println(nom + " est déjà inscrit.");
                return false;
            }
        }

        if (nombreCours >= 5) {
            System.out.println("Maximum 5 cours atteint !");
            return false;
        }

        if (c.getNombreInscrits() >= c.getCapaciteMax()) {
            System.out.println("Cours complet !");
            return false;
        }

        cours[nombreCours] = c;
        nombreCours++;

        c.ajouterEtudiant(this);

        System.out.println(nom + " inscrit à " + c.getCode());

        return true;
    }

    boolean desinscrire(Cours c) {
        if (c == null) {
            System.out.println("Cours null !");
            return false;
        }

        for (int i = 0; i < nombreCours; i++) {
            if (cours[i] == c) {
                for (int j = i; j < nombreCours - 1; j++) {
                    cours[j] = cours[j + 1];
                }
                nombreCours--;
                cours[nombreCours] = null;
                c.retirerEtudiant(this);
                System.out.println(nom + " désinscrit de " + c.getCode());
                return true;
            }
        }

        System.out.println("Cours non suivi !");
        return false;
    }
    void afficherCours() {
        int totalHeures = 0;
        int totalCredits = 0;
        System.out.println("\nÉtudiant : " + nom);
        for (int i = 0; i < nombreCours; i++) {
            System.out.println(cours[i].getCode());
            totalHeures += cours[i].getNombreHeures();
            totalCredits += cours[i].getCredits();
        }

        System.out.println("Nombre de cours : " + nombreCours);
        System.out.println("Total heures : " + totalHeures);
        System.out.println("Total crédits : " + totalCredits);
    }

    String getNom() {
        return nom;
    }
}
