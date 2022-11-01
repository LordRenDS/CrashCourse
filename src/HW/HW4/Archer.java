package HW.HW4;

public class Archer extends Hero {
    protected int damage = 20;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy dmg) {
        System.out.println("Archer " + getName() + " is attack");
        dmg.takeDamage(damage);
    }
}
