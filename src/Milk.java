public class Milk extends CondimentDecorator {

    Milk (Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    public int cost() {
        return this.decoratedBeverage.cost() + 10;
    }

    @Override
    public String getDescription() {
        return this.decoratedBeverage.getDescription() + " + mjölk";
    }

}