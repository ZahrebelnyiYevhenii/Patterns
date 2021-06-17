package pattern.abstractFactory.rollType;

import pattern.abstractFactory.Roll;

public class UkraineTempura extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making Ukraine Tempura roll");
    }
}
