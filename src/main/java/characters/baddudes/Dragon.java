package characters.baddudes;

import behaviours.IBadGuy;
import characters.Avatar;
import items.SpellType;
import items.WeaponType;

public class Dragon extends Avatar  {
    private SpellType spell;
    private WeaponType weapon;

    public Dragon(String name) {
        super(name);
        this.weapon = WeaponType.Claws;
        this.spell = SpellType.FireBall;
        this.name = "Adorable baby dragon";
        this.hp -= 90;
        this.attack -= 5;
        this.attack += this.weapon.getValue();
        this.defence -= 8;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

//    public void attack(){
//        getWeapon();
//
//    }
}
