package heroes;

import main.ConsoleHelper;
import main.Creature;

public class Archer extends Hero {
    public Archer(String name, double health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Creature enemy) {
        ConsoleHelper.writeMessage("Герой атакует врага из лука");
        enemy.takeDamage(15.0);
    }
}
