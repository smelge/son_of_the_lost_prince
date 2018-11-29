import characters.totallyniceguys.Wizzard;
import items.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizzardTest {
    Wizzard wizzard;

    @Before
    public void before(){
        wizzard = new Wizzard("Rincewind", SpellType.Currynight);
    }

    @Test
    public void hasName(){
        assertEquals("Rincewind",wizzard.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(90,wizzard.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(12,wizzard.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(9,wizzard.getDefence());
    }

    @Test
    public void hasWeapon(){
        assertEquals(SpellType.Currynight, wizzard.getSpell());
    }
}
