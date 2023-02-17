/*
Person  - 부모 - SUPER - 기본 - 상위

  Man   - 자식 - SUB   - 파생 - 하위
 */

import java.util.Scanner;
class Person {

    protected String name = null; //protected 의 경우 상속 관계가 있는 타 클래스와는 변수를 공유
    protected int age = 0;
    static char blood = 'A';
    public Person(){}
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

/*class man{
    private String name;
    private int age;
    private final int IQ = 140;
    public void talk(){}
} */ // 이 방식을 사용하면 같은 내용을 두 번 적으며 효율성이 떨어짐
class Man extends Person // SUB extends SUPER -> 상속이 이루어지면 부모 클래스의 모든 요소를 사용가능
{
    public Man(){
        System.out.printf("나는 man의 기본 생성자입니다.\n");
    }
    private int money ;
    private String job ;

    private void show()
    {
        System.out.printf("name = %s", name);
        System.out.printf("money = %d", money);
        System.out.printf("job = %s", job);
    }
    public void work(){System.out.printf("%s이 일을 한다.", name);}
}
public class Day05_01_Inheritance
{ /*public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String myName = null;
        int myAge = 0;
        System.out.print("이름을 입력하시오 :");
        myName = sc.nextLine();
        System.out.print("나이를 입력하시오 :");
        myAge = sc.nextInt();

        Person hyunbin = new Person(myName, myAge);
        System.out.printf("이름은 %s이고 ", hyunbin.getName());
        System.out.printf("나이는 %d살입니다.", hyunbin.getAge());
    }*/
    public static void main(String[] args){
        Person chulsu = new Person();
        chulsu.name = "쳘수";
        System.out.printf("chulsu.name = %s\n", chulsu.name);

        Man wonbin =  new Man();
        wonbin.name = "원빈";
        System.out.printf("wonbin.name = %s\n", wonbin.name);
        wonbin.work();
    }
}