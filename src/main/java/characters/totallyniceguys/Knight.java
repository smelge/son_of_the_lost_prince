package characters.totallyniceguys;

import characters.Avatar;

public class Knight extends Avatar {
    public Knight(String name){
        super(name);
        setStats();
    }

    protected void setStats(){
        this.hp += 20;
        this.attack +=2;
        this.defence += 6;
    }
}
