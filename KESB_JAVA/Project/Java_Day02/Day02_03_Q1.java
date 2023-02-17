package Day03;

public class Day02_03_Q1 {
    public static void main(String[] args){
        int count = 4;

        for (int i = 0; i < 2; i++)
        {
            for (int y = 1; y <= 9; y++)
            {
                for (int x = 2 + count * i; x <= 5 + count * i; x++)
                {
                    System.out.printf("%d * %d = %d\t\t", x , y, x * y);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
