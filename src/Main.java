public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        //Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);

        }
//Задание 5
        System.out.println("Задание 5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " является высокосным");

        }
        //Задание 6
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        // Задание 7
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        //Задание 8
        System.out.println("Задание 8");
        int part = 29_000;
        int sum = 0;

        for (int i = 1; i <= 12; i++) {
            sum = sum + part;
            System.out.println("Месяц" + i + "сумма накоплений равна" + sum + "рублей");


            //Задание 9
            System.out.println("Задание 9");
            int part1 = 29_000;
            int sum1 = 0;
            {

                for (int b = 1; b <= 12; b++) {
                    sum1 = sum1 + part1 / 100;
                    sum1 = sum1 + part1;
                    System.out.println("Месяц" + b + "сумма накоплений равна" + sum1 + "рублей");
                }
            }
        }
    }
}