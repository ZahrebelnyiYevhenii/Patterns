package pattern.abstractFactory.rollType;

import pattern.abstractFactory.Roll;

public class UkraineTokio extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making Ukraine Tokio roll");
    }
}
