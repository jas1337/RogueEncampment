package efs.task.oop;

public class Villager {
    private String name;
    private int age;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getHelloText() {
        return "Greetings traveler... I'm %s and I'm %s years old.";
    }

    public void sayHello() {
        System.out.printf(this.getHelloText() + '\n', this.name, this.age);
    }
}
