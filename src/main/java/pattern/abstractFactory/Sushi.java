package pattern.abstractFactory;

public abstract class Sushi {
    public void buyIngredients() {
        System.out.println("I have ingredients");
    }

    public void makeSushi() {
        System.out.println("I making sushi");
    }

    public void serveOnPlate() {
        System.out.println("I serve sushi");
    }
}
