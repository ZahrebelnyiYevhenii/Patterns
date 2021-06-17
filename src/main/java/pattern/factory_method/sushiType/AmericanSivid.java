package pattern.factory_method.sushiType;

import pattern.factory_method.Sushi;

public class AmericanSivid extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making American Sivid sushi");
    }
}
