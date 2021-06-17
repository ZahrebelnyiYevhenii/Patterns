package pattern.factoryMethod.sushiType;

import pattern.factoryMethod.Sushi;

public class UkraineSivid extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making Ukraine Sivid sushi");
    }
}
