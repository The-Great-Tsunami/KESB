public class Day01_06_TypeConversion {
    public static void main(String[] args) {
        /*
       자동 타입 변환 -> 값의 허용범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 발생

       byte < short, char < int < long < float < double
         */
        byte byteValue = 10;
        int inValue = byteValue; //int 타입이 byte 타입보다 허용 범위가 더 크기 때문에 다음 코드는 자동변환

        /*
        정수 타입이 실수 타입에 대입될 경우에는 자동으로 타입이 변환된다. 실수 타입이 정수 타입보다 허용범위가 크기 때문
         */
        long longValue = 5000000L;
        float floatValue = longValue; //5.0E9f로 저장
        double doubleValue = floatValue; //5.0E9로 저장

        /*
        char 타입의 경우 int 타입으로 자동변환되면 int 타입이 대입된다.
         */
        char charValue = 'A';
        int intvalue = charValue;

        /*
        - 자동 타입변환의 예외
        -> byte 타입은 char타입보다 허용 범위가 작지만 자동변환되지 않는다.
        -> byte 타입과 달리 char 타입은 음수를 포함하지 않기 때문이다.
         */

        byte bytevalue = 65;
        char charvalue = bytevalue; //컴파일 에러 발생

        char ch = 'A';
        System.out.printf("ch = %d\n", (int)ch); //대문자 'A'에 대한 ASCII 코드가 출력
    }
}
