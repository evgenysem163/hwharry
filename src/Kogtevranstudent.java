public class Kogtevranstudent extends  Hogwarts {
    //Когтевранцы умны(smart), мудры(wise), остроумны(witty) и полны творчества( fullOfCreativity).
    private  int smart;
    private  int wise;
    private  int witty;
    private int fullOfCreativity;

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
    private  int ability(){
        return smart + wise + witty + fullOfCreativity;
    }

    public Kogtevranstudent(String name, int smart, int wise, int witty, int fullOfCreativity,
                            int conjure, int transgress) {
        super(name, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }
        public void compareKogtevran(Kogtevranstudent kogtevranstuden) {
            int ability1 = ability();
            int ability2 = kogtevranstuden.ability();
            if (ability1 > ability2) {
                System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", getName(), kogtevranstuden.getName(), ability1, ability2);
            } else if (ability2 > ability1) {
                System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", kogtevranstuden.getName(), getName(), ability2, ability1);
            } else {
                System.out.printf("Когтевранец %s такой же, как когтевранец %s: %d VS %d%n", kogtevranstuden.getName(), getName(), ability1, ability2);
            }
        }

    @Override
    public String toString() {
        return (" Имя : " +getName()+ "; сила магии на расстояние : " +getConjure()+ "; сила трасгрессии : количество баллов - "
                + getTransgress() + "; умны : " + getSmart() + "; мудры : " + getWise() + "; остроумны : "
                + getWitty() + "; полны творчества ; " + getFullOfCreativity());
    }
}
//Когтевранцы умны(smart), мудры(wise), остроумны(witty) и полны творчества( fullOfCreativity).




