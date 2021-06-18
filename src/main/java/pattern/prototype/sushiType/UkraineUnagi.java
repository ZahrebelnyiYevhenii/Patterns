package pattern.prototype.sushiType;


import pattern.prototype.Sushi;

public class UkraineUnagi extends Sushi {
    private int kkal;

    public UkraineUnagi() {
        super();
    }

    public UkraineUnagi(UkraineUnagi sushi) {
        super(sushi);
        this.kkal = sushi.getKkal();
    }

    @Override
    public Object clone() {
        return new UkraineUnagi(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof UkraineUnagi)) return false;

        UkraineUnagi ukraineUnagi = (UkraineUnagi) object2;
        return ukraineUnagi.kkal == kkal && super.equals(object2);
    }

    public int getKkal() {
        return kkal;
    }

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }
}
