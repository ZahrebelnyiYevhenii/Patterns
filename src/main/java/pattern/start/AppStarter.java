package pattern.start;

import pattern.factory_method.sushiType.SushiType;
import pattern.factory_method.sushibar.AmericanSushibar;
import pattern.factory_method.sushibar.Sushibar;

public class AppStarter {
    public static void main(String[] args) {
        Sushibar sushibar = new AmericanSushibar();
        sushibar.orderSushi(SushiType.SIVID);
    }
}