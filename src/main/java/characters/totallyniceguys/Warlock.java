package characters.totallyniceguys;

import characters.Avatar;

public class Warlock extends Avatar {

    public Warlock(String name) {
        super(name);
        setStats();
    }

    protected void setStats() {
        this.hp -= 10;
        this.attack += 0;
        this.defence -= 1;
    }
}
