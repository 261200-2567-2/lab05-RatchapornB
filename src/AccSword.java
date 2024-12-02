public class AccSword implements Accessory{
    @Override
    public void applyEffect(RPGCharacter character) {
        if (character instanceof RPGWarrior warrior) {
            warrior.increaseStrength((int) (1.2 * character.getLevel()));
        } else {
            System.out.println("Sword can only be used by a Warrior!.");
        }
    }
}
