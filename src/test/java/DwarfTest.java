import characters.totallyniceguys.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Steve");
    }

    @Test
    public void hasName(){
        assertEquals("Steve",dwarf.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(90,dwarf.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(12,dwarf.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(13,dwarf.getDefence());
    }
}
