public class Lab05 {
    public static void main(String[] args) {
        RPGCharacter warrior = new RPGWarrior("Arthur",2,50);
        RPGCharacter mage = new RPGMage("Merlin",2,50);
        printCharacterInfo(warrior,mage);

        Accessory sword = new AccSword();
        Accessory thunderBow = new AccThunderBow();
        Accessory shield = new AccShield();
        Accessory staff = new AccStaff();
        Accessory superRing = new AccSuperRing();
        Accessory talisman = new AccTalisman();


        warrior.attack(shield);
        warrior.attack(sword);
        warrior.equipAccessory(sword);
        warrior.defend(shield);
        warrior.equipAccessory(shield);
        warrior.attack(thunderBow);
        warrior.equipAccessory(thunderBow);
        warrior.attack(superRing);
        warrior.equipAccessory(superRing);

        System.out.println("------------------------------------------------");

        mage.defend(staff);
        mage.attack(staff);
        mage.equipAccessory(staff);
        mage.defend(talisman);
        mage.equipAccessory(talisman);
        mage.defend(superRing);
        mage.equipAccessory(superRing);
        mage.attack(sword);
        mage.equipAccessory(thunderBow);

    }

    public static void printCharacterInfo(RPGCharacter warrior,RPGCharacter mage) {
        System.out.println("Character Info : ");
        System.out.println("Name of the Character " + "'" + warrior.getName() + "'");
        System.out.println("Level : " + warrior.getLevel());
        System.out.println("Strength : " + warrior.strength());
        System.out.println("------------------------------------------------");
        System.out.println("Name of the Character " + "'" + mage.getName() + "'");
        System.out.println("Level : " + mage.getLevel());
        System.out.println("Strength : " + mage.strength());
        System.out.println("------------------------------------------------");
    }

}