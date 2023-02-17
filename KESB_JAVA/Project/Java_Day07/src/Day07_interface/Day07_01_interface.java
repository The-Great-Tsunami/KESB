package Day07_interface;

interface IVehicle{

    //1. int makeYear = 2022;
    //2. final int makeYear = 2022;
    //3. public final int makeYear = 2022;
    public static final int makeYear = 2022; // 위 모든 사례들도 결국은 public static을 붙여 컴파일

    //1. void start() ;
    //2. abstract void start();
    public abstract void start(); // 위 모든 사례들도 결국은 public abstract를 붙여 컴파일함.

    default public void stop(){System.out.println("정지한다");}

    default public void driving(){System.out.println("드라이빙");}
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

    public Car(){System.out.println("난 CAR의 기본생성자");}

    @Override
    public void stop(){System.out.println("Car가 정지한다.");}
    @Override
    public void start(){
        /*
        부모의 추상메서드는 @Override를 통해 상속받을 수 있음.
         */
        System.out.println("Car가 출발한다.");
    }
    @Override
    public void driving(){
        System.out.println("Car를 타고 드라이빙");
    }

}

class Carrier{
    public void fetch(){
        System.out.println("승객을 운반하다");
    }
}


public class Day07_01_interface {
    public static void main(String[] args){
        //IVehicle job = new IVehicle();
        // interface 단독으로 객체 생성 불가

        /*
        Car k5 = new Car();
        k5.start();
        k5.stop();
        //k5.turn(); turn() 메서드는 정적 메소드이기 때문에 바로 호출 불가능
        IVehicle.turn();
        */
        IVehicle k5 = new Car();
        k5.driving();
        k5.start();
        k5.stop();
        IVehicle.turn();

    }
}