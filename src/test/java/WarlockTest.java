import characters.totallyniceguys.Warlock;
import items.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Sharon the Sparkly");
    }

    @Test
    public void hasName(){
        assertEquals("Sharon the Sparkly",warlock.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(90,warlock.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(12,warlock.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(9,warlock.getDefence());
    }

    @Test
    public void hasWeapon(){
        assertEquals(SpellType.FrostRay, warlock.getSpell());
    }
}
