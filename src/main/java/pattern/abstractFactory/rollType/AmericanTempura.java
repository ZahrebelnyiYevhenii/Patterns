package pattern.abstractFactory.rollType;

import pattern.abstractFactory.Roll;

public class AmericanTempura extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making American Tempura roll");
    }
}
