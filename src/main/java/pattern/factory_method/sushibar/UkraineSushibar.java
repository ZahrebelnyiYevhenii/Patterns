package pattern.factory_method.sushibar;

import pattern.factory_method.Sushi;
import pattern.factory_method.sushiType.*;

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
}
