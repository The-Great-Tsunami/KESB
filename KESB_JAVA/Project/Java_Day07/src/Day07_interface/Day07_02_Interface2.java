package Day07_interface;

interface IZerg{
    default public void zergAttack(){
        System.out.println("Zerg 공격개시");
    }
    default public void display(){}
}

interface ITerran{
    default public void terranAttack(){

    }
}
interface IProtous{
    default public void protousAttack(){

    }
}
interface IGame extends IZerg, ITerran, IProtous{
    public abstract void Goodgame();

}

class Starcraft implements IGame
{
    @Override
    public void display(){
        System.out.println("zerg종족 개수 표시");
    }
    @Override
    public void Goodgame(){
        System.out.println("GG");
    }
    @Override
    public void protousAttack(){
    System.out.println("protous 공격개시");
}
    @Override
    public void terranAttack(){
    System.out.println("terran 공격개시");
}

}
public class Day07_02_Interface2 {
    public static void main(String[] args){
        Starcraft yunel = new Starcraft();
        yunel.zergAttack();
        yunel.protousAttack();
        yunel.terranAttack();
        yunel.display();
        yunel.Goodgame();

    }
}
