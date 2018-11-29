package characters.totallyniceguys;

import characters.Avatar;

public class Cleric  extends Avatar {

    public Cleric(String name) {
        super(name);
        setStats();
    }

    protected void setStats() {
        this.hp -= 10;
        this.attack -= 2;
        this.defence -= 1;
    }
}
