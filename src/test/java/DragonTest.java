import characters.baddudes.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("");
    }

    @Test
    public void hasName(){
        assertEquals("Adorable baby dragon",dragon.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(10,dragon.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(5,dragon.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(2, dragon.getDefence());
    }
}
