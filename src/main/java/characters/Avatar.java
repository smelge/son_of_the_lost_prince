package characters;

import items.WeaponType;

import java.util.ArrayList;

public abstract class Avatar {
    protected String name;
    protected int hp;
    protected int attack;
    protected int defence;
    protected int loot;

    public Avatar(String name){
        this.name = name;
        this.hp = 100;
        this.attack = 10;
        this.defence = 10;
        this.loot = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getHp() {
        return hp;
    }

    public int getLoot() {
        return loot;
    }
}