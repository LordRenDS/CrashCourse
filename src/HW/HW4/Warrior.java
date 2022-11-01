package HW.HW4;

public class Warrior extends Hero {
    private int damage = 50;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy dmg) {
        System.out.println("Warrior " + getName() + " is attack");
        dmg.takeDamage(damage);
    }
}