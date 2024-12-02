public class AccSuperRing implements Accessory{

    @Override
    public void applyEffect(RPGCharacter character) {
        if (character instanceof RPGMage mage) {
            mage.increaseStrength((int) (1.2 * character.getLevel()));
        } else {
            System.out.println("Super Ring can only be used by a Mage!.");
        }
    }

}
