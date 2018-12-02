package characters.totallyniceguys;

import characters.Avatar;
import items.SpellType;
import items.WeaponType;

public class Warlock extends Avatar {

    private SpellType spell;
    private WeaponType weapon;

    public Warlock(String name) {
        super(name);
        this.spell = SpellType.FrostRay;
        this.weapon = WeaponType.Dagger;
        this.hp -= 10;
        this.attack += 0;
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
