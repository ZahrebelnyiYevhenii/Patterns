package pattern.builder.sushiType;

import pattern.abstractFactory.Sushi;

public class UkraineUnagi extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making Ukraine Unagi sushi");
    }
}
