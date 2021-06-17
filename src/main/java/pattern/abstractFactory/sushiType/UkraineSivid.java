package pattern.abstractFactory.sushiType;

import pattern.abstractFactory.Sushi;

public class UkraineSivid extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making Ukraine Sivid sushi");
    }
}
