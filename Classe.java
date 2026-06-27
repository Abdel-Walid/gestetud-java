import java.util.ArrayList;
import java.util.List;

//une liste privée qui contient des objets de type Etudiant
public class ListeEtudiant{
    private List<Etudiant> liste;
}

//un constructeur qui initialise une liste vide
public ListeEtudiant(){
    this.liste = new ArrayList<>();
}
//une méthode pour ajouter un étudiant à la liste
public void ajouterEtudiant(Etudiant etudiant){
    this.liste.add(etudiant);
    System.out.println(etudiant.getNom()+" " + etudiant.getPrenom() + "a été ajouté");
}

//une méthode pour afficher les étudiants de la liste
public void afficherlisteEtudiant(){
    if (this.liste.isEmpty()){
        System.out.println("La liste est vide");
    }else{
        system.out.println("la liste des étudiants");
        for (Etudiant e : this.liste){
            System.out.println("Nom : "+ e.getNom() + ", Prénom : " + e.getPrenom() + ", Note : " + e.getNotes());
        }
    }

}




    