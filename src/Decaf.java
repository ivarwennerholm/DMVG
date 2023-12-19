public class Decaf extends Beverage{

    public Decaf() {
        super.description = "Decaf";
    }
    @Override
    int cost() {
        return 30;
    }

}
