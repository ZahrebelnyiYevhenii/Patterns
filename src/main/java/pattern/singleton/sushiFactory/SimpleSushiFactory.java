package pattern.singleton.sushiFactory;


import pattern.singleton.Sushi;
import pattern.singleton.sushiType.*;

public class SimpleSushiFactory {
    private static volatile SimpleSushiFactory simpleSushiFactory;
    private int numberEntity = 0;

    private SimpleSushiFactory() {
        numberEntity++;
    }

    public static SimpleSushiFactory getInstance() {
        if (simpleSushiFactory == null) {
            synchronized (SimpleSushiFactory.class) {
                if (simpleSushiFactory == null) {
                    simpleSushiFactory = new SimpleSushiFactory();
                }
            }
        }
        return simpleSushiFactory;
    }

    public Sushi createSushi(SushiType type) {
        Sushi sushi = null;

        switch (type) {
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

    public int getNumberEntity() {
        return numberEntity;
    }
}
