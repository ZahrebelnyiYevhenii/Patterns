package pattern.factory_method.sushiType;

import pattern.factory_method.Sushi;

public class UkraineUnagi extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making Ukraine Unagi sushi");
    }
}
