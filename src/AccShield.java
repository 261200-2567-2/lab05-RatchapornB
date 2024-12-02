public class AccShield implements Accessory{
    @Override
    public void applyEffect(RPGCharacter character) {
        if (character instanceof RPGWarrior warrior) {
            warrior.increaseStrength((int) (1.8 * character.getLevel()));
        } else {
            System.out.println("Shield can only be used by a Warrior!.");
        }
    }
}
