package main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ZombieWeaknessSearch {
    private HashMap<String, Zombie> zombieWeaknessMap;
    private Set<Zombie> zombies;

    public ZombieWeaknessSearch() {
        zombieWeaknessMap = new HashMap<>();
        zombies = new HashSet<>();
    }

    public void addZombie(Zombie zombie) {
        zombieWeaknessMap.put(zombie.getType().name().toLowerCase(), zombie);
        zombies.add(zombie);
    }

    public String getZombieWeakness(String type) {
        Zombie zombie = zombieWeaknessMap.get(type.toLowerCase());
        return zombie.getWeakness();
    }

    public Set<Zombie> getZombies() {
        return new HashSet<>(zombies);
    }

    // public static void main(String[] args) {
    //     ZombieWeaknessSearch zws = new ZombieWeaknessSearch();
    //     zws.addZombie(new Zombie(ZombieType.WALKER));
    //     zws.addZombie(new Zombie(ZombieType.RUNNER));
        
    //     System.out.println("Weakness of Walker: " + zws.getZombieWeakness("WALKER"));
    //     System.out.println("Weakness of Runner: " + zws.getZombieWeakness("RUNNER"));
    //     System.out.println("All zombies: ");
    //     for (Zombie zombie : zws.getZombies()) {
    //         System.out.println("Type: " + zombie.getType() + ", Weakness: " + zombie.getWeakness());
    //     }
    // }
}
