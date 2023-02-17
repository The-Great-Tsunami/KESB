package Day03;

public class Day03_07_continue {
    public static void main(String[] args){
        for(int i= 2; i <= 9; i++)
        {
            System.out.printf("***%d단***\n", i);
            for (int j = 1; j <= 9; j++)
            {
                if (j >= 4){
                    continue; // i가 4일 때는 출력하지 않음.
                }
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }
        }
    }
}
