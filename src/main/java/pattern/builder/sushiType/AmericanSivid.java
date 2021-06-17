package pattern.builder.sushiType;

import pattern.abstractFactory.Sushi;

public class AmericanSivid extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making American Sivid sushi");
    }
}
