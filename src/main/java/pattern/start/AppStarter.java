package pattern.start;

import pattern.prototype.Sushi;
import pattern.prototype.ingredients.*;
import pattern.prototype.sushiType.SushiType;
import pattern.prototype.sushiType.UkraineSpacy;
import pattern.prototype.sushiType.UkraineTobiko;

import java.util.ArrayList;
import java.util.List;

public class AppStarter {
    public static void main(String[] args) {
        List<Sushi> sushi = new ArrayList<>();
        List<Sushi> sushiCopy = new ArrayList<>();

        UkraineSpacy ukraineSpacy = new UkraineSpacy();
        ukraineSpacy.setSushiType(SushiType.SPACY);
        ukraineSpacy.setAvocadoType(AvocadoType.FRESH);
        ukraineSpacy.setCheeseType(CheeseType.KIEV);
        ukraineSpacy.setNoriType(NoriType.AMERICAN);
        ukraineSpacy.setRiceType(RiceType.UKRAINE);
        ukraineSpacy.setFishType(FishType.SEA);
        ukraineSpacy.setFresh(true);
        sushi.add(ukraineSpacy);

        UkraineSpacy anotherSushi = (UkraineSpacy) ukraineSpacy.clone();
        sushi.add(anotherSushi);

        UkraineTobiko ukraineTobiko = new UkraineTobiko();
        ukraineTobiko.setSushiType(SushiType.TOBIKO);
        ukraineTobiko.setWeight(300);
        ukraineTobiko.setRiceType(RiceType.UKRAINE);
        ukraineTobiko.setAvocadoType(AvocadoType.FRESH);
        ukraineTobiko.setFishType(FishType.RIVER);
        ukraineTobiko.setNoriType(NoriType.AMERICAN);
        ukraineTobiko.setCheeseType(CheeseType.KIEV);
        sushi.add(ukraineTobiko);

        cloneAndCompare(sushi, sushiCopy);
    }

    private static void cloneAndCompare(List<Sushi> sushiList, List<Sushi> shapesCopy) {
        for (Sushi sushi : sushiList) {
            shapesCopy.add((Sushi) sushi.clone());
        }

        for (int i = 0; i < sushiList.size(); i++) {
            if (sushiList.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Sushi are different objects (yay!)");
                if (sushiList.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Sushi objects are the same (booo!)");
            }
        }
    }
}