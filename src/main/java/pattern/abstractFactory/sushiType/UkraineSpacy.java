package pattern.abstractFactory.sushiType;

import pattern.abstractFactory.Sushi;

public class UkraineSpacy extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making Ukraine Spacy sushi");
    }
}
