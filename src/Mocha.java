public class Mocha extends CondimentDecorator {


    Mocha (Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    public int cost() {
        return this.decoratedBeverage.cost() + 15;
    }
    @Override
    public String getDescription() {
        return this.decoratedBeverage.getDescription() + " + mocha";
    }
}
