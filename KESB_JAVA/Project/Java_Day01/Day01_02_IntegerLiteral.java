public class Day01_02_IntegerLiteral {
    /*
    java의 정수 타입은 5가지로 분류
    -byte. 1byte = 8bit -> 0과 1이 저장되는 단위 -> -2^7 ~ 2^7 => -128 ~ 127
    -short. 2byte = 16bit
    -char. 2byte = 16bit
    -int. 4byte = 32bit
    -long. 8byte = 64bit -> 기본적으로 컴파일러는 IntegerLiteral을 int로 간주 따라서 long타입 사용 시 뒤에 'L'을 붙임
     */
    public static void main(String[] args) {
        /*
        Int 타입 -> IntegerLiteral의 디폴트
         */
        int a = 5; //변수 선언 시 데이터 타입을 정해야함.
        System.out.printf("a = %d\n", a);

        /*
        char 타입 -> 형식 출력 방법 포맷 명시자는 'c' or 'C'
                  -> char 타입은 작은따옴표(')로 감싸야 한다.
         */
        char ch = 'A';
        System.out.printf("ch = %c\n", ch);
        System.out.printf("ch = %d\n", (int)ch); //타입 변환 방법 ex-> 해당 변수 앞에 (type)을 넣어서 변환
                                                 // 대문자 'A'에 대한 ASCII 코드가 출력
    }

}
