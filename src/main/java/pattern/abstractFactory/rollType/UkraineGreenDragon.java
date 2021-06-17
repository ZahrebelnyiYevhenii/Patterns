package pattern.abstractFactory.rollType;

import pattern.abstractFactory.Roll;

public class UkraineGreenDragon extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making Ukraine Green Dragon roll");
    }
}
