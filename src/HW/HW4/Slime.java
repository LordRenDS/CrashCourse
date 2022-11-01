package HW.HW4;

public class Slime extends Enemy{
    private int damage = 30;

    public Slime(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Slime is attack");
        hero.takeDamage(damage);
    }
}
