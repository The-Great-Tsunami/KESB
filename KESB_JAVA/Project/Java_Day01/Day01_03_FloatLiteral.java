public class Day01_03_FloatLiteral {
    /*
    FloatLiteral에는 float와 double이 있음.
    -float. 4byte = 32bit
    -double. 8byte = 64bit -> double타입이 float타입보다 큰 실수를 저장할 수 있음.
     */
    public static void main(String[] args) {
        /*
        float 타입 -> 컴파일러가 기본적으로 실수타입을 double로 간주 따라서 변수 선언 시 뒤에 'F' or 'f'를 붙여야 함.
        */
        float fv = 3.14f ;
        System.out.printf("fv = %f\n", fv); //변수가 실수일 경우 포맷 명시자는 %f
        System.out.printf("fv = %.2f\n", fv); //소수점 이하의 자리를 제한하고 싶은 경우 "."뒤에 원하는 자릿수를 넣음 ex-> %.2, %.9, %.3

        //출력 값을 전체 몇자리로 출력할 것인지를 결정 ex-> %7.2 or %07.2 or %-7.2
        System.out.printf("fv = %7.2f\n", fv); //빈 자리는 공백으로 출력
        System.out.printf("fv = %07.2f\n", fv); //빈 자리에는 0을 채워 넣음.
        System.out.printf("fv = %-7.2f'end'\n", fv); //빈자리, 공백을 나중에 출력
        //'+'로 문자열에 붙여서 출력가능
        System.out.printf("fv = " + fv + '\n');

        /*
        double 타입 -> 64bit이기 때문에 float타입보다 약 2배 이상의 정밀도를 갖는다는 의미 -> 유효숫자 자릿수가 두배
         */
        double dv = 6.28 ;
        System.out.printf("dv = %f\n", dv);
        System.out.printf("dv = %.2f\n", dv);
        System.out.printf("dv = %6.2f\n", dv);
        System.out.printf("dv = %06.2f\n", dv);
        System.out.printf("dv = %-6.2f'end'\n", dv);
    }
}
