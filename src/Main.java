import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Gryffindorstudent harry = generateGryffindorStudent("Гарри Поттер");
        Gryffindorstudent ron = generateGryffindorStudent("Рон Уизли");
        Gryffindorstudent hermione = generateGryffindorStudent("Гермиона Грейнджер");
        Kogtevranstudent marcus = generateKogtevranstudent("Маркус Белби");
        Kogtevranstudent padma = generateKogtevranstudent("Падма Патил");
        Kogtevranstudent chang = generateKogtevranstudent("Чжоу Чанг");
        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent graham= generateSlytherinStudent(" Грэхэм Монтегю");
        SlytherinStudent gregory = generateSlytherinStudent("Грегори Гойл");
        Hufflepuffstudent zacharias = generateHufflepuffStudent("Захария Смит");
        Hufflepuffstudent justin  = generateHufflepuffStudent("Седрик Диггори");
        Hufflepuffstudent cedric = generateHufflepuffStudent("Джастин Финч-Флетчли");

        harry.print();
        ron.print();
        hermione.print();
        System.out.println();
        marcus.print();
        padma.print();
        chang.print();
        System.out.println();
        draco.print();
        graham.print();
        gregory.print();
        System.out.println();
        zacharias.print();
        justin.print();
        cedric.print();
        System.out.println();
        harry.compareHogwarts(draco);
        harry.compareGriffindor(ron);
    }

    private static Gryffindorstudent generateGryffindorStudent(String name) {
        return new Gryffindorstudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Kogtevranstudent generateKogtevranstudent(String name) {
        return new Kogtevranstudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Hufflepuffstudent generateHufflepuffStudent(String name) {
        return new Hufflepuffstudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

}
