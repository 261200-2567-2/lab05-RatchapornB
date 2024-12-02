public class AccStaff implements Accessory{
    @Override
    public void applyEffect(RPGCharacter character) {
        if (character instanceof RPGMage mage) {
            mage.increaseStrength((int) (1.8 * character.getLevel()));
        } else {
            System.out.println("Staff can only be used by a Mage!.");
        }
    }
}
