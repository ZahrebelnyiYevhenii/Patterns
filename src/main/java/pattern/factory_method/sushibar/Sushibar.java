package pattern.factory_method.sushibar;

import pattern.factory_method.Sushi;
import pattern.factory_method.sushiType.SushiType;

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
