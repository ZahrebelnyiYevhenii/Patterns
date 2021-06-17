package pattern.builder.sushiType;

import pattern.abstractFactory.Sushi;

public class UkraineTobiko extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making Ukraine Tobiko sushi");
    }
}
