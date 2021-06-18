package pattern.prototype;


import pattern.prototype.ingredients.*;
import pattern.prototype.sushiType.SushiType;

public abstract class Sushi {
    private SushiType sushiType;
    private NoriType noriType;
    private RiceType riceType;
    private FishType fishType;
    private AvocadoType avocadoType;
    private CheeseType cheeseType;

    public Sushi() {
    }

    public Sushi(Sushi sushi) {
        this.sushiType = sushi.getSushiType();
        this.noriType = sushi.getNoriType();
        this.riceType = sushi.getRiceType();
        this.fishType = sushi.getFishType();
        this.avocadoType = sushi.getAvocadoType();
        this.cheeseType = sushi.getCheeseType();
    }


    public abstract Object clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Sushi)) return false;
        Sushi sushi2 = (Sushi) object2;
        return sushi2.sushiType.equals(sushiType) &&
                sushi2.noriType.equals(noriType) &&
                sushi2.riceType.equals(riceType) &&
                sushi2.fishType.equals(fishType) &&
                sushi2.avocadoType.equals(avocadoType) &&
                sushi2.cheeseType.equals(cheeseType);
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
}
