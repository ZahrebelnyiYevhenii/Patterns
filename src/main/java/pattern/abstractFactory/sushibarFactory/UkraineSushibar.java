package pattern.abstractFactory.sushibarFactory;

import pattern.abstractFactory.Roll;
import pattern.abstractFactory.Set;
import pattern.abstractFactory.Sushi;
import pattern.abstractFactory.rollType.*;
import pattern.abstractFactory.setType.SetType;
import pattern.abstractFactory.setType.UkraineCheese;
import pattern.abstractFactory.setType.UkraineDragon;
import pattern.abstractFactory.setType.UkrainePhila;
import pattern.abstractFactory.sushiType.*;

public class UkraineSushibar extends Sushibar {

    @Override
    public Sushi createSushi(SushiType type) {
        Sushi sushi = null;

        switch (type) {
            case SIVID:
                sushi = new UkraineSivid();
                break;
            case SPACY:
                sushi = new UkraineSpacy();
                break;
            case TOBIKO:
                sushi = new UkraineTobiko();
                break;
            case UNAGI:
                sushi = new UkraineUnagi();
                break;
        }

        return sushi;
    }

    @Override
    public Roll createRoll(RollType type) {
        Roll roll = null;

        switch (type) {
            case GREEN_DRAGON:
                roll = new UkraineGreenDragon();
                break;
            case PHILADELPHIA:
                roll = new UkrainePhiladelphia();
                break;
            case TEMPURA:
                roll = new UkraineTempura();
                break;
            case TOKIO:
                roll = new UkraineTokio();
                break;
        }

        return roll;
    }

    @Override
    public Set createSet(SetType type) {
        Set set = null;

        switch (type) {
            case CHEESE:
                set = new UkraineCheese();
                break;
            case DRAGON:
                set = new UkraineDragon();
                break;
            case PHILA:
                set = new UkrainePhila();
                break;
            case TEMPURA:
                set = new pattern.abstractFactory.setType.UkraineTempura();
                break;
        }

        return set;
    }
}
