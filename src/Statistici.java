import java.util.ArrayList;

public class Statistici extends Utilizator implements Comparable<Utilizator> {

    int timpDeMuncaZi;
    int kilogrameNoi;
    int PrBP;


    public Statistici(String username, String password, int greutate, int inaltime, int varsta, int experience, int caloriiArseSaptamanal, int caloriiArseLunar, int timpDeMunca, int kilogrameNoi,int PrBP) {
        super(username, password, greutate, inaltime, varsta, experience, caloriiArseSaptamanal, caloriiArseLunar);

        this.timpDeMuncaZi = timpDeMunca;
        this.kilogrameNoi = kilogrameNoi;
        this.PrBP = PrBP;
    }
    public int getPrBP() {
        return PrBP;
    }
    public void setPrBP(int PrBP) {
        this.PrBP = PrBP;
    }
    public int getTimpDeMunca() {
        return timpDeMuncaZi;
    }

    public void setTimpDeMunca(int timpDeMunca) {
        this.timpDeMuncaZi = timpDeMunca;
    }

    public int getKilogrameNoi() {
        return kilogrameNoi;
    }

    public void setKilogrameNoi(int kilogrameNoi) {
        this.kilogrameNoi = kilogrameNoi;
    }

    public int compareTo(Utilizator o) {
        if (this.caloriiArseSaptamanal == o.caloriiArseSaptamanal) {
            return Integer.valueOf(this.caloriiArseLunar)
                    .compareTo(o.caloriiArseLunar);
        }
            else{
                return Integer.valueOf(this.caloriiArseSaptamanal)
                        .compareTo(o.caloriiArseSaptamanal);
            }
    }
    public String nivelAtletNou() {
        if(this.getGreutate() - kilogrameNoi > 15)
            System.out.println("Atletul este la nivelul cinci");
        else if (this.getGreutate() - kilogrameNoi > 10)
            System.out.println("Atletul este la nivelul trei");
        else if(this.getGreutate() - kilogrameNoi < 5)
            System.out.println("Atletul este la nivelul doi");
        return "Atletul este la nivelul unu";
    }
    public int timpDeMuncaSaptamanal()
    {
        if(timpDeMuncaZi * 7 >= 14) {
            System.out.println("Trebuie sa iei o pauza sportivule");
        }
        else if (timpDeMuncaZi * 7 <= 14)
            System.out.println("Du te la sala lenesule");
        return timpDeMuncaZi * 7;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
