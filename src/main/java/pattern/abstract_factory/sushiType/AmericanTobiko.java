package pattern.abstract_factory.sushiType;

import pattern.abstract_factory.Sushi;

public class AmericanTobiko extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making American Tobiko sushi");
    }
}
