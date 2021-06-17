package pattern.factoryMethod.sushiType;

import pattern.factoryMethod.Sushi;

public class AmericanSivid extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making American Sivid sushi");
    }
}
