package pattern.factory_method.sushiType;

import pattern.factory_method.Sushi;

public class UkraineTobiko extends Sushi {
    @Override
    public void makeSushi() {
        System.out.println("I making Ukraine Tobiko sushi");
    }
}
