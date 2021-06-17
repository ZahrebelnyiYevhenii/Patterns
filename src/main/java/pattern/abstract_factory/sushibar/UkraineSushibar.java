package pattern.abstract_factory.sushibar;

import pattern.abstract_factory.Roll;
import pattern.abstract_factory.Set;
import pattern.abstract_factory.Sushi;
import pattern.abstract_factory.rollType.*;
import pattern.abstract_factory.setType.SetType;
import pattern.abstract_factory.setType.UkraineCheese;
import pattern.abstract_factory.setType.UkraineDragon;
import pattern.abstract_factory.setType.UkrainePhila;
import pattern.abstract_factory.sushiType.*;

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
                set = new pattern.abstract_factory.setType.UkraineTempura();
                break;
        }

        return set;
    }
}
