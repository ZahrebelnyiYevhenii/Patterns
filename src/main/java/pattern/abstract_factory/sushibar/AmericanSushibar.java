package pattern.abstract_factory.sushibar;

import pattern.abstract_factory.Roll;
import pattern.abstract_factory.Set;
import pattern.abstract_factory.Sushi;
import pattern.abstract_factory.rollType.*;
import pattern.abstract_factory.setType.AmericanCheese;
import pattern.abstract_factory.setType.AmericanDragon;
import pattern.abstract_factory.setType.AmericanPhila;
import pattern.abstract_factory.setType.SetType;
import pattern.abstract_factory.sushiType.*;

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
                set = new pattern.abstract_factory.setType.AmericanTempura();
                break;
        }

        return set;
    }
}
