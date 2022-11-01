package HW.HW4;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int dmg) {
        if (isAlive()) {
            health = health - dmg;
            if (health <= 0) {
                health = 0;
                System.out.println("Hero is already dead");
            }
        } else {
            System.out.println("Hero is already dead");
        }
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
