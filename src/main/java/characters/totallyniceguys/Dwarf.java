package characters.totallyniceguys;

import characters.Avatar;
import items.WeaponType;

public class Dwarf extends Avatar {

    private WeaponType weapon;

    public Dwarf(String name) {
        super(name);
        this.weapon = WeaponType.Hatchet;
        this.hp -= 10;
        this.attack += 2;
        this.attack += this.weapon.getValue();
        this.defence += 3;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
