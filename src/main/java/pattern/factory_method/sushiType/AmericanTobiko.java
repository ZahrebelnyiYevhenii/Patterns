package pattern.factory_method.sushiType;

import pattern.factory_method.Sushi;

public class AmericanTobiko extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making American Tobiko sushi");
    }
}
