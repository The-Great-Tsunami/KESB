package Day06_03_interface;

interface IVehicle{

    //1. int makeYear = 2022;
    //2. final int makeYear = 2022;
    //3. public final int makeYear = 2022;
    public static final int makeYear = 2022; // 위 모든 사례들도 결국은 public static을 붙여 컴파일

    //1. void start() ;
    //2. abstract void start();
    public abstract void start(); // 위 모든 사례들도 결국은 public abstract를 붙여 컴파일함.

    default public void stop(){System.out.println("정지한다");}
    private void show() {System.out.println("makeYear = " + makeYear);}

    public static void turn(){System.out.println("방향전환한다.");}

    static class Price{
        int salePoint = 10;
    }
}

class Car implements IVehicle{
    /*
    interface를 상속할 때에는 implements를 사용한다.
     */
    @Override
    public void start(){
        /*
        부모의 추상메서드는 @Override를 통해 상속받을 수 있음.
         */
        System.out.println("Car가 출발한다.");
    }

}

public class Day06_03_interfance {
}
