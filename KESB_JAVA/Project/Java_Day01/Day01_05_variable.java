public class Day01_05_variable {
    /*
    변수 선언 => var
    상수 선언 => final
     */
    public static void main(String[] args){

        /*
        var -> 변수를 선언하는 명령어
        - var를 이용하면 타입을 결정하지 않고 변수를 선언할 수 있음 -> 컴파일러가 타입을 추론
            BUT, 만약 초기값을 주지 않으면 타입을 추론할 수 없으므로 컴파일 에러가 발생할 수 있음
            ex -> var n;
        - 이 상태에선 아직 메모리에 할당된 것이 아님 변수에 값이 최초로 할당될 때 메모리 주소가 할당
        - var를 통한 변수 선언은 이후 변경이 가능
         */

        var n = 32; //컴파일러가 n이라는 변수에 담긴 값의 타입을 추론
        System.out.printf("n = %d\n",n);

        /*
        final -> 상수를 선언하는 명령어
        변수 선언 시 앞에 final을 명시하면 다른 참조 값을 줄 수 없음.
         */

        final double PI = 3.14; //상수는 변경이 불가 swift에서 let과 유사
        System.out.printf("PI = %.2f\n", PI);
    }
}
