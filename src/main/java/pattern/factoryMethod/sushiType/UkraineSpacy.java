package pattern.factoryMethod.sushiType;

import pattern.factoryMethod.Sushi;

public class UkraineSpacy extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making Ukraine Spacy sushi");
    }
}
