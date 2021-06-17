package pattern.factory.sushiFactory;

import pattern.factory.Sushi;
import pattern.factory.sushiType.*;

public class SimpleSushiFactory {
    public Sushi createSushi(SushiType type){
        Sushi sushi = null;

        switch (type){
            case SIVID:
                sushi = new Sivid();
                break;
            case SPACY:
                sushi = new Spacy();
                break;
            case TOBIKO:
                sushi = new Tobiko();
                break;
            case UNAGI:
                sushi = new Unagi();
                break;
        }

        return sushi;
    }
}
