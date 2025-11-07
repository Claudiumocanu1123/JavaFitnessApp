package VisitorPattern;

import StatsUtilizatori.Utilizator;
import StatsUtilizatori.Statistici;

public interface Visitor {
    void visit(Utilizator utilizator);
    void visit(Statistici statistici);
}
