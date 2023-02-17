package Day06_04_homework;

import java.util.Arrays;

public class Day06_04_Q2 {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("before = " + Arrays.toString(arr));


        for (int i = 0; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println("after = " + Arrays.toString(arr));
    }
}
