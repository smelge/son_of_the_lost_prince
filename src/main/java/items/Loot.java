package items;

public enum Loot {

    GEM(50),
    GOLD(10),
    DIAMOND(100),
    SILVER(1),
    JEWELERY(1000);

    private final int value;

    Loot(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

}
