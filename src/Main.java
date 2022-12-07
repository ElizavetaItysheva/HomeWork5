import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1() {
        System.out.println("задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName+ ' ' + middleName;
        System.out.println(fullName);
    }
    public static void task2(){
        System.out.println("задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName+ ' ' + middleName;
        System.out.println(fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
    public static void task4(){
        System.out.println("задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
    public static void task5(){
        System.out.println("задача 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество градусов");
        int t = scanner.nextInt();
        System.out.println("Температура воздуха сегодня: " + t + " градусов.");
    }
    public static void task6(){
        System.out.println("задача 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день, пожалуйста");
        String day = scanner.next();   // использую строку, потому что если число меньше 10, то убирается ноль в начале. Мне не нравится без нуля)
        System.out.println("Введите месяц, пожалуйста");
        String month = scanner.next();
        System.out.println("Введите год, пожалуйста");
        String year = scanner.next();
        System.out.println(day + ":" + month + ":" + year);
    }
}