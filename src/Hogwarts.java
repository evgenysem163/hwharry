public class Hogwarts {
    //Абсолютно все ученики школы Хогвартс умеют колдовать(conjure) с мощностью в сколько-то баллов и
    // могуттрансгрессировать(transgress)

    private String name;
    private int conjure;
    private int transgress;

    public Hogwarts(String name, int conjure, int transgress) {
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    private int ability() {
        return conjure + transgress;
    }
    public void print() {
        System.out.println(this);
    }


    public void compareHogwarts(Hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(),
                    hogwarts.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", hogwarts.getName(),
                    getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n", hogwarts.getName(),
                    getName(), ability1, ability2);
        }

    }
//    @Override
//    public String toString() {
//        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d", name, conjure,
//                transgress);

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", conjure=" + conjure +
                ", transgress=" + transgress +
                '}';
    }
}


