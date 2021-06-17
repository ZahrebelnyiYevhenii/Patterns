package pattern.factoryMethod.sushiType;

import pattern.factoryMethod.Sushi;

public class UkraineTobiko extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making Ukraine Tobiko sushi");
    }
}
