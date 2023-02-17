package Day03;

public class Day03_06_break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6)
                break; // i == 5 일때 까지만 출력
            System.out.printf("i = %d\t", i);
        }
    }
}