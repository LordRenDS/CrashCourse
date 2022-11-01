package HW4;

public class Mage extends Hero {
    protected int damage = 35;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy dmg) {
        System.out.println("Mage " + getName() + " is attack");
        dmg.takeDamage(damage);
    }
}
