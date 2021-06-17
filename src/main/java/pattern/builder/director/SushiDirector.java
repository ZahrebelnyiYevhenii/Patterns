package pattern.builder.director;

import pattern.builder.ingredients.*;
import pattern.builder.sushiBuilder.SushiBuilder;
import pattern.builder.sushiType.SushiType;

public class SushiDirector {
    public void constructSividSushi(SushiBuilder builder) {
        builder.setSushiType(SushiType.SIVID);
        builder.setNori(NoriType.UKRAINE);
        builder.setRice(RiceType.AMERICAN);
        builder.setFish(FishType.SEA);
        builder.setAvocado(AvocadoType.FRESH);
        builder.setCheese(CheeseType.KIEV);
    }

    public void constructSpacySushi(SushiBuilder builder) {
        builder.setSushiType(SushiType.SPACY);
        builder.setNori(NoriType.UKRAINE);
        builder.setRice(RiceType.AMERICAN);
        builder.setFish(FishType.RIVER);
        builder.setCheese(CheeseType.KIEV);
    }

    public void constructTobikoSushi(SushiBuilder builder) {
        builder.setSushiType(SushiType.TOBIKO);
        builder.setNori(NoriType.AMERICAN);
        builder.setRice(RiceType.UKRAINE);
        builder.setFish(FishType.SEA);
        builder.setAvocado(AvocadoType.ROTTEN);
    }
}
