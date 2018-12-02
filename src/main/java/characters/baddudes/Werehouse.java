package characters.baddudes;

import characters.Avatar;
import items.WeaponType;

public class Werehouse extends Avatar {

    private WeaponType weapon;

    public Werehouse(String name) {
        super(name);
        this.name = "A Lycanthropic storage facility";
        this.weapon = WeaponType.Splinters;
        this.hp += 900;
        this.attack -=10;
        this.attack += this.weapon.getValue();
        this.defence -= 10;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
