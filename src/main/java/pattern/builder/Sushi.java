package pattern.builder;

import pattern.builder.ingredients.*;
import pattern.builder.sushiType.SushiType;

public class Sushi {
    private SushiType sushiType;
    private NoriType noriType;
    private RiceType riceType;
    private FishType fishType;
    private AvocadoType avocadoType;
    private CheeseType cheeseType;
    private double weight;

    public Sushi(SushiType sushiType, NoriType noriType, RiceType riceType, FishType fishType, AvocadoType avocadoType, CheeseType cheeseType) {
        this.sushiType = sushiType;
        this.noriType = noriType;
        this.riceType = riceType;
        this.fishType = fishType;
        this.avocadoType = avocadoType;
        this.cheeseType = cheeseType;
    }

    public SushiType getSushiType() {
        return sushiType;
    }

    public void setSushiType(SushiType sushiType) {
        this.sushiType = sushiType;
    }

    public NoriType getNoriType() {
        return noriType;
    }

    public void setNoriType(NoriType noriType) {
        this.noriType = noriType;
    }

    public RiceType getRiceType() {
        return riceType;
    }

    public void setRiceType(RiceType riceType) {
        this.riceType = riceType;
    }

    public FishType getFishType() {
        return fishType;
    }

    public void setFishType(FishType fishType) {
        this.fishType = fishType;
    }

    public AvocadoType getAvocadoType() {
        return avocadoType;
    }

    public void setAvocadoType(AvocadoType avocadoType) {
        this.avocadoType = avocadoType;
    }

    public CheeseType getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(CheeseType cheeseType) {
        this.cheeseType = cheeseType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
