package characters.baddudes;

import characters.Avatar;

public class GiantDwarf extends Avatar {

    public GiantDwarf(String name){
        super(name);
        setStats();
    }

    protected void setStats(){
        this.name = "A Giant Dwarf. He's angry because he's not sure if he's a profession or not.";
        this.hp += 100;
        this.attack += 3;
        this.defence -= 5;
    }
}
