public class RPGMage implements RPGCharacter{
    private String name;
    private int level;
    private int strength;

    public RPGMage(String name, int level, int strength) {
        this.name = name;
        this.level = level;
        this.strength = strength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int strength() {
        return strength;
    }

    @Override
    public void attack(Accessory accessory) {
        if(accessory instanceof AccStaff ) {
            System.out.println(name + " attack with a staff.");
        }else if(accessory instanceof AccSuperRing) {
            System.out.println("This accessory use for 'DEFENCE' only!.");
        }else if(accessory instanceof AccTalisman) {
            System.out.println("This accessory use for 'DEFENCE' only!.");
        }else{
            System.out.println("This accessory can only be used by a Warrior!.");
        }
    }

    @Override
    public void defend(Accessory accessory) {
        if(accessory instanceof AccSuperRing) {
            System.out.println(name + " protected with ring.");
        }if(accessory instanceof AccTalisman) {
            System.out.println(name + " protected with talisman.");
        }else if(accessory instanceof AccStaff) {
            System.out.println("This accessory use for 'ATTACK' only!.");
        }else{
            System.out.println("This accessory can only be used by a Warrior!.");
        }
    }

    @Override
    public void equipAccessory(Accessory accessory) {
        accessory.applyEffect(this);
    }

    public void increaseStrength(int amount) {
        this.strength += amount;
        System.out.println(name + "'s strength increased to " + strength);
    }
}
