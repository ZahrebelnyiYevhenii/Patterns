package pattern.abstract_factory.rollType;

import pattern.abstract_factory.Roll;

public class UkrainePhiladelphia extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making Ukraine Philadelphia roll");
    }
}
