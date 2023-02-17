package Day03;

/*
for (초기식; 조건식; 증감식){
    반복 실행문(들); -> 본체
}

example

for(int i = 0; i <= 9; i += i + 1)
 */

public class Day03_04_for {
    public static void main(String[] args){
        int i = 1, sum = 0;
        for(i = 1; i <= 10; ++i)
        {
            sum = sum + i;

            if (i % 2 == 0){
                System.out.printf("i = %d\t", i);
        }
        }
        System.out.printf("sum = %d, i = %d\n", sum, i);
        }
}
