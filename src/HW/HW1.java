package HW;

import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        /*
         * Дано ціле число. Перевірити чи є останньою цифрою цього числа - цифра 3.
         * Перевірте коли це дійсно так, і ні.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int val = sc.nextInt();
        if (val%10 == 3) {
            System.out.println("Last number is 3");
        } else {
            System.out.println("Last number is'n 3");
        }
        /*
         * Дано ціле число в межах до 10, введене користувачем з консолі
         * (для тих хто знає роботу зі Scanner, можете додати ввод цього числа).
         * Це число - сума грошей в гривнях.
         * Виведіть це число, додавши до нього слово «гривня» у потрібному відмінку
         * («гривня», «гривні», «гривень»).
         */
        System.out.print("Input the number of grivnas: ");
        int money = sc.nextInt();
        switch (money) {
            case 1 -> System.out.println(money + " гривня");
            case 2, 3, 4 -> System.out.println(money + " гривні");
            case  5, 6, 7, 8, 9, 10 -> System.out.println(money + " гривень");
            default -> System.out.println("Greater then 10");
        }
        /*
         * Напишіть програму для розв’язування квадратних рівнянь
         * (використовуйте if, else if та else). Коефіцієнти a, b, c можна взяти довільні.
         */
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c: ");
        double c = sc.nextDouble();

        double result = b * b - 4.0 * a * c;
        if (result > 0.0) {
            double x1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double x2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("x1 = " + x1 + ";\n" + "x2 = " + x2 + ";");
        } else if (result == 0.0) {
            double x1 = -b/(2.0 * a);
            System.out.println("x1 = " + x1);
         } else {
            System.out.println("No Roots");
        }
    }
}