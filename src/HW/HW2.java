package HW;

import java.util.*;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Напишіть програму на Java для відображення n членів непарного натурального числа та їх суми.
         * (Наприклад, якщо вибрати число 7, на екрані має бути перших 7 непарних чисел 1,3,5,7,9, 11, 13 і їх сума 49).
         * n обрати самостійно, для тих хто вміє, можна використати Scanner.
         */
        System.out.print("Введіть непарне число: ");
        int len = sc.nextInt();
        int n = (int) Math.ceil(len/2.0);
        int[] arr = new int[n];
        int count = 1, sum = 0;
        for (int x = 0; x < arr.length; x++) {
            arr[x] = count;
            sum += arr[x];
            count += 2;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        /*
         * Напишіть програму на Java для відображення всіх кратних 3 в діапазоні від 10 до 50.
         */
        int[] rng = new int[41];
        count = 10;
        int next_count = 0;
        for (int i = 0; i < rng.length; i++) {
            rng[i] = count;
            if (count%3 == 0) next_count++;
            count++;
        }
        int[] next_rng = new int[next_count];
        count = 0;
        next_count = 0;
        for (int i = 0; i < rng.length; i++){
            if (rng[count]%3 == 0) {
                next_rng[next_count] = rng[count];
                next_count++;
            }
            count++;
        }
        System.out.println(Arrays.toString(next_rng));
        /*
         * Напишіть програму для перевірки, чи є дане ціле число простим чи ні
         */
        System.out.print("Введіть число для перевіки: ");
        int num = sc.nextInt();
        if (num != 1 && num%2 != 0) {
            System.out.println("Це просте ціле число");
        } else {
            System.out.println("Це складене число");
        }
        /*
         * Напишіть програму під назвою Фібоначчі для друку перших 20 чисел Фібоначчі.
         * Також обчисліть їх середнє значення.
         */
        int[] mas = new int[20];
        int i, j;
        float mas_sum = 0;
        for (int cnt = 0; cnt < mas.length; cnt++) {
            if (cnt > 1) {
                i = mas[cnt - 1];
                j = mas[cnt - 2];
                mas[cnt] = j + i;
            } else {
                mas[cnt] = 1;
            }
            mas_sum += mas[cnt];
        }
        System.out.println("Перші 20 чисел Фібоначчі: " + Arrays.toString(mas));
        System.out.println("Середнє значення: " + mas_sum/mas.length);
    }
}
