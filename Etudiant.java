public class Etudiant{
    private String nom;
    private String prenom;
    private double notes;

    public Etudiant(String nom, String prenom, double notes){

        this.nom = nom;
        this.prenom = prenom;
        this.notes = notes;
    }

    //Getters

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public double getNotes(){
        return notes;
    }

}