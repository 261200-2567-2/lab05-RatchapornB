public class RPGWarrior implements RPGCharacter {
    private String name;
    private int level;
    private int strength;

    public RPGWarrior(String name, int level, int strength) {
        this.name = name;
        this.level = level;
        this.strength = strength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLevel(){
        return level;
    }

    @Override
    public int strength() {
        return strength;
    }

    @Override
    public void attack(Accessory accessory) {
        if(accessory instanceof AccSword ) {
            System.out.println(name + " swings a sword.");
        }if(accessory instanceof AccThunderBow ) {
            System.out.println(name + " shoot a thunder bow.");
        }else if(accessory instanceof AccShield) {
            System.out.println("This accessory use for 'DEFENCE' only!.");
        }else{
            System.out.println("This accessory can only be used by a Mage!.");
        }
    }

    @Override
    public void defend(Accessory accessory) {
        if(accessory instanceof AccShield ) {
            System.out.println(name + " raises a shield.");
        }else if(accessory instanceof AccSword) {
            System.out.println("This accessory use for 'ATTACK' only!.");
        }else if(accessory instanceof AccThunderBow) {
            System.out.println("This accessory use for 'ATTACK' only!.");
        }else{
            System.out.println("This accessory can only be used by a Mage!.");
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