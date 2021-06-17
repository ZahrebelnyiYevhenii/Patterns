package pattern.start;

import pattern.abstract_factory.rollType.RollType;
import pattern.abstract_factory.setType.SetType;
import pattern.abstract_factory.sushiType.SushiType;
import pattern.abstract_factory.sushibar.Sushibar;
import pattern.abstract_factory.sushibar.UkraineSushibar;

public class AppStarter {
    public static void main(String[] args) {
        Sushibar sushibar = new UkraineSushibar();

        sushibar.orderSushi(SushiType.SPACY);
        sushibar.orderRoll(RollType.GREEN_DRAGON);
        sushibar.orderSet(SetType.CHEESE);
    }
}