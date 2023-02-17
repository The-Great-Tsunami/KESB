package Day03;
import java.util.Scanner;
public class Day02_01_Scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하시오.");
        int years = sc.nextInt();

        if (years % 4 == 0 && years % 100 != 0){
            System.out.printf("%d년은 윤년입니다.", years);
        }
        else if (years % 400 == 0){
            System.out.printf("%d년은 윤년입니다.", years);
        }
        else
            System.out.printf("%d년은 윤년이 아닙니다.", years);
    }
}
