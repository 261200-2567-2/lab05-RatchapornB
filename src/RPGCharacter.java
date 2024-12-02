public interface RPGCharacter {
    String getName();
    int getLevel();
    int strength();
    void attack(Accessory accessory);
    void defend(Accessory accessory);
    void equipAccessory(Accessory accessory);
}

