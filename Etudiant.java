import java.util.ArrayList;
public class Etudiant{
    private String nom;
    private String prenom;
    private ArrayList<Double> notes;

    public Etudiant(String nom, String prenom){

        this.nom = nom;
        this.prenom = prenom;
        this.notes = new ArrayList<>();
    }

    public void ajouterNote(double note){
        this.notes.add(note);
    }

    //Getters

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public ArrayList<Double> getNotes(){
        return notes;
    }

    //une méthode pour calaculer la moyenne générale
    public double calculerMoyenneGenerale(){
    //si la liste est vide,moyenne=0
    if (this.notes.isEmpty()){
        return 0.0;
    }

    double somme = 0;

    //ici on parcourt la liste pour additionner toutes les notes
    for (double note : this.notes){
        somme += note;// ici on récupère la note de l'étudiant e
    }

    //ici on divise la somme totale par le nombre d'étudiants dans la liste
    return somme / this.notes.size();

    }

}