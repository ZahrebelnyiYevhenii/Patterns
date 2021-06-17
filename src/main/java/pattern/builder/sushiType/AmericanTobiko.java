package pattern.builder.sushiType;

import pattern.abstractFactory.Sushi;

public class AmericanTobiko extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making American Tobiko sushi");
    }
}
