package pattern.abstract_factory.setType;

import pattern.abstract_factory.Set;

public class AmericanTempura extends Set {
    @Override
    public void makeSet() {
        System.out.println("I making American Tempura set");
    }
}
