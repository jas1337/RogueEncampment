package efs.task.oop;

public class Monsters {
    static final Monster andariel = new Monster(10, 70, "Andariel"){
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());

            System.out.printf("%s attacks %s for %s damage\n", getName() , victim.getName(), getDamage());
        }

        @Override
        public void takeHit(int damage) {
            this.setHealth(getHealth() - damage);
        }
    };

    static final Monster blacksmith = new Monster(100, 25, "Blacksmith"){
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
            System.out.printf("%s attacks %s for %s damage\n", getName() , victim.getName(), getDamage());
        }

        @Override
        public void takeHit(int damage) {
            int value = damage + 5;
            this.setHealth(getHealth() - value);
        }
    };

    // TODO: remove unused method
    public static int getMonsterHealth() {
        return andariel.getHealth() + blacksmith.getHealth();
    }
}
