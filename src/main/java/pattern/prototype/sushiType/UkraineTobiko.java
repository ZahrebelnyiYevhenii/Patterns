package pattern.prototype.sushiType;


import pattern.prototype.Sushi;

public class UkraineTobiko extends Sushi {
    private double weight;

    public UkraineTobiko() {
    }

    public UkraineTobiko(UkraineTobiko sushi) {
        super(sushi);
        this.weight = sushi.getWeight();
    }

    @Override
    public Object clone() {
        return new UkraineTobiko(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof UkraineTobiko)) return false;

        UkraineTobiko ukraineTobiko = (UkraineTobiko) object2;
        return ukraineTobiko.weight == weight && super.equals(object2);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
