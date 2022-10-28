package src;

import src.character.Human;
import src.character.Infected.Infected;

public class Fight {
    public static void start(Infected infected, Human mainCharacter, Score score) {
        Console.logWithDelay("\n\n------------------------------\nYou face with a " + infected.getName() + " !");
        infected.printCharacterInfo();

        while (true) {
            mainCharacter.attack(infected);
            score.updateUsedAmmo();

            if (!infected.isAlive()) {
                Console.log("You killed it.\n\n------------------------------\n");
                infected.onDead(mainCharacter);
                score.updateKilledInfecteds();
                if (!mainCharacter.isAlive()) {
                    mainCharacter.onKilled(score);
                }
                break;
            }
            infected.printCharacterInfo();

            infected.attack(mainCharacter);
            if (!mainCharacter.isAlive()) {
                mainCharacter.onKilled(score);
            }
            mainCharacter.printCharacterInfo();
        }
    }
}
