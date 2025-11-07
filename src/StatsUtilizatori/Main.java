package StatsUtilizatori;

import VisitorPattern.Visitor;
import VisitorPattern.EvaluareVizitator;
import StrategyPattern.PaymentStrategy;
import StrategyPattern.CardPayment;
import StrategyPattern.CashPayment;
import StrategyPattern.RevolutPayment;
import Workout.Exercitiu;
import Workout.PlanDeAntrenament;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String biceps = "\uD83D\uDCAA";

        Utilizator utilizator = new Utilizator("sofykiss","Comstarvaslui2005",86,182,20,0,100,1000);
        Utilizator utilizator1 = new Utilizator(null,null,84,180,18,1,110,990);
        Utilizator utilizator3 = new Utilizator("afrasineimario12","Comstarvaslui2005",75,188,19,3,111,994);
        Utilizator utilizator4 = new Utilizator("andronic12","Comstarvaslui2004",70,189,20,0,130,890);
        List<Utilizator> utilizators1 = new LinkedList<Utilizator>();
        utilizators1.add(utilizator);
        utilizators1.add(utilizator1);
        utilizators1.add(utilizator3);
        utilizators1.add(utilizator4);

        Exercitiu genoflexiuni = new Exercitiu("Genuflexiuni", 50, 4, 12, "Picioare", 10, "Medie");
        Exercitiu flotari = new Exercitiu("Flotari", 0, 3, 15, "Piept/Brate", 5, "Medie");
        Exercitiu abdomene = new Exercitiu("Abdomene", 0, 3, 20, "Abdomen", 7, "Medie");
        Exercitiu indreptari = new Exercitiu("Indreptari", 70, 4, 10, "Spate", 12, "Greu");
        Exercitiu tracțiuni = new Exercitiu("Tracțiuni", 0, 3, 8, "Spate/Brate", 6, "Greu");
        Exercitiu fandari = new Exercitiu("Fandari", 30, 3, 12, "Picioare", 8, "Medie");
        Exercitiu plank = new Exercitiu("Plank", 0, 3, 1, "Abdomen", 5, "Medie");
        Exercitiu sarituriCoarda = new Exercitiu("Sarituri cu coarda", 0, 3, 50, "Cardio", 5, "Usor");
        Exercitiu impinsBanca = new Exercitiu("Impins banca", 60, 4, 10, "Piept", 10, "Greu");
        Exercitiu fluturari = new Exercitiu("Fluturari la aparat", 30, 3, 12, "Piept", 8, "Medie");
        Exercitiu ramat = new Exercitiu("Ramat cu bara", 50, 4, 10, "Spate", 10, "Greu");
        Exercitiu presaPicioare = new Exercitiu("Presa picioare", 100, 4, 10, "Picioare", 10, "Greu");
        Exercitiu bicepsGantere = new Exercitiu("Flexii biceps gantere", 12, 3, 12, "Brate", 6, "Medie");
        Exercitiu tricepsScripete = new Exercitiu("Extensii triceps la scripete", 20, 3, 12, "Brate", 6, "Medie");
        PlanDeAntrenament fullBody = new PlanDeAntrenament("FullBody",31,1200,2);
        fullBody.adaugaExercitiu(genoflexiuni);
        fullBody.adaugaExercitiu(flotari);
        fullBody.adaugaExercitiu(abdomene);
        fullBody.adaugaExercitiu(indreptari);
        PlanDeAntrenament UpperBody = new PlanDeAntrenament("UpperBody",40,15000,5);
        UpperBody.adaugaExercitiu(impinsBanca);
        UpperBody.adaugaExercitiu(fluturari);
        UpperBody.adaugaExercitiu(ramat);
        UpperBody.adaugaExercitiu(bicepsGantere);
        UpperBody.adaugaExercitiu(tricepsScripete);
        UpperBody.adaugaExercitiu(plank);
        PlanDeAntrenament LowerBody = new PlanDeAntrenament("LowerBody",40,15000,5);
        LowerBody.adaugaExercitiu(sarituriCoarda);
        LowerBody.adaugaExercitiu(presaPicioare);
        LowerBody.adaugaExercitiu(fandari);
        LowerBody.adaugaExercitiu(genoflexiuni);
        PlanDeAntrenament Avansati = new PlanDeAntrenament("Avansati",365,150000,10);
        Avansati.adaugaExercitiu(tricepsScripete);
        Avansati.adaugaExercitiu(presaPicioare);
        Avansati.adaugaExercitiu(genoflexiuni);
        Avansati.adaugaExercitiu(fandari);
        Avansati.adaugaExercitiu(indreptari);
        Avansati.adaugaExercitiu(plank);

        System.out.println("==================================================================");
        System.out.println(">>> AUTENTIFICARE UTILIZATORI");
        System.out.println("==================================================================");
       for(int i = 0; i < utilizators1.size(); i++)
       {
           Utilizator u = utilizators1.get(i);
           if(u.autentificare())
           {
               u.giveTheExperience();
           }
           else
           {
               System.out.println("Sa trecem la urmatorul utilizator: ");
               continue;
           }
               if(u.getExperience() <= 0) {
                   System.out.println("O sa faceti patru zile pe saptamana urmatorul plan: ");
                   fullBody.afisarePlanDeAntrenament();
               } else if(u.getExperience() >= 1 && u.getExperience() <= 3)
               { System.out.println("Timp de patru zile pe saptamana o sa faceti prima si a trei -a zi: ");
                   UpperBody.afisarePlanDeAntrenament();
                   System.out.println("iar a doua si a patra-a zi ");
                   LowerBody.afisarePlanDeAntrenament();
               }
               else if(u.getExperience() > 3)
               {
                   System.out.println("Iata un plan de antrenament pentru avansati ");
                   Avansati.afisarePlanDeAntrenament();
               }
       }

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


        utilizator.setPaymentStrategy(new CardPayment());
        utilizator.executePayment(100.0);

        utilizator1.setPaymentStrategy(new CashPayment());
        utilizator1.executePayment(100.0);

        utilizator3.setPaymentStrategy(new RevolutPayment());
        utilizator3.executePayment(100.0);

    }
}
