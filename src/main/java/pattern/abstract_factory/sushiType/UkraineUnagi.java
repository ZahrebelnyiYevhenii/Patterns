package pattern.abstract_factory.sushiType;

import pattern.abstract_factory.Sushi;

public class UkraineUnagi extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making Ukraine Unagi sushi");
    }
}
