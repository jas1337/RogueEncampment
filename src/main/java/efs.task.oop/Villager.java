package efs.task.oop;

public class Villager implements Fighter {
    private String name;
    private int age;
    private int health = 100;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getHelloText() {
        return "Greetings traveler... I'm %s and I'm %s years old.";
    }

    public void sayHello() {
        System.out.printf(this.getHelloText() + '\n', name, age);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void attack(Fighter victim) {
        int damage = (int) (100 - age * 0.5) / 10;

        System.out.printf("%s attacks %s for %s damage\n", name , victim.getName(), damage);
        victim.takeHit(damage);
    }

    @Override
    public void takeHit(int damage) {
        this.setHealth(this.getHealth() - damage);
    }
}
