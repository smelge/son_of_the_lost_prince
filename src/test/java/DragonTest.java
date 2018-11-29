import characters.baddudes.Dragon;
import items.SpellType;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("", WeaponType.Claws, SpellType.FireBall);
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

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.Claws, dragon.getWeapon());
    }

    @Test
    public void hasSpell(){
        assertEquals(SpellType.FireBall, dragon.getSpell());
    }
}
