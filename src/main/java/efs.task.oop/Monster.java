package efs.task.oop;

public abstract class Monster implements Fighter {
    private int health;
    private int damage;
    private String name;

    public Monster(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return name;
    }
}
