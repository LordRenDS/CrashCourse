package HW4;

public class TrainingGround {
    public static void main(String[] args) {
        Slime slime = new Slime(100);
        Warrior warrior = new Warrior("Goku", 300);
        Wolf wolf = new Wolf(150);
        warrior.attackEnemy(wolf);
        warrior.attackEnemy(wolf);
        wolf.attackHero(warrior);
        wolf.attackHero(warrior);
        wolf.attackHero(warrior);
        warrior.attackEnemy(slime);
        warrior.attackEnemy(slime);
    }
}
