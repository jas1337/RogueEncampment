package efs.task.oop;

import java.util.Arrays;

import static efs.task.oop.ExtraordinaryVillager.Skill.IDENTIFY;
import static efs.task.oop.ExtraordinaryVillager.Skill.SHELTER;

public class RogueEncampment {
    private Villager[] villagers;
    private Monster[] monsters;

    private String MONSTER = "monster";
    private String VILLAGER = "villager";

    public RogueEncampment() {
        initialize();
        String initiator = MONSTER;

        System.out.printf("Beware, monsters are approaching Rogue Encampment!!!\n");

        while (shouldFight()) {
            fight(initiator);
            initiator = initiator == MONSTER ? VILLAGER : MONSTER;
        }
        System.out.printf("%s were defeated\n", initiator == MONSTER ? "Monsters" : "Villagers");
    }

    public void initialize() {
        villagers = new Villager[] {
            new Villager("Kashya", 30),
            new ExtraordinaryVillager("Akara", 40, SHELTER),
            new Villager("Gheed", 50),
            new ExtraordinaryVillager("Deckard Cain", 85, IDENTIFY),
            new Villager("Warriv", 35),
            new Villager("Flawia", 25),
        };

        for (Villager villager : villagers) {
            villager.sayHello();
        }

        monsters = new Monster[] {
            Monsters.andariel,
            Monsters.blacksmith,
        };
    }

    public boolean shouldFight() {
        return getLivingVillagers().length > 0 && getLivingMonsters().length > 0;
    }

    public Villager[] getDefenders() {
        return Arrays.stream(getLivingVillagers())
            .filter((Villager villager) -> villager.getClass() == Villager.class)
            .toArray(Villager[]::new);
    }

    public Villager[] getLivingVillagers() {
        return Arrays.stream(villagers)
            .filter((Villager villager) -> villager.getHealth() > 0)
            .toArray(Villager[]::new);
    }

    public Monster[] getLivingMonsters() {
        return Arrays.stream(monsters)
            .filter((Monster monster) -> monster.getHealth() > 0)
            .toArray(Monster[]::new);
    }

    public void fight(String initiator) {
        Monster monster = getLivingMonsters()[0];
        if (initiator == MONSTER) {
            Villager victim = getLivingVillagers()[0];
            monster.attack(victim);
            return;
        }

        Villager[] defenders = getDefenders();

        if (defenders.length > 0) {
            Villager defender = defenders[0];
            defender.attack(monster);
        }
    }

}
