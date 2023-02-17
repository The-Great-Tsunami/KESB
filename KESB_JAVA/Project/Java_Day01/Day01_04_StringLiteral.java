public class Day01_04_StringLiteral {
    /*
    작은따옴표(')는 기본적으로 char타입에서 사용한다. 따라서 문자열 타입은 큰따옴표(")를 활용한다.
    char타입과 다르게 여러개의 문자를 변수에 담을 수 있다.
     */
    public static void main(String[] args){
        String name = "gildong";
        System.out.printf("name = %s\n", name);
        System.out.println("name = " + name);
        System.out.print("name = " + name + "\n");

    }
}
