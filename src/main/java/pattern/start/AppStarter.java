package pattern.start;

import pattern.builder.DescriptionSushi;
import pattern.builder.Sushi;
import pattern.builder.director.SushiDirector;
import pattern.builder.sushiBuilder.DescriptionSushiBuilder;
import pattern.builder.sushiBuilder.FoodSushiBuilder;

public class AppStarter {
    public static void main(String[] args) {
        SushiDirector sushiDirector = new SushiDirector();

        FoodSushiBuilder sushiBuilder = new FoodSushiBuilder();
        sushiDirector.constructSpacySushi(sushiBuilder);

        Sushi sushi = sushiBuilder.getSushi();
        System.out.println("Sushi make: " + sushi.getSushiType());

        DescriptionSushiBuilder descriptionSushiBuilder = new DescriptionSushiBuilder();
        sushiDirector.constructSpacySushi(descriptionSushiBuilder);

        DescriptionSushi descriptionSushi = descriptionSushiBuilder.getSushi();
        System.out.println("Sushi description make: " + descriptionSushi.read());
    }
}