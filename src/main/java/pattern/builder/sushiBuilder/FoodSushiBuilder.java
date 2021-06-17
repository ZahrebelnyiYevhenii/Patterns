package pattern.builder.sushiBuilder;

import pattern.builder.Sushi;
import pattern.builder.ingredients.*;
import pattern.builder.sushiType.SushiType;

public class FoodSushiBuilder implements SushiBuilder {
    private SushiType sushiType;
    private NoriType noriType;
    private RiceType riceType;
    private FishType fishType;
    private AvocadoType avocadoType;
    private CheeseType cheeseType;

    @Override
    public void setSushiType(SushiType type) {
        this.sushiType = type;
    }

    @Override
    public void setNori(NoriType nori) {
        this.noriType = nori;
    }

    @Override
    public void setRice(RiceType rice) {
        this.riceType = rice;
    }

    @Override
    public void setFish(FishType fish) {
        this.fishType = fish;
    }

    @Override
    public void setAvocado(AvocadoType avocado) {
        this.avocadoType = avocado;
    }

    @Override
    public void setCheese(CheeseType cheese) {
        this.cheeseType = cheese;
    }

    public Sushi getSushi() {
        return new Sushi(sushiType, noriType, riceType, fishType, avocadoType, cheeseType);
    }
}
