import characters.baddudes.GiantDwarf;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantDwarfTest {

    GiantDwarf giantDwarf;

    @Before
    public void before(){
        giantDwarf = new GiantDwarf("");
    }

    @Test
    public void hasName(){
        assertEquals("A Giant Dwarf. He's angry because he's not sure if he's a profession or not.",giantDwarf.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(200,giantDwarf.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(17,giantDwarf.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(5,giantDwarf.getDefence());
    }

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.BattleAxe, giantDwarf.getWeapon());
    }
}
