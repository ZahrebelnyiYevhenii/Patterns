package pattern.abstractFactory.rollType;

import pattern.abstractFactory.Roll;

public class AmericanGreenDragon extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making American Green Dragon roll");
    }
}
