package Day03;

import java.util.Scanner;
public class Day02_02_nestedIf {
    public static void main(String[] args) {
        int a = 0;

        if(a>0) {
            System.out.printf("a=%d는 양수임\n",a); //MS949 한글
        }
        else if (a<0) {
            System.out.printf("a=%d는 음수임\n",a);
        }
        else  {
            System.out.printf("a=%d는 0임\n",a);
        }

        //학점 판별 문제
        Scanner sc = new Scanner(System.in);
        System.out.print("JAVA점수(0~100)입력 : ");
        int score = sc.nextInt();

        //if(90<=score<=100) 이건 파이썬 식
        if (90<= score && score<=100)
        {   if(score >= 95) {
            System.out.println("최우수학생");
        }
            System.out.printf("A학점");
        }
        else if (80<= score && score<=89){
            System.out.printf("B학점");
        }
        else if (70<= score && score<=79){
            System.out.printf("C학점");
        }
        else if (60<= score && score<=69){
            System.out.printf("D학점");
        }
        else {
            System.out.printf("D학점");
        }

    }
}
