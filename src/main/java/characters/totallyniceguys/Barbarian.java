package characters.totallyniceguys;

import characters.Avatar;
import items.WeaponType;

public class Barbarian extends Avatar {
    private WeaponType weapon;

    public Barbarian(String name){
        super(name);
        this.weapon = WeaponType.BattleAxe;
        this.hp += 50;
        this.attack += 5;
        this.attack += this.weapon.getValue();
        this.defence -= 2;
    }

    public WeaponType getWeapon(){
        return this.weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }


}
