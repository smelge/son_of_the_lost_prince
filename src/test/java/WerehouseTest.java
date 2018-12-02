import characters.baddudes.Werehouse;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WerehouseTest {
    Werehouse werehouse;

    @Before
    public void before(){
        werehouse = new Werehouse("");
    }

    @Test
    public void hasName(){
        assertEquals("A Lycanthropic storage facility",werehouse.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(1000,werehouse.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(1,werehouse.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(0,werehouse.getDefence());
    }

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.Splinters, werehouse.getWeapon());
    }
}
