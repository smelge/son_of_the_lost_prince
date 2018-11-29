package items;

public enum SpellType {

    FireBall(6),
    Currynight(20),
    FrostRay(5),
    LightningBolt(4),
    PoisonSpray(4),
    HealingLight(-10),
    MagmaSplash(1000000);

    private final int value;

    SpellType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}


