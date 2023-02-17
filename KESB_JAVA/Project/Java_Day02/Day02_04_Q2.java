package Day03;

import java.util.Scanner;

public class Day02_04_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소수를 구할 정수 한 개 입력 : ");
        int number = sc.nextInt();
        int count = 0;
        int sosu = 0;

        for (int i = 2; i <= number; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                sosu++;
                System.out.printf("%d은(는) 소수이다.\n", i);
            }
            count = 0;
        }
        System.out.printf("1~%d 사이의 소수 개수 = %d\n", number, sosu);
    }
}

