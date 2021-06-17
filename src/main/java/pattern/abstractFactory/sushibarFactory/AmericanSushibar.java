package pattern.abstractFactory.sushibarFactory;

import pattern.abstractFactory.Roll;
import pattern.abstractFactory.Set;
import pattern.abstractFactory.Sushi;
import pattern.abstractFactory.rollType.*;
import pattern.abstractFactory.setType.AmericanCheese;
import pattern.abstractFactory.setType.AmericanDragon;
import pattern.abstractFactory.setType.AmericanPhila;
import pattern.abstractFactory.setType.SetType;
import pattern.abstractFactory.sushiType.*;

public class AmericanSushibar extends Sushibar {

    @Override
    public Sushi createSushi(SushiType type) {
        Sushi sushi = null;

        switch (type) {
            case SIVID:
                sushi = new AmericanSivid();
                break;
            case SPACY:
                sushi = new AmericanSpacy();
                break;
            case TOBIKO:
                sushi = new AmericanTobiko();
                break;
            case UNAGI:
                sushi = new AmericanUnagi();
                break;
        }

        return sushi;
    }

    @Override
    public Roll createRoll(RollType type) {
        Roll roll = null;

        switch (type) {
            case GREEN_DRAGON:
                roll = new AmericanGreenDragon();
                break;
            case PHILADELPHIA:
                roll = new AmericanPhiladelphia();
                break;
            case TEMPURA:
                roll = new AmericanTempura();
                break;
            case TOKIO:
                roll = new AmericanTokio();
                break;
        }

        return roll;
    }

    @Override
    public Set createSet(SetType type) {
        Set set = null;

        switch (type) {
            case CHEESE:
                set = new AmericanCheese();
                break;
            case DRAGON:
                set = new AmericanDragon();
                break;
            case PHILA:
                set = new AmericanPhila();
                break;
            case TEMPURA:
                set = new pattern.abstractFactory.setType.AmericanTempura();
                break;
        }

        return set;
    }
}
