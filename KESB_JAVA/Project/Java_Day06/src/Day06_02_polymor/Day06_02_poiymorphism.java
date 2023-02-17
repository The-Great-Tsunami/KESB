package Day06_02_polymor;

abstract class Mammal{
    abstract public void moving();


    public Mammal(){
        System.out.println("난 Mammal의 기본생성자");
    }

    public void talk(){ }
    public void show(){
        System.out.printf("나는 Mammal의 show()메서드 입니다.\n");
    }
    public void work(){ }
    public void girl(){ }

}

class Person extends Mammal {

    protected String name = null; //protected 의 경우 상속 관계가 있는 타 클래스와는 변수를 공유
    protected int age = 0;
    protected static char blood = 'A';

    public void setBlood(char blood){this.blood = blood;}
    public char getBlood(){return blood;}
    public Person(){
        System.out.println("난 Person()의 기본생성자");
    }
    public Person(String name, int age) {super(); this.name = name; this.age = age;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setAge(int age) {this.age = age;} //파라미터로 전달
    public int getAge() {return age;}
    public void talk(int Age, String Shouting) {
        System.out.printf("Age = %d\n", Age);
        System.out.printf("shouting = %s\n", Shouting);
    }
    public void breathe() {age = 1;}

    public void show(){
        super.show();
        System.out.println("난 Person()의 show()메서드\n");
    }

    public void moving(){
        System.out.println("Person이 움직인다.");
    }
}
class Man extends Person{ // SUB extends SUPER -> 상속이 이루어지면 부모 클래스의 모든 요소를 사용가능
    public Man(){
        System.out.printf("나는 man의 기본 생성자입니다.\n");
    }

    private String girl = null;

    public void setGirl(String girl){
        this.girl = girl;
    }
    public String getGirl(){
        return girl;
    }

    public final char blood = 'O';
    private int money ;
    private String job ;

    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return job;
    }

    public Man(String name, int age, int money, String job, String girl){

        super(name, age); // Person()을 호출하라!

        this.money = money;
        this.job = job;
        this.girl = girl;

    }

    public void show()
    {
        super.show();
        System.out.printf("blood Type = %s\n", super.getBlood());
        System.out.printf("blood Type = %s\n", this.blood);
        System.out.printf("name = %s\n", name);
        System.out.printf("age = %d\n", age);
        System.out.printf("job = %s\n", job);
        System.out.printf("money = %d\n", money);
        System.out.printf("%d세의 %s %s씨, 현재 수익은 %d원입니다.\n", age, job, name, money);
        System.out.printf("그리고 %s는 %s를 좋아해!\n",name, girl);
    }
    public void work(){System.out.printf("%s이 일을 한다.\n", name);}

    public void moving(){
        super.moving();
        System.out.println("Man이 움직인다.");
    }
}
public class Day06_02_poiymorphism {
    public static void main(String[] args){
        Mammal moomoo = new Man("윤정무", 27, 7400, "개미투자자", "윤지");

        moomoo.show(); //Man()의 show()
        moomoo.talk(); //Person()의 talk()
        //moomoo.work(); //Man()의 work()
        moomoo.moving();
    }
}
