package characters.totallyniceguys;

import characters.Avatar;
import items.SpellType;
import items.WeaponType;

public class Wizzard extends Avatar {
    private SpellType spell;
    private WeaponType weapon;

    public Wizzard(String name) {
        super(name);
        this.spell = SpellType.Currynight;
        this.weapon = WeaponType.Staff;
        this.hp -= 10;
        this.attack += 2;
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
