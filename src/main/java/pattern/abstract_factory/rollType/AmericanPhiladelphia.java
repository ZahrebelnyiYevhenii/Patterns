package pattern.abstract_factory.rollType;

import pattern.abstract_factory.Roll;

public class AmericanPhiladelphia extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making American Philadelphia roll");
    }
}
