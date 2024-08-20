package main;

public abstract class Creature implements Mortal {
    private String name;
    private double health;

    public Creature(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0.0;
    }

    public abstract void attackEnemy(Creature enemy);

    public void takeDamage(double damage) {
        this.health -= damage;
    }
}
