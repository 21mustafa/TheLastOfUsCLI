package src.character;

public abstract class Character {
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return hp;
    }

    public void updateHP(int effect) {
        this.hp += effect;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public abstract void attack(Character enemy);

    public abstract void printCharacterInfo();
}
