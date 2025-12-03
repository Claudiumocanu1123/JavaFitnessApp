package StatsUtilizatori;

import StrategyPattern.PaymentStrategy;
import VisitorPattern.Visitable;
import VisitorPattern.Visitor;

import java.util.Scanner;

public class Utilizator implements Visitable {

    String biceps = "\uD83D\uDCAA";
    String sad = "😞";
    String username;
    String password;
    String name;
    String surname;
    String motherName;
    String fatherName;
    int greutate;
    int inaltime;
    int varsta;
    int experience;
    int caloriiArseLunar;
    int caloriiArseSaptamanal;
    private PaymentStrategy paymentStrategy;

    public Utilizator(String username, String password, int greutate, int inaltime, int varsta, int experience, int caloriiArseSaptamanal, int caloriiArseLunar) {
        this.username = username;
        this.password = password;
        this.greutate = greutate;
        this.inaltime = inaltime;
        this.varsta = varsta;
        this.experience = experience;
        this.caloriiArseLunar = caloriiArseLunar;
        this.caloriiArseSaptamanal = caloriiArseSaptamanal;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public int getinaltime() {
        return inaltime;
    }

    public void setinaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getCaloriiArseLunar() {
        return caloriiArseLunar;
    }

    public void setCaloriiArseLunar(int caloriiArseLunar) {
        this.caloriiArseLunar = caloriiArseLunar;
    }

    public int getCaloriiArseSaptamanal() {
        return caloriiArseSaptamanal;
    }

    public void setCaloriiArseSaptamanal(int caloriiArseSaptamanal) {
        this.caloriiArseSaptamanal = caloriiArseSaptamanal;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("nu a fosu utilizata nicio metoda de plata");
        }
        paymentStrategy.pay(amount);
    }

    public String toString() {
        return username;
    }

    public boolean autentificare() {
        if (this.username == null || this.password == null) {
            username = this.creareUsername();
            password = this.crearePassword();
            System.out.println("Cont creat: " + username + " " + password);
            return true;
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            if (username.equals(this.username) && password.equals(this.password)) {
                System.out.println("Autentificarea a reusit sportivule hai sa i dam drumu la treaba " + biceps);
                return true;
            } else {
                System.out.println("Autentificarea nu a reusit te rog sa mai incerci inca o data: ");
                System.out.print("Username: ");
                String username1 = sc.nextLine();
                System.out.print("Password: ");
                String password1 = sc.nextLine();
                if (username1.equals(this.username) && password1.equals(this.password)) {
                    System.out.println("Autentificarea a reusit sportivule hai sa i dam drumu la treaba " + biceps);
                    return true;
                } else {
                    System.out.println("Din pacate autentificarea ta nu reuseste te rog sa revii " + sad + biceps);
                    return false;
                }
            }
        }
    }

    String creareUsername() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Username nou: ");
        String username = sc.nextLine();

        return username;
    }

    String crearePassword() {
        System.out.print("Password nou: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.print("Am salvat noul tau cont cu succes si acesta este: ");
        return password;
    }

    void calculareGreutateIdeala() {
        int greatest = 0;
        greatest = this.inaltime - 112;
        System.out.print("Greutate noul tau cont cu succes: " + greatest + "\n");
    }

    public void evaluareUtilizator() {
        if (greutate >= 85 && greutate <= 100) {
            System.out.println("Recenzia acestui utilizator este de o stea" + "\n");
        } else if (greutate >= 80 && greutate <= 90) {
            System.out.println("Recenzia acestui utilizator este de doua stele" + "\n");
        } else if (greutate >= 75 && greutate <= 85) {
            System.out.println("Recenzia acestui utilizator este de trei stele" + "\n");
        } else if (greutate >= 72 && greutate <= 75) {
            System.out.println("recenzia acestui utilizator este de patru stele" + "\n");
        } else
            System.out.println("Utilizatorul nu poate primi recenzie");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void giveTheExperience() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Felictari ati trecut de primul pas ati intrat in cont, acum imi puteti spune experienta" +
                " dumneavoastra pentru a va crea planul de antrenament: ");
        int experience1 = sc.nextInt();
        if (experience1 == this.experience) {
            System.out.println("Planul alimentar si planul de antrenament pentru experienta dumneavosatra de "
                    + getExperience() + ": ");
        }
    }
}

