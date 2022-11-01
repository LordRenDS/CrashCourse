package HW4;

public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackHero(Hero hero);

    public void takeDamage(int dmg) {
        if (isAlive()) {
            health = health - dmg;
            if (health <= 0) {
                health = 0;
                System.out.println("Enemy is already dead");
            }
        } else {
            System.out.println("Enemy is already dead");
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}