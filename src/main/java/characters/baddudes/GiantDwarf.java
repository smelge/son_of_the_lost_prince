package characters.baddudes;

import characters.Avatar;
import items.WeaponType;

public class GiantDwarf extends Avatar {

    private WeaponType weapon;

    public GiantDwarf(String name, WeaponType weapon) {
        super(name);
        this.weapon = weapon;
        setStats();
    }

    protected void setStats(){
        this.name = "A Giant Dwarf. He's angry because he's not sure if he's a profession or not.";
        this.hp += 100;
        this.attack += 3;
        this.defence -= 5;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
