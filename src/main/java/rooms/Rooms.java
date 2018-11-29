package rooms;

import items.Loot;

import java.util.ArrayList;

public class Rooms {

    private Loot loot;
//    private BadGuys badGuys;
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

//    public void setBadGuys(BadGuys badguys)
//    {
//        this.badGuys = badguys;
//    }






}
