package characters.totallyniceguys;

import characters.Avatar;
import items.WeaponType;

public class Barbarian extends Avatar {
    private WeaponType weapon;
    private int enemyHp;
    private int enemyDefence;

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

    public int attack(Avatar enemy){
        int enemyHp = enemy.getHp();
        int enemyDefence = enemy.getDefence();

        if(this.attack > enemyDefence){
            // Enemy takes damage
            int damage = this.attack - enemyDefence;

            int damageResult = enemyHp - damage;
            if (damageResult < 0){
                damageResult = 0;
            }
            return damageResult;
        } else {
            return enemyHp;
        }
    }
}
