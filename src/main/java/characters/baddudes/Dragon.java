package characters.baddudes;

import characters.Avatar;

public class Dragon extends Avatar {

    public Dragon(String name){
        super(name);
        setStats();
    }

    protected void setStats(){
        this.name = "Adorable baby dragon";
        this.hp -= 90;
        this.attack -= 5;
        this.defence -= 8;
    }
}
