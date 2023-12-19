public class Mocha extends CondimentDecorator {


    Mocha (Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    int cost() {
        return this.decoratedBeverage.cost() + 15;
    }
    @Override
    String getDescription() {
        return this.decoratedBeverage.getDescription() + " + Mocha";
    }
}
