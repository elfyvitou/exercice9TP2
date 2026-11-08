
public class Main {

    public static void main(String[] args) {


        Cours java = new Cours("JAVA", "POO en Java", 40, 5, 3);
        Cours bdd = new Cours("BDD", "Bases de données", 30, 4, 2);
        Cours net = new Cours("NET", "Réseaux", 24, 3, 30);
        Etudiant salma = new Etudiant(1, "Salma");
        Etudiant youssef = new Etudiant(2, "Youssef");
        Etudiant amine = new Etudiant(3, "Amine");
        Etudiant nadia = new Etudiant(4, "Nadia");
        salma.inscrire(java);
        youssef.inscrire(java);
        amine.inscrire(java);
        nadia.inscrire(java);
        salma.inscrire(java);
        salma.inscrire(bdd);
        salma.inscrire(net);
        nadia.inscrire(bdd);
        nadia.inscrire(net);
        youssef.desinscrire(java);
        nadia.inscrire(java);
        salma.afficherCours();
        youssef.afficherCours();
        amine.afficherCours();
        nadia.afficherCours();
        java.afficherInscrits();
        bdd.afficherInscrits();
        net.afficherInscrits();
    }
}
