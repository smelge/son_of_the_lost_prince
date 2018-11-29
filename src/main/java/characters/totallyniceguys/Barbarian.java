package characters.totallyniceguys;

import characters.Avatar;
import items.WeaponType;

public class Barbarian extends Avatar {
    private WeaponType weapon;

    public Barbarian(String name, WeaponType weapon){
        super(name);
        this.weapon = weapon;
        setStats();
    }

    protected void setStats(){
        this.hp += 50;
        this.attack += 5;
        this.defence -= 2;
    }

    public WeaponType getWeapon(){
        return this.weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
