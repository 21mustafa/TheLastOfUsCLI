package src;

public class Score {
    private int killedInfecteds = 0;
    private int usedAmmo = 0;

    public void updateKilledInfecteds() {
        killedInfecteds += 1;
    }

    public void updateUsedAmmo() {
        usedAmmo += 1;
    }

    public void printScore() {
        Console.logWithDelay(killedInfecteds + " infecteds were killed.");
        Console.logWithDelay(usedAmmo + " ammo were used.");
    }
}
