package pattern.factory;

import pattern.factory.sushiFactory.SimpleSushiFactory;
import pattern.factory.sushiType.*;

public class Sushibar {

    private final SimpleSushiFactory sushiFactory;

    public Sushibar(SimpleSushiFactory sushiFactory) {
        this.sushiFactory = sushiFactory;
    }

    public Sushi orderSushi(SushiType type){
        Sushi sushi = sushiFactory.createSushi(type);

        sushi.buyIngredients();
        sushi.makeSushi();
        sushi.serveOnPlate();

        System.out.println("Please take your sushi. Good buy");

        return sushi;
    }

}
