package pattern.builder.sushiBuilder;

import pattern.builder.ingredients.*;
import pattern.builder.sushiType.SushiType;

public interface SushiBuilder {
    void setSushiType(SushiType type);
    void setNori(NoriType nori);
    void setRice(RiceType rice);
    void setFish(FishType fish);
    void setAvocado(AvocadoType avocado);
    void setCheese(CheeseType cheese);
}
