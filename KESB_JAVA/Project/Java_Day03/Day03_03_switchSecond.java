package Day03;

public class Day03_03_switchSecond {
    public static void main(String[] args){
        whoIsIt("호랑이");
        whoIsIt("사자");
        whoIsIt("윤정무");
        whoIsIt("독수리");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("연어");
        whoIsIt("곰팡이");
        String tmp = null;
        tmp = fone(1);
        System.out.println("temp = " + tmp);
        tmp = fone(2);
        System.out.println("temp = " + tmp);
        tmp = fone(3);
        System.out.println("temp = " + tmp);


    } // end of main()

    static String fone(int n)
    {
        return switch (n)
                {
            case 1 -> "한개";
            case 2 -> "두개";
            default -> "많이"; //변수의 모든 가능한 값은 정수이므로 오류가 발생한다.
        };

    }

    static void whoIsIt(String bio) {
        String kind = switch (bio)
                { //동물의 종
            case "호랑이", "사자" -> "포유류";
            case "윤정무" -> "양서류";
            case "독수리", "참새" -> "조류";
            case "고등어", "연어" -> "어류";
            default ->
            {
                System.out.print("어이쿠! ");
                yield  "...";
            } //end of default
        };//end of switch -> 이 경우에 모두 한 문장으로 처리 되기 때문에 세미콜론을 붙여주어야 함.
        System.out.printf("%s는 %s이다.\n", bio, kind);

    } //end of whoIsIt() // -> way3
    /*static void whoIsIt(String bio) {
        String kind = ""; //동물의 종

        switch (bio) {
            case "호랑이", "사자" -> kind = "포유류";
            case "윤정무" -> kind = "양서류";
            case "독수리", "참새" -> kind = "조류";
            case "고등어", "연어" -> kind = "어류";
            default -> {
                System.out.print("어이쿠! ");
                kind = "...";
            } //end of default
        } //end of switch
        System.out.printf("%s는 %s이다.\n", bio, kind);

    } //end of whoIsIt()*/ // -> way2
    /*static void whoIsIt(String bio) {
        String kind = ""; //동물의 종

        switch (bio) {
            case "호랑이":
                kind = "포유류";
                break;
            case "사자":
                kind = "포유류";
                break;
            case "윤정무":
                kind = "양서류";
                break;
            case "독수리":
            case "참새":
                kind = "조류";
                break;
            case "고등어":
                kind = "어류";
                break;
            default:
                System.out.print("어이쿠! ");
                break;
        } //end of switch
    System.out.printf("%s는 %s이다.\n", bio, kind);
    } //end of who*/ // -> way1

}

