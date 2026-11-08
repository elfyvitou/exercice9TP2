
public class Cours {

    String code;
    String intitule;
    int nombreHeures;
    int credits;
    int capaciteMax;
    Etudiant[] inscrits;
    int nombreInscrits;

    public Cours(String code, String intitule, int heures, int credits, int capacite) {
        this.code = code;
        this.intitule = intitule;
        this.nombreHeures = heures;
        this.credits = credits;
        this.capaciteMax = capacite;
        inscrits = new Etudiant[capacite];
        nombreInscrits = 0;
    }


    boolean ajouterEtudiant(Etudiant e) {
        if (nombreInscrits >= capaciteMax) {
            return false;
        }
        inscrits[nombreInscrits] = e;
        nombreInscrits++;
        return true;
    }


    boolean retirerEtudiant(Etudiant e) {
        for (int i = 0; i < nombreInscrits; i++) {

            if (inscrits[i] == e) {

                for (int j = i; j < nombreInscrits - 1; j++) {
                    inscrits[j] = inscrits[j + 1];
                }
                nombreInscrits--;
                inscrits[nombreInscrits] = null;
                return true;
            }
        }
        return false;
    }


    void afficherInscrits() {
        System.out.println("\nCours : " + code);
        for (int i = 0; i < nombreInscrits; i++) {
            System.out.println(inscrits[i].getNom());
        }
        double taux = nombreInscrits * 100.0 / capaciteMax;
        System.out.println("Nombre inscrits : " + nombreInscrits);
        System.out.println("Taux de remplissage : " + taux + "%");
    }

    // Getters
    int getNombreHeures() {
        return nombreHeures;
    }

    int getCredits() {
        return credits;
    }

    int getNombreInscrits() {
        return nombreInscrits;
    }

    int getCapaciteMax() {
        return capaciteMax;
    }

    String getCode() {
        return code;
    }
}
