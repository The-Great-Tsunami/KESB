package Day06_01_super;

class Person {

    protected String name = null; //protected 의 경우 상속 관계가 있는 타 클래스와는 변수를 공유
    protected int age = 0;
    protected static char blood = 'A';

    public void setBlood(char blood){this.blood = blood;}
    public char getBlood(){return blood;}
    public Person(){
        System.out.println("난 Person()의 기본생성자");
    }
    public Person(String name, int age) {this.name = name; this.age = age;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setAge(int age) {this.age = age;} //파라미터로 전달
    public int getAge() {return age;}
    public void talk(int Age, String Shouting) {
        System.out.printf("Age = %d\n", Age);
        System.out.printf("shouting = %s\n", Shouting);
    }
    public void breathe() {age = 1;}
}
class Man extends Person // SUB extends SUPER -> 상속이 이루어지면 부모 클래스의 모든 요소를 사용가능
{
    public Man(){
        System.out.printf("나는 man의 기본 생성자입니다.\n");
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

    public Man(String name, int age, int money, String job){

        super(name, age); // Person()을 호출하라!

        this.money = money;
        this.job = job;

    }

    public void show()
    {
        System.out.printf("IQ = %s\n", super.getBlood());
        System.out.printf("IQ = %s\n", this.blood);
        System.out.printf("name = %s\n", name);
        System.out.printf("age = %d\n", age);
        System.out.printf("job = %s\n", job);
        System.out.printf("money = %d\n", money);
        System.out.printf("%d세의 %s %s씨, 현재 수익은 %d원입니다.\n", age, job, name, money);
    }
    public void work(){System.out.printf("%s이 일을 한다.\n", name);}
}


public class Day06_01_super {
    public static void main(String[] args){
    Person chulsu = new Person();
    chulsu.name = "쳘수";
    System.out.printf("chulsu.name = %s\n", chulsu.name);

    Man wonbin =  new Man();
    wonbin.name = "원빈";
    System.out.printf("wonbin.name = %s\n", wonbin.name);
    wonbin.work();
    wonbin.setJob("연예인");
        System.out.printf("jobs = %s\n", wonbin.getJob());

        Man moomoo = new Man("윤정무", 27, 7400, "개미투자자");

        moomoo.show();
}
}