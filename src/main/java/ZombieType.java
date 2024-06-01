package main.java;

public enum ZombieType {
    WALKER("Fire"),
    RUNNER("Ice"),
    CRAWLER("Sunlight");

    private final String weakness;

    ZombieType(String weakness) {
        this.weakness = weakness;
    }

    public String getWeakness() {
        return weakness;
    }
}
