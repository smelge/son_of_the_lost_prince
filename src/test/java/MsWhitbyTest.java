import characters.baddudes.MsWhitby;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MsWhitbyTest {
    MsWhitby msWhitby;

    @Before
    public void before(){
        msWhitby = new MsWhitby("", WeaponType.Claws);
    }

    @Test
    public void hasName(){
        assertEquals("Ms Whitby. A nonagenarian murder powerhouse.",msWhitby.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(50,msWhitby.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(20,msWhitby.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(20,msWhitby.getDefence());
    }

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.Claws, msWhitby.getWeapon());
    }
}
