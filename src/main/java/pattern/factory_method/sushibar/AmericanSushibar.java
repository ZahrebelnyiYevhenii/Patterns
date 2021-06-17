package pattern.factory_method.sushibar;

import pattern.factory_method.Sushi;
import pattern.factory_method.sushiType.*;

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
}
