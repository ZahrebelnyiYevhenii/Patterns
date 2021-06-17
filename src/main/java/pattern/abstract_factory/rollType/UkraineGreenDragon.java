package pattern.abstract_factory.rollType;

import pattern.abstract_factory.Roll;

public class UkraineGreenDragon extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making Ukraine Green Dragon roll");
    }
}
