package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Set;
import main.java.Zombie;
import main.java.ZombieType;
import main.java.ZombieWeaknessSearch;
import org.junit.Before;
import static org.junit.Assert.*;


public class ZombieWeaknessSearchTest {

    private ZombieWeaknessSearch zws;


    @Test
    public void testAddAndRetrieveZombieWeakness() {
        zws = new ZombieWeaknessSearch();
        zws.addZombie(new Zombie(ZombieType.WALKER));
        assertEquals("Fire", zws.getZombieWeakness("WALKER"));
    }

    @Test
    public void testCaseInsensitiveSearch() {
        zws = new ZombieWeaknessSearch();
        zws.addZombie(new Zombie(ZombieType.RUNNER));
        assertEquals("Ice", zws.getZombieWeakness("runner"));
    }

    @Test
    public void testGetZombies() {
        zws = new ZombieWeaknessSearch();
        zws.addZombie(new Zombie(ZombieType.WALKER));
        zws.addZombie(new Zombie(ZombieType.RUNNER));
        Set<Zombie> zombies = zws.getZombies();
        assertEquals(2, zombies.size());
    }
}
