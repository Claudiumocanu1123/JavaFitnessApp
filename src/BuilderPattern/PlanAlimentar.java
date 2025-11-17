package BuilderPattern;

public class PlanAlimentar {
    String legume;
    String fructe;
    String protein;
    String salt;
    int pizza;
    int omleta;
    int gratar;
    int snitel;
    int piure;
    int ovaz;
    int desert;

    public static class Builder {
        String legume;
        String fructe;
        String protein;
        String salt;
        int pizza = 0;
        int omleta = 0;
        int gratar = 0;
        int snitel = 0;
        int piure = 0;
        int ovaz = 0;
        int desert = 0;

        public Builder(String legume, String fructe, String protein, String salt) {
            this.legume = legume;
            this.fructe = fructe;
            this.protein = protein;
            this.salt = salt;
        }

        public Builder pizza(int pizza) {
            this.pizza = pizza;
            return this;
        }

        public Builder omleta(int omleta) {
            this.omleta = omleta;
            return this;
        }

        public Builder gratar(int gratar) {
            this.gratar = gratar;
            return this;
        }

        public Builder snitel(int snitel) {
            this.snitel = snitel;
            return this;
        }

        public Builder piure(int piure) {
            this.piure = piure;
            return this;
        }

        public Builder ovaz(int ovaz) {
            this.ovaz = ovaz;
            return this;
        }

        public Builder desert(int desert) {
            this.desert = desert;
            return this;
        }

        public PlanAlimentar build() {
            return new PlanAlimentar(this);
        }

    }

    PlanAlimentar(Builder builder) {
        this.legume = builder.legume;
        this.fructe = builder.fructe;
        this.protein = builder.protein;
        this.salt = builder.salt;
        this.pizza = builder.pizza;
        this.omleta = builder.omleta;
        this.gratar = builder.gratar;
        this.snitel = builder.snitel;
        this.piure = builder.piure;
        this.ovaz = builder.ovaz;
        this.desert = builder.desert;
    }

    public String getLegume() {
        return legume;
    }

    public String getFructe() {
        return fructe;
    }

    public String getProtein() {
        return protein;
    }

    public String getSalt() {
        return salt;
    }
    public int getPizza() {
        return pizza;
    }
    public int getOmleta() {
        return omleta;
    }
    public int getGratar() {
        return gratar;
    }
    public int getSnitel() {
        return snitel;
    }
    public int getPiure() {
        return piure;
    }
    public int getOvaz() {
        return ovaz;
    }
    public int getDesert() {
        return desert;
    }
    public void setLegume(String legume) {
        this.legume = legume;
    }
    public void setFructe(String fructe) {
        this.fructe = fructe;
    }
    public void setProtein(String protein) {
        this.protein = protein;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public void setPizza(int pizza) {
        this.pizza = pizza;
    }
    public void setOmleta(int omleta) {
        this.omleta = omleta;
    }
    public void setGratar(int gratar) {
        this.gratar = gratar;
    }
    public void setSnitel(int snitel) {
        this.snitel = snitel;
    }
    public void setPiure(int piure) {
        this.piure = piure;
    }
    public void setOvaz(int ovaz) {
        this.ovaz = ovaz;
    }
    public void setDesert(int desert) {
        this.desert = desert;
    }
    public String toString() {
        return "PlanAlimentar [legume=" + legume + ", fructe=" + fructe + ", protein=" + protein + ", salt=" +
                salt + ", pizza=" + pizza + ", omleta=" + omleta + ", gratar=" + gratar + ", snitel=" + snitel
                + ", piure=" + piure + ", ovaz=" + ovaz + ", desert=" + desert + "]";

    }

}

