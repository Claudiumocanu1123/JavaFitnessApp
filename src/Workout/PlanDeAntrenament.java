package Workout;

import java.util.ArrayList;
import java.util.List;

public class PlanDeAntrenament
{
    int DurataZile;
    String NumePlan;
    int caloriiArse;
    int DificultyLevel;
    List<Exercitiu> PlanDeAntrenament = new ArrayList<Exercitiu>();

    public PlanDeAntrenament(String NumePlan,int DurataZile,int caloriiArse,int DificultyLevel)
    {
        this.NumePlan=NumePlan;
        this.DurataZile=DurataZile;
        this.caloriiArse = caloriiArse;
        this.DificultyLevel = DificultyLevel;
        this.PlanDeAntrenament = new ArrayList<>();
    }
    public void adaugaExercitiu(Exercitiu exercitiu)
    {
        PlanDeAntrenament.add(exercitiu);
    }
    public void afisarePlanDeAntrenament()
    {
        System.out.println(" Durata zile: " + DurataZile +" NumePlan: " + NumePlan + " caloriiArse: " + caloriiArse + " DificultyLevel: " + DificultyLevel );
        for(int i = 0; i < PlanDeAntrenament.size(); i++)
        {
            Exercitiu e = PlanDeAntrenament.get(i);
            e.afiseazaExercitiu();
        }
    }
}
