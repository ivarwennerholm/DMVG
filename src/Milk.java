
public class Milk extends CondimentDecorator {


    Milk (Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    int cost() {
        return this.decoratedBeverage.cost() + 10;
    }
    @Override
    String getDescription() {
        return this.decoratedBeverage.getDescription() + " + Milk";
    }
}
