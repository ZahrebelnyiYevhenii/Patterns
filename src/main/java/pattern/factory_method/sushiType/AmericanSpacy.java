package pattern.factory_method.sushiType;

import pattern.factory_method.Sushi;

public class AmericanSpacy extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making American Spacy sushi");
    }
}
