package pattern.factoryMethod.sushiType;

import pattern.factoryMethod.Sushi;

public class AmericanSpacy extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making American Spacy sushi");
    }
}
