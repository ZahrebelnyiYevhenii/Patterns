package pattern.abstractFactory.sushibarFactory;

import pattern.abstractFactory.Roll;
import pattern.abstractFactory.Set;
import pattern.abstractFactory.Sushi;
import pattern.abstractFactory.rollType.RollType;
import pattern.abstractFactory.setType.SetType;
import pattern.abstractFactory.sushiType.SushiType;

public abstract class Sushibar {

    public Sushi orderSushi(SushiType type) {
        Sushi sushi = createSushi(type);

        sushi.buyIngredients();
        sushi.makeSushi();
        sushi.serveOnPlate();

        System.out.println("Please take your sushi. Good buy");

        return sushi;
    }

    public Roll orderRoll(RollType type) {
        Roll roll = createRoll(type);

        roll.buyIngredients();
        roll.makeRoll();
        roll.serveOnPlate();

        System.out.println("Please take your roll. Good buy");

        return roll;
    }

    public Set orderSet(SetType type) {
        Set set = createSet(type);

        set.buyIngredients();
        set.makeSet();
        set.serveOnPlate();

        System.out.println("Please take your set. Good buy");

        return set;
    }

    protected abstract Sushi createSushi(SushiType type);

    protected abstract Roll createRoll(RollType type);

    protected abstract Set createSet(SetType type);
}
