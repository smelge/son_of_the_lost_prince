package characters.totallyniceguys;

import characters.Avatar;
import items.SpellType;
import items.WeaponType;

public class Cleric  extends Avatar {
    private SpellType spell;
    private WeaponType weapon;

    public Cleric(String name) {
        super(name);
        this.spell = SpellType.HealingLight;
        this.weapon = WeaponType.Staff;
        this.hp -= 10;
        this.attack -= 2;
        this.attack += this.weapon.getValue();
        this.defence -= 1;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }
}
