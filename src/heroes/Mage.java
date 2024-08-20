package heroes;

import main.ConsoleHelper;
import main.Creature;

public class Mage extends Hero {
    public Mage(String name, double health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Creature enemy) {
        ConsoleHelper.writeMessage("Герой атакует врага огненным заклинанием");
        enemy.takeDamage(50.0);
    }
}
