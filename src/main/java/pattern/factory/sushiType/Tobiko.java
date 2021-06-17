package pattern.factory.sushiType;

import pattern.factory.Sushi;

public class Tobiko extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making Tobiko sushi");
    }
}
