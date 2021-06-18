package pattern.prototype.sushiType;


import pattern.prototype.Sushi;

public class UkraineSivid extends Sushi {
    private double price;

    public UkraineSivid() {
    }

    public UkraineSivid(UkraineSivid sushi) {
        super(sushi);
        this.price = sushi.getPrice();
    }

    @Override
    public Object clone() {
        return new UkraineSivid(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof UkraineSivid)) return false;

        UkraineSivid ukraineSivid = (UkraineSivid) object2;
        return ukraineSivid.price == price && super.equals(object2);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
