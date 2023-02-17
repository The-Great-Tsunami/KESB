package Diablo;

public abstract class Character {
    protected int hp;
    protected int mp;
    // ...

    WeaponBehavior weapon;  // Association (Aggregation)

    public void info(){
        System.out.println("체력 : " + hp + "\n지능 : " + mp);
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public final void performWeapon(){
        weapon.useWeapon();
    }
}
