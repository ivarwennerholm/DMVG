public class Decaf extends Beverage{

    public Decaf() {
        super.description = "koffeinfri kaffe";
    }
    @Override
    public int cost() {
        return 30;
    }

}
