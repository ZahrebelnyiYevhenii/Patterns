package pattern.abstractFactory.rollType;

import pattern.abstractFactory.Roll;

public class AmericanPhiladelphia extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making American Philadelphia roll");
    }
}
