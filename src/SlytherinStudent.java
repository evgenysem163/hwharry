public class SlytherinStudent extends  Hogwarts {
    // Слизерина присущи хитрость(cunning), решительность(determination), амбициозность(ambition),
    // находчивость(resourcefulness) и жажда власти(lustForPower).
    private int cunning;
    private int determination;
    private int ambition;
    private int resoursefullness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResoursefullness() {
        return resoursefullness;
    }

    public void setResoursefullness(int resoursefullness) {
        this.resoursefullness = resoursefullness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }



   private int ability() {
        return cunning + determination + ambition + resoursefullness + lustForPower;
    }


    public SlytherinStudent(String name, int conjure, int transgress, int cunning, int determination, int ambition, int resoursefullness,
                            int lustForPower) {
        super(name, conjure, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resoursefullness = resoursefullness;
        this.lustForPower = lustForPower;
    }
    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {

            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n",    getName(), slytherinStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n",    slytherinStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Слизеринец %s такой же, как слизеринец %s: %d VS %d%n", slytherinStudent.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return (" Имя :" + getName()+ "; сила магии на расстояние : " +getConjure()+ "; сила трасгрессии : количество баллов - "
                + getTransgress() + ": хитры : " + getCunning() + "; решительность : " +getDetermination()+ "; амбициозность : "
        + getAmbition() + "; находчивость : "+ getResoursefullness()+ "; жажда власти : " + getLustForPower());
    }
        }

// Слизерина присущи хитрость(cunning), решительность(determination), амбициозность(ambition),
// находчивость(resourcefulness) и жажда власти(lustForPower).



