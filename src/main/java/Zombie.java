package main.java;

public class Zombie {
    private ZombieType type;

    public Zombie(ZombieType type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        this.type = type;
    }

    public ZombieType getType() {
        return type;
    }

    public String getWeakness() {
        return type.getWeakness();
    }
}
