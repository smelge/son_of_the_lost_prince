package characters.baddudes;

import characters.Avatar;
import items.WeaponType;

public class MsWhitby extends Avatar {

    private WeaponType weapon;

    public MsWhitby(String name) {
        super(name);
        this.weapon = WeaponType.KnittingNeedles;
        this.name = "Ms Whitby. A nonagenarian murder powerhouse.";
        this.hp -= 50;
        this.attack += 10;
        this.attack += this.weapon.getValue();
        this.defence += 10;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
