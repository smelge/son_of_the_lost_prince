package characters.baddudes;

import characters.Avatar;
import items.WeaponType;

public class Werehouse extends Avatar {

    public Werehouse(String name) {
        super(name);
        setStats();
    }

    protected void setStats(){
        this.name = "A Lycanthropic storage facility";
        this.hp += 900;
        this.attack -=10;
        this.defence -= 10;
    }
}
