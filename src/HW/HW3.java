package HW;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        int[] mas_1 = {1, 2, 0, 3, 5, 7, 8, 9, 15};
        int[] mas_2 = {12, 16, 18, 22, 26, 39};
        ex_1(mas_1);
        ex_2(mas_1);
        ex_3(mas_1, mas_2);
    }
    public static void ex_1(int[] arr) {
        int max_v, min_v, max_id = 0, min_id = 0, result = 0;
        max_v = min_v = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max_v){
                max_v = arr[i];
                max_id = i;
            }
            if (arr[i] < min_v){
                min_v = arr[i];
                min_id = i;
            }
        }
        if (max_id > min_id){
            for (int i = min_id; i <= max_id; i++) {
                result += arr[i];
            }
        } else {
            for (int i = max_id; i <= min_id; i++) {
                result += arr[i];
            }
        }
        System.out.println("Max: " + max_v);
        System.out.println("Min: " + min_v);
        System.out.println("Sum: " + result);
    }
    public static void ex_2(int[] arr) {
        int end_mas_1 = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                arr[i] = arr[i-1];
            } else {
                arr[i] = end_mas_1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void ex_3(int[] arr_1, int[] arr_2) {
        int[] result = new int[arr_1.length + arr_2.length];
        int i_1 = 0, i_2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (arr_1.length > i_1) {
                result[i] = arr_1[i_1];
                i_1++;
            } else if (arr_2.length > i_2) {
                result[i] = arr_2[i_2];
                i_2++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
