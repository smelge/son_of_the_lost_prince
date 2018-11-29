package characters.totallyniceguys;

import characters.Avatar;
import items.WeaponType;

public class Dwarf extends Avatar {

    private WeaponType weapon;

    public Dwarf(String name, WeaponType weapon) {
        super(name);
        this.weapon = weapon;
        setStats();
    }

    protected void setStats(){
        this.hp -= 10;
        this.attack += 2;
        this.defence += 3;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
