public class Hufflepuffstudent extends  Hogwarts {
    //cтуденты Пуффендуя трудолюбивы(industrious) верны(loyalty), честны(honest).
    private int industrious;
    private int loyalty;
    private int honest;
    public int getIndustrious() {
        return industrious;
    }
    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    public int getHonest() {
        return honest;
    }
    public void setHonest(int honest) {
        this.honest = honest;
    }
    private int ability() {
        return industrious + loyalty + honest;
    }
    public Hufflepuffstudent(String name, int conjure, int transgress, int industrious, int loyalty, int honest) {
        super(name, conjure, transgress);
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honest = honest;
    }
    public void compareHufflepuff(Hufflepuffstudent hufflepuffstudent) {
        int ability1 = ability();
        int ability2 = hufflepuffstudent.ability();
        if (ability1 > ability2) {

            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n", getName(), hufflepuffstudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n", hufflepuffstudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Пуффендуец %s такой же, как пуффендуец %s: %d VS %d%n", hufflepuffstudent.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return ( " Имя : " +getName()+ "; сила магии на расстояние : " +getConjure()+ "; сила трасгрессии : количество баллов - " + getTransgress()+
                "; трудолюбивы : " + getIndustrious() + " ;верны : " + getLoyalty() + "; честны : " + getHonest());
    }
} //cтуденты Пуффендуя трудолюбивы(industrious) верны(loyalty), честны(honest).







