public class Gryffindorstudent extends Hogwarts {
    //Всем Гриффиндорцам присущи благородство(nobility), честь(honor) и храбрость(bravery)
  private int nobility;
  private  int honor;
  private  int bravery;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    private int ability() {
        return nobility + honor + bravery;
    }

    public Gryffindorstudent(String name, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }
    public void compareGriffindor(Gryffindorstudent gryffindorstudent){
        int ability1 = ability();
        int ability2 = gryffindorstudent.ability();
        if (ability1>ability2){

            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n",    getName(), gryffindorstudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n",    gryffindorstudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Слизеринец %s такой же, как слизеринец %s: %d VS %d%n", gryffindorstudent.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return (" Имя : " +getName()+ "; сила магии на расстояние : " +getConjure()+ "; сила трасгрессии : количество баллов - " + getTransgress()+
                "; благородство " + getNobility() + "; честь : " + getHonor() + "; храбрость : " + getBravery());
    }
}
//Всем Гриффиндорцам присущи благородство(nobility), честь(honor) и храбрость(bravery)


