package pattern.factoryMethod.sushibarFactory;

import pattern.factoryMethod.Sushi;
import pattern.factoryMethod.sushiType.SushiType;

public abstract class Sushibar {

    public Sushi orderSushi(SushiType type) {
        Sushi sushi = createSushi(type);

        sushi.buyIngredients();
        sushi.makeSushi();
        sushi.serveOnPlate();

        System.out.println("Please take your sushi. Good buy");

        return sushi;
    }

    public abstract Sushi createSushi(SushiType type);

}
