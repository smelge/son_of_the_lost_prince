package rooms;

import characters.Avatar;
import characters.baddudes.Dragon;
import characters.baddudes.GiantDwarf;
import characters.baddudes.MsWhitby;
import characters.baddudes.Werehouse;
import items.Loot;
import items.SpellType;
import items.WeaponType;

import java.util.ArrayList;
import java.util.Random;

public class Rooms {

    private Loot loot;
//    private IBadGuy badGuy;
    private boolean status;

    public Rooms()
    {
        this.loot = null;
//        this.badGuys = null;
        this.status  = false;
    }

    public Loot getLoot()
    {
        return this.loot;
    }

//    public ArrayList getBadguys()
//    {
//        return BadGuys;
//    }

    public boolean getStatus()
    {
        return this.status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public void setLoot(Loot loot)
    {
        this.loot = loot;
    }

    public void roomContents(){
        int roomRandom = new Random().nextInt(4);

        switch(roomRandom){
            case 0:
//                loot;
                System.out.println("LOOT");
                break;
            case 1:
//                Dragon dragon = new Dragon("", WeaponType.Claws, SpellType.FireBall);
                System.out.println("DRAGON");
                break;
            case 2:
//                GiantDwarf giantDwarf = new GiantDwarf();
                System.out.println("GIANT DWARF");
                break;
            case 3:
//                MsWhitby msWhitby = new MsWhitby();
                System.out.println("MS WHITBY");
                break;
            case 4:
//                Werehouse werehouse = new Werehouse();
                System.out.println("WEREHOUSE");
                break;
            default:
//                loot;
                System.out.println("LOOT");
                break;
        }
    }


//    public void setBadGuys(BadGuys badguys)
//    {
//        this.badGuys = badguys;
//    }






}
