package Pages;

public class Main {
    public static void main(String[] args) {
        //Anna:  Anna, 20, Nu
        Anna anna = new Anna();
        String nameAnna = anna.getName();
        System.out.println("nameAnna: " + nameAnna);
        int ageAnna = anna.getAge();
        System.out.println("ageAnna: " + ageAnna);
        String sexAnna = anna.getSex();
        System.out.println("sexAnna: " + sexAnna);

        //Emma:  Emma, 22, Nu
        Emma emma = new Emma();
        String nameEmma = emma.getName();
        System.out.println("nameEmma: " + nameEmma);
        int ageEmma = emma.getAge();
        System.out.println("ageEmma: " + ageEmma);
        String sexEmma = emma.getSex();
        System.out.println("sexEmma: " + sexEmma);

        //Jack:  Jack, 19, Nam
        Jack jack = new Jack();
        String nameJack = jack.getName();
        System.out.println("nameJack: " + nameJack);
        int ageJack = jack.getAge();
        System.out.println("ageJack: " + ageJack);
        String sexJack = jack.getSex();
        System.out.println("sexJack: " + sexJack);

        //Duo:   Duo, 31, Nam
        Duo duo = new Duo();
        String nameDuo = duo.getName();
        System.out.println("nameDuo: " + nameDuo);
        int ageDuo = duo.getAge();
        System.out.println("ageDuo: " + ageDuo);
        String sexDuo = duo.getSex();
        System.out.println("sexDuo: " + sexDuo);
    }
}
