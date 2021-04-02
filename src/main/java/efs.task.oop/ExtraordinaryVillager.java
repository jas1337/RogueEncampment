package efs.task.oop;

public class ExtraordinaryVillager extends Villager {
    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private String text;

        Skill(String text) {
            this.text = text;
        }
    }

    private Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    public String getHelloText() {
        return super.getHelloText() + " " + skill.text;
    }

    @Override
    public void attack(Fighter victim) {
        // Do nothing
    }

    @Override
    public void takeHit(int damage) {
        this.setHealth(0);
    }
}
