package pattern.start;

import pattern.factory.Sushibar;
import pattern.factory.sushiFactory.SimpleSushiFactory;
import pattern.factory.sushiType.SushiType;

public class AppStarter {
    public static void main(String[] args) {
        SimpleSushiFactory sushiFactory = new SimpleSushiFactory();
        Sushibar sushibar = new Sushibar(sushiFactory);
        sushibar.orderSushi(SushiType.TOBIKO);
    }
}
