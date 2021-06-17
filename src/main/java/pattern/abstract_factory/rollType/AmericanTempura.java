package pattern.abstract_factory.rollType;

import pattern.abstract_factory.Roll;
import pattern.abstract_factory.Sushi;

public class AmericanTempura extends Roll {
    @Override
    public void makeRoll() {
        System.out.println("I making American Tempura roll");
    }
}
