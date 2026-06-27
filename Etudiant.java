import java.util.ArrayList;
public class Etudiant{
    private String nom;
    private String prenom;
    private ArrayList<Double> notes;
    
    public Etudiant (String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new ArrayList<>();
    }

    public String attribuerMention(){
        double moyenne = 15.0;
        if (moyenne >= 16) return "Très Bien";
        else if (moyenne >= 14) return "Bien";
        else if (moyenne >=12) return "Assez Bien";
        else if (moyenne >=10) return "Passable";
        else return "Ajourné"
        
    }
}