package pattern.factory.sushiType;

import pattern.factory.Sushi;

public class Spacy extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making Spacy sushi");
    }
}
