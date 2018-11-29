package characters.totallyniceguys;

import characters.Avatar;

public class Barbarian extends Avatar {

    public Barbarian(String name){
        super(name);
        setStats();
    }

    protected void setStats(){
        this.hp += 50;
        this.attack += 5;
        this.defence -= 2;
    }
}
