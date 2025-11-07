package Workout;

public class Exercitiu {
    int greutate;
    int nrSerii;
    String numeExercitiu;
    int nrRepetari;
    String categorie;
    int durata;
    String intensitate;

    public Exercitiu() {
    }
    public Exercitiu(String numeExercitiu,int greutate,int nrSerii,int nrRepetari,String categorie,int durata,String intensitate)
    {
        this.greutate=greutate;
        this.nrSerii=nrSerii;
        this.numeExercitiu=numeExercitiu;
        this.nrRepetari=nrRepetari;
        this.categorie=categorie;
        this.durata=durata;
        this.intensitate=intensitate;
    }
    public int getGreutate() {
        return greutate;
    }
    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    public int getNrSerii() {
        return nrSerii;
    }
    public void setNrSerii(int nrSerii) {
        this.nrSerii = nrSerii;
    }
    public String getNumeExercitiu() {
        return numeExercitiu;
    }
    public void setNumeExercitiu(String numeExercitiu) {
        this.numeExercitiu = numeExercitiu;
    }
    public int getNrRepetari() {
        return nrRepetari;
    }
    public void setNrRepetari(int nrRepetari) {
        this.nrRepetari = nrRepetari;
    }
    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }
    public String getIntensitate() {
        return intensitate;
    }
    public void setIntensitate(String intensitate) {
        this.intensitate = intensitate;
    }
    public void afiseazaExercitiu()
    {
        System.out.println("Numele exercitiului este:" + numeExercitiu + " Greutate: " + greutate + " NrSerii: " + nrSerii +  " numarul repetarilor: " + nrRepetari + " categorie: " + categorie + " durata: " + durata + " intensitate: " + intensitate);
    }


}
