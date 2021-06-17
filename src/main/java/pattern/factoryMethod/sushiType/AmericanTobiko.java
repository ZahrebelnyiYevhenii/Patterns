package pattern.factoryMethod.sushiType;

import pattern.factoryMethod.Sushi;

public class AmericanTobiko extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making American Tobiko sushi");
    }
}
