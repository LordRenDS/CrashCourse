package HW.HW4;

public class Wolf extends Enemy {
    private int damage = 60;

    public Wolf(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Wolf is attack");
        hero.takeDamage(damage);
    }
}
