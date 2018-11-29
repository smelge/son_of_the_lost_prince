package characters.totallyniceguys;

import characters.Avatar;
import items.WeaponType;

public class Knight extends Avatar {
    private WeaponType weapon;
    public Knight(String name, WeaponType weapon) {
        super(name);
        this.weapon = weapon;
        setStats();
    }

    protected void setStats(){
        this.hp += 20;
        this.attack +=2;
        this.defence += 6;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
