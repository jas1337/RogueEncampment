package efs.task.oop;

import static efs.task.oop.ExtraordinaryVillager.Skill.*;

public class Main {
    public static void main(String[] args) {
        Villager Kashya = new Villager("Kashya", 30);
        Villager Akara = new ExtraordinaryVillager("Akara", 40, SHELTER);
        Villager Gheed = new Villager("Gheed", 50);
        Villager DeckardCain = new ExtraordinaryVillager("Deckard Cain", 85, IDENTIFY);
        Villager Warriv = new Villager("Warriv", 35);
        Villager Flawia = new Villager("Flawia", 25);


        DeckardCain.sayHello();
    }
}
