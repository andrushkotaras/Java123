import java.util.Scanner;

public class java123 {
    public static void main(String[] args) {
        // Частина 1
        System.out.print("Програма для знаходження більшого з двох чисел. Введіть перше число: ");
        Scanner n1 = new Scanner(System.in);
        int number1 = n1.nextInt();

        System.out.print("Введіть друге число: ");
        Scanner n2 = new Scanner(System.in);
        int number2 = n2.nextInt();

        if (number1 > number2) {
            System.out.println("Перше число більше");
        } else if (number2 > number1) {
            System.out.println("Друге число більше");
        } else {
            System.out.println("Числа рівні");
        }

        // Частина 2
        System.out.print("Програма для знаходження меншого з двох чисел. Введіть перше число: ");
        Scanner n3 = new Scanner(System.in);
        int number3 = n3.nextInt();

        System.out.print("Введіть друге число: ");
        Scanner n4 = new Scanner(System.in);
        int number4 = n4.nextInt();

        if (number3 < number4) {
            System.out.println("Перше число менше");
        } else if (number4 < number3) {
            System.out.println("Друге число менше");
        } else {
            System.out.println("Числа рівні");
        }

        // Частина 3
        System.out.print("Програма для визначення парності числа. Введіть число: ");
        Scanner n5 = new Scanner(System.in);
        int number5 = n5.nextInt();

        if (number5 % 2 == 0){
            System.out.println("Число " + number5 + " - парне");
        }
        else {
            System.out.println("Число " + number5 + " - не парне");
        }

        System.out.print("Введіть порядковий день тижня: ");

        Scanner d1 = new Scanner(System.in);
        int day = d1.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Понеділок");
                break;
            case 2 :
                System.out.println("Вівторок");
                break;
            case 3 :
                System.out.println("Середа");
                break;
            case 4 :
                System.out.println("Четвер");
                break;
            case 5 :
                System.out.println("П'ятниця");
                break;
            case 6 :
                System.out.println("Субота");
                break;
            case 7 :
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Ваше число не є в проміжку від 1 до 7");
                break;

        }

        System.out.print("Введіть оцінку за шкалою ECTS: ");

        Scanner m = new Scanner(System.in);
        String mark = m.next();

        switch (mark) {
            case "a","A" :
                System.out.println( mark + " - is excellent!");
                break;
            case "b","B" :
                System.out.println(mark + " - is very good!");
                break;
            case "c","C" :
                System.out.println(mark + " - is good!");
                break;
            case "d","D" :
                System.out.println(mark + " - is fair");
                break;
            case "e","E" :
                System.out.println(mark + " - is poor");
                break;
            case "f","F" :
                System.out.println(mark + " - це 10 год тюрми"); // https://vm.tiktok.com/ZM2h4DLcB/
                break;
            default:
                System.out.println("Ви ввели не коректний символ");
                break;
        }

    }
}
