package VisitorPattern;

import StatsUtilizatori.Utilizator;
import StatsUtilizatori.Statistici;
import java.util.ArrayList;
import java.util.List;
public class EvaluareVizitator implements Visitor {

    public void visit(Utilizator utilizator) {
        double inaltimeMetri = utilizator.getinaltime()/100.0;
        int IMC = (int) (utilizator.getGreutate() / (inaltimeMetri * inaltimeMetri));
        System.out.println("Imc: " + IMC);
    }
    public void visit(Statistici statistics)
    {
        List<Statistici> statisti = new ArrayList<Statistici>();
        statisti.add(statistics);
        Statistici statistici1 = new Statistici("Claudiu","VASLUI",50,180,20,3,100,1100,5,10,100);
        int i = statistici1.getPrBP();
            if (statistics.getPrBP() > i) {
                i = statistics.getPrBP();
                System.out.println(statistics.getUsername() + " este atletul cu cel mai mare record la bench press din sala ");
            }


    }
}
