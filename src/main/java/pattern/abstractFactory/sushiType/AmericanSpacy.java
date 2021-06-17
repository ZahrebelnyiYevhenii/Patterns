package pattern.abstractFactory.sushiType;

import pattern.abstractFactory.Sushi;

public class AmericanSpacy extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making American Spacy sushi");
    }
}
