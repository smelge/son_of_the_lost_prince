package characters.baddudes;

import characters.Avatar;

public class MsWhitby extends Avatar {

    public MsWhitby(String name){
        super(name);
        setStats();
    }

    protected void setStats(){
        this.name = "Ms Whitby. A nonagenarian murder powerhouse.";
        this.hp -= 50;
        this.attack += 10;
        this.defence += 10;
    }
}
