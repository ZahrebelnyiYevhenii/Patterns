package pattern.prototype.sushiType;

import pattern.prototype.Sushi;

public class UkraineSpacy extends Sushi {
    private boolean fresh;

    public UkraineSpacy() {
    }

    public UkraineSpacy(UkraineSpacy sushi) {
        super(sushi);
        this.fresh = sushi.isFresh();
    }

    @Override
    public Object clone() {
        return new UkraineSpacy(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof UkraineSpacy)) return false;

        UkraineSpacy ukraineSpacy = (UkraineSpacy) object2;
        return ukraineSpacy.fresh == fresh && super.equals(object2);
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
}
