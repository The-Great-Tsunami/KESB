//import java.util.Scanner;
//class car
//{
//    public car(){}
//    //속도
//    protected int speed = 0;
//    public void setSpeed(int speed){this.speed = speed;}
//    public int getSpeed(){return speed;}
//    //번호
//    protected int number = 0;
//    public void setNumber(int number){this.number = number;}
//    public int getNumber(){return number;}
//    //차량이름
//    protected String name = null;
//    public void setName(String name){this.name = name;}
//    public String getName(){return name;}
//    //차량색상
//    protected String color = null;
//    public void setColor(String color){this.name = color;}
//    public String getColor(){return color;}
//    //운전자주소
//    protected String address = null;
//    public void setAddress(String address){this.name = address;}
//    public String getAddress(){return address;}
//
//    public car(String name, String color, int number, String address, int speed){
//        this.name = name;
//        this.color = color;
//        this.number = number;
//        this.address = address;
//        this.speed = speed;
//    }
//
//}
//
//class LentCar extends car{
//
//    //요금
//    int fare = 0;
//    public void setFare(int fare) {this.fare = fare;}
//    public int getFare(){return fare;}
//
//    //회사
//    String comp = null;
//    public void setComp(String comp){this.comp = comp;}
//    public String getComp(){return comp;}
//
//    public LentCar(String name, String color, int number, String address, int speed, int pfare, String pcomp){
//        this.name = name;
//        this.color = color;
//        this.number = number;
//        this.address = address;
//        this.speed = speed;
//        fare = pfare;
//        comp = pcomp;
//    }
//}
//
//public class Day05_03_Q1_1 {
//    public static void main(String[] args){
//        Scanner sc =  new Scanner(System.in);
//
//        String myName = null;
//        String myColor = null;
//        int myNumber = 0;
//        String myAddress = null;
//        int mySpeed = 0;
//        int myFare = 0;
//        String myComp = null;
//
//        System.out.print("차 이름을 입력하시오 :");
//        myName = sc.nextLine();
//        System.out.print("차 색을 입력하시오 :");
//        myColor = sc.nextLine();
//        System.out.print("차량 번호를 입력하시오 :");
//        myNumber = sc.nextInt();
//        sc.nextLine();
//        System.out.print("운전자 주소를 입력하시오 :");
//        myAddress = sc.nextLine();
//        System.out.print("속도를 입력하시오 :");
//        mySpeed = sc.nextInt();
//        System.out.print("렌트비를 입력하시오 :");
//        myFare = sc.nextInt();
//        sc.nextLine();
//        System.out.print("렌트회사를 입력하시오 :");
//        myComp = sc.nextLine();
//
//        LentCar doyun = new LentCar(myName,myColor,myNumber,myAddress,mySpeed,myFare,myComp);
//        System.out.printf("차 이름 : %s\n", doyun.getName());
//        System.out.printf("차 색 : %s\n", doyun.getColor());
//        System.out.printf("차량 번호 : %d\n", doyun.getNumber());
//        System.out.printf("운전자 주소 : %s\n", doyun.getAddress());
//        System.out.printf("현재 자동차 속도의 속도는 시속 %dkm/h 입니다.\n", doyun.getSpeed());
//        System.out.printf("렌트요금 : %d\n", doyun.getFare());
//        System.out.printf("렌트회사명 : %s\n", doyun.getComp());
//
//        Scanner speed =  new Scanner(System.in);
//
//        int presentSpeed = 0;
//
//        System.out.println("번호를 입력해주세요. 1) 속도증가 2) 속도감소 3)종료");
//        int choice = speed.nextInt();
//        if (choice == 1){
//            System.out.printf("속도를 얼마나 올리시겠습니까?\n");
//            int speedUp = speed.nextInt();
//            presentSpeed = (doyun.getSpeed() + speedUp);
//            System.out.printf("현재 자동차 속도의 속도는 시속 %dkm/h 입니다.\n", presentSpeed);
//            System.out.printf("                                             \n");
//            }
//        else if (choice == 2){
//            System.out.printf("속도를 얼마나 내리시겠습니까?\n");
//            int speedDown = speed.nextInt();
//            presentSpeed = (doyun.getSpeed() - speedDown);
//            System.out.printf("현재 자동차 속도의 속도는 시속 %dkm/h 입니다.\n", presentSpeed);
//            System.out.printf("                                             \n");
//            }
//        else{
//            System.out.printf("안녕히가세요:)");
//        }
//    }
//}