package pattern.start;

import pattern.singleton.Sushibar;
import pattern.singleton.sushiFactory.SimpleSushiFactory;
import pattern.singleton.sushiType.SushiType;

public class AppStarter {
    public static void main(String[] args) {
        Sushibar sushibar = new Sushibar(SimpleSushiFactory.getInstance());
        sushibar.orderSushi(SushiType.SPACY);
        System.out.println(SimpleSushiFactory.getInstance().getNumberEntity());
        System.out.println(SimpleSushiFactory.getInstance().getNumberEntity());
        System.out.println(SimpleSushiFactory.getInstance().getNumberEntity());
    }

}