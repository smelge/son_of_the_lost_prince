import characters.totallyniceguys.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("Dr Killinger");
    }

    @Test
    public void hasName(){
        assertEquals("Dr Killinger",cleric.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(90,cleric.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(8,cleric.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(9,cleric.getDefence());
    }
}
