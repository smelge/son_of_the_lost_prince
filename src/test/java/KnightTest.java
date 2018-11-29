import characters.totallyniceguys.Knight;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Sir Peaches", WeaponType.BroadSword);
    }

    @Test
    public void hasName(){
        assertEquals("Sir Peaches",knight.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(120,knight.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(12,knight.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(16,knight.getDefence());
    }

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.BroadSword, knight.getWeapon());
    }
}
