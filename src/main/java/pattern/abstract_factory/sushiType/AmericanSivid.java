package pattern.abstract_factory.sushiType;

import pattern.abstract_factory.Sushi;

public class AmericanSivid extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making American Sivid sushi");
    }
}
