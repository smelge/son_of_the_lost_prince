package items;

public enum WeaponType {

    Dagger(1),
    Hatchet(2),
    Club(2),
    BattleAxe(4),
    BroadSword(2),
    GreatSword(4),
    Staff(1),
    LightSabre(100000);

    private final int value;

    WeaponType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}


