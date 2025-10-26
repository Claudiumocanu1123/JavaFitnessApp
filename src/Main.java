import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Utilizator utilizator = new Utilizator("mocanuclaudiu11","Mamatata1",86,182,20,3,100,1000);
        Utilizator utilizator1 = new Utilizator(null,null,84,180,18,1,110,990);
        Utilizator utilizator3 = new Utilizator("afrasineimario12","Comstarvaslui2005",75,188,19,3,111,994);
        Utilizator utilizator4 = new Utilizator("andronic12","Comstarvaslui2004",70,189,20,6,130,890);

        System.out.println("==================================================================");
        System.out.println(">>> AUTENTIFICARE UTILIZATORI");
        System.out.println("==================================================================");
        utilizator.autentificare();
        utilizator1.autentificare();
        utilizator3.autentificare();
        utilizator4.autentificare();

        System.out.println("\n==================================================================");
        System.out.println(">>> CALCULARE GREUTATE IDEALĂ");
        System.out.println("==================================================================");
        utilizator.calculareGreutateIdeala();
        utilizator1.calculareGreutateIdeala();
        utilizator3.calculareGreutateIdeala();
        utilizator4.calculareGreutateIdeala();

        System.out.println("\n==================================================================");
        System.out.println(">>> EVALUARE UTILIZATORI");
        System.out.println("==================================================================");
        utilizator.evaluareUtilizator();
        utilizator1.evaluareUtilizator();
        utilizator3.evaluareUtilizator();
        utilizator4.evaluareUtilizator();

        System.out.println("\n==================================================================");
        System.out.println(">>> STATISTICI UTILIZATORI");
        System.out.println("==================================================================");
        Statistici stats = new Statistici("mocanuclaudiu11","Mamatata1",86,182,20,3,100,1000,1,83,100);
        Statistici stats1 = new Statistici(null,null,86,180,18,1,100,990,11,75,90);
        Statistici stats2 = new Statistici("afrasineimario12","Comstarvaslui2005",75,188,19,3,111,994,10,74,78);
        Statistici stats3 = new Statistici("andronic12","Comstarvaslui2004",70,189,20,6,130,890,16,54,150);

        ArrayList<Statistici> statistics = new ArrayList<Statistici>();
        System.out.println("Rangul utilizatorilor care au tras cel mai tare de fiare si au dat jos cele mai multe calorii este:");
        System.out.println("------------------------------------------------------------------");
        statistics.add(stats);
        statistics.add(stats1);
        statistics.add(stats2);
        statistics.add(stats3);
        Collections.sort(statistics);
        for (Statistici s : statistics) {
            System.out.println(s.toString());
        }

        System.out.println("\n==================================================================");
        System.out.println(">>> NIVEL ATLET NOU");
        System.out.println("==================================================================");
        stats.nivelAtletNou();
        stats1.nivelAtletNou();
        stats2.nivelAtletNou();
        stats3.nivelAtletNou();

        System.out.println("\n==================================================================");
        System.out.println(">>> TIMP DE MUNCĂ SĂPTĂMÂNAL");
        System.out.println("==================================================================");
        stats.timpDeMuncaSaptamanal();
        stats1.timpDeMuncaSaptamanal();
        stats3.timpDeMuncaSaptamanal();
        stats2.timpDeMuncaSaptamanal();

        System.out.println("\n==================================================================");
        System.out.println(">>> EVALUARE CU PATRONUL VISITOR");
        System.out.println("==================================================================");
        List<Utilizator> utilizators1 = new LinkedList<Utilizator>();
        utilizators1.add(utilizator);
        utilizators1.add(utilizator1);
        utilizators1.add(utilizator3);
        utilizators1.add(utilizator4);
        List<Statistici> statisticile1 = new LinkedList<Statistici>();
        statisticile1.add(stats);
        statisticile1.add(stats1);
        statisticile1.add(stats2);
        statisticile1.add(stats3);
        Visitor v = new EvaluareVizitator();
        for(Utilizator u : utilizators1) {
            u.accept(v);
        }
        for(Statistici s : statistics) {
            s.accept(v);
        }

        System.out.println("\n==================================================================");
        System.out.println(">>> PROGRAM FINALIZAT CU SUCCES");
        System.out.println("==================================================================");
    }
}
