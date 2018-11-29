package characters.totallyniceguys;

import characters.Avatar;
import items.SpellType;
import items.WeaponType;

public class Warlock extends Avatar {

    private SpellType spell;

    public Warlock(String name, SpellType spell) {
        super(name);
        this.spell = spell;
        setStats();
    }

    protected void setStats() {
        this.hp -= 10;
        this.attack += 0;
        this.defence -= 1;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }
}
