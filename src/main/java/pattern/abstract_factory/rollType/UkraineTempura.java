package pattern.abstract_factory.rollType;

import pattern.abstract_factory.Roll;

public class UkraineTempura extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making Ukraine Tempura roll");
    }
}
