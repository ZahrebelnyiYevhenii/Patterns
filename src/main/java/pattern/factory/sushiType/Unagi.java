package pattern.factory.sushiType;

import pattern.factory.Sushi;

public class Unagi extends Sushi {
    @Override
    public void makeSushi() {
        super.makeSushi();
        System.out.println("I making Unagi sushi");
    }
}
