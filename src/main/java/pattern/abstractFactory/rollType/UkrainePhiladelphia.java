package pattern.abstractFactory.rollType;

import pattern.abstractFactory.Roll;

public class UkrainePhiladelphia extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making Ukraine Philadelphia roll");
    }
}
