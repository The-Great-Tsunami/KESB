package Day03;

public class Day03_01_Method {
    public static void main(String[] args){
        int a = 3, b = 5, res = 0;
        res = sum(a, b); //만약 호출하려는 함수가 static이 아니면 오류가 발생할 수 있음.
        System.out.printf("result = %d\n", res);
    } //end of main()

    public static int sum(int pa, int pb){
        int total = 0;
        total = pa + pb;
        return total;
    }

}
