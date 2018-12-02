package items;

public enum WeaponType {

    Dagger(2),
    Splinters(1),
    Hatchet(2),
    Club(1),
    BattleAxe(4),
    BroadSword(3),
    GreatSword(4),
    Staff(1),
    Claws(10),
    KnittingNeedles(5),
    LightSabre(100000);

    private final int value;

    WeaponType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}


